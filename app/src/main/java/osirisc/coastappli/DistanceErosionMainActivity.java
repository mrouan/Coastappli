package osirisc.coastappli;

import android.content.Intent;
import android.graphics.Bitmap;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import osirisc.coastappli.Database.DatabaseAssistant;
import osirisc.coastappli.Database.MethodErosionDistance;
import osirisc.coastappli.distanceErosion.SectionsPagerAdapterDistanceErosion;
import static android.view.View.VISIBLE;

public class DistanceErosionMainActivity extends AppCompatActivity {

    // These are the information of the marker which was clicked on
    private Double markerLatitude;
    private Double markerLongitude;
    private String nameBeach;
    private String nameTown;
    private String coastType;
    private String INEC;
    private int erosionDistanceMeasureBool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // We first create the activity with it's 2 tabs
        super.onCreate(savedInstanceState);
        setContentView(R.layout.distance_erosion_main_activity);

        SectionsPagerAdapterDistanceErosion sectionsPagerAdapterDistanceErosion = new SectionsPagerAdapterDistanceErosion(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager_distance_erosion);
        viewPager.setAdapter(sectionsPagerAdapterDistanceErosion);
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
            erosionDistanceMeasureBool = extras.getInt("erosionDistanceMeasureBool");
        }

    }
}
