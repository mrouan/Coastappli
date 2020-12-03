package osirisc.coastappli;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import osirisc.coastappli.photoCaptureErosion.SectionsPagerAdapterPhotoCaptureErosion;

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

        SectionsPagerAdapterPhotoCaptureErosion sectionsPagerAdapterPhotoCaptureErosion = new SectionsPagerAdapterPhotoCaptureErosion(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager_photo_capture_erosion);
        viewPager.setAdapter(sectionsPagerAdapterPhotoCaptureErosion);
        TabLayout tabs = findViewById(R.id.tabs_photo_capture_erosion);
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
}
