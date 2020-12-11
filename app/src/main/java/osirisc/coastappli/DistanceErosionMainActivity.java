package osirisc.coastappli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import osirisc.coastappli.Database.DatabaseAssistant;
import osirisc.coastappli.Database.MeasureErosionDistance;
import osirisc.coastappli.distanceErosion.SectionsPagerAdapterDistanceErosion;

public class DistanceErosionMainActivity extends AppCompatActivity {

    // These are the information of the marker which was clicked on
    private Double markerLatitude;
    private Double markerLongitude;
    private String nameBeach;
    private String nameTown;
    private String coastType;
    private String INEC;
    private int erosionPhotoCaptureBool;
    private int erosionDistanceMeasureBool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // We first create the activity with it's 2 tabs
        super.onCreate(savedInstanceState);
        setContentView(R.layout.distance_erosion_main_activity);

        SectionsPagerAdapterDistanceErosion sectionsPagerAdapterDistanceErosion = new SectionsPagerAdapterDistanceErosion(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager_distance_erosion);
        viewPager.setAdapter(sectionsPagerAdapterDistanceErosion);
        TabLayout tabs = findViewById(R.id.tabs_distance_erosion);
        tabs.setupWithViewPager(viewPager);

        // We recover the data of the marker which stored in the extras part of the Intent used to launch this activity
        Bundle extras = getIntent().getExtras();
        if(extras !=null)
        {
            markerLatitude = extras.getDouble("markerLatitude");
            markerLongitude = extras.getDouble("markerLongitude");
            nameBeach = extras.getString("nameBeach");
            nameTown = extras.getString("nameTown");
            coastType = extras.getString("coastType");
            INEC = extras.getString("INEC");
            erosionPhotoCaptureBool = extras.getInt("erosionPhotoCaptureBool");
            erosionDistanceMeasureBool = extras.getInt("erosionDistanceMeasureBool");
        }

    }

    /**
     * This function is launched when the validate button is clicked on
     * It creates and pushes the new measure to the database
     * @param view
     */
    public void validateDistance(View view){
        // We create the new measure
        MeasureErosionDistance measure = new MeasureErosionDistance();
        measure.setMarkerLatitude(markerLatitude);
        measure.setMarkerLongitude(markerLongitude);
        measure.setDate(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date()));
        measure.setTime(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()));
        measure.setUser(getResources().getString(R.string.notImplemented));
        if(view.findViewById(R.id.metre_use).isSelected()){
            TextView distanceText = (TextView) view.findViewById(R.id.distance_metre);
            measure.setDistance(Double.parseDouble(distanceText.getText().toString()));
        }
        else if (view.findViewById(R.id.step_use).isSelected()){
            // For now, the step factor isn't implemented in the profile section
            // thus, we use an average value (0.75) to calculate the distance.
            TextView stepText = (TextView) view.findViewById(R.id.distance_step);
            measure.setDistance(Double.parseDouble(stepText.getText().toString())*0.75);
        }


        // We push the ne measure in the database
        DatabaseAssistant databaseAssistant = new DatabaseAssistant(this);
        databaseAssistant.addDistanceMeasure(measure);

        // We then finish this activity and reload (finish and restart) the previous LocationMainActivity in order to update it with the new data
        DistanceErosionMainActivity.this.finish();
        LocationMainActivity.getInstance().finish();

        Intent myPlaceIntent= new Intent(this, LocationMainActivity.class);
        myPlaceIntent.putExtra("markerLatitude", markerLatitude);
        myPlaceIntent.putExtra("markerLongitude", markerLongitude);
        myPlaceIntent.putExtra("nameBeach", nameBeach);
        myPlaceIntent.putExtra("nameTown", nameTown);
        myPlaceIntent.putExtra("coastType", coastType);
        myPlaceIntent.putExtra("INEC", INEC);
        myPlaceIntent.putExtra("erosionPhotoCaptureBool", erosionPhotoCaptureBool);
        myPlaceIntent.putExtra("erosionDistanceMeasureBool", erosionDistanceMeasureBool);
        DistanceErosionMainActivity.this.startActivity(myPlaceIntent);

    }

    public Double getMarkerLatitude() { return markerLatitude; }

    public Double getMarkerLongitude() { return markerLongitude; }

}
