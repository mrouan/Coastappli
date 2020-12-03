package osirisc.coastappli.distanceErosion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import osirisc.coastappli.Database.DatabaseAssistant;
import osirisc.coastappli.Database.MethodErosionDistance;
import osirisc.coastappli.PhotoCaptureErosionMainActivity;
import osirisc.coastappli.R;

/**
* This tab is one of the tabs of the DistanceErosionMainActivity
* It's the tab where the user finds all the information about how and where to take the measure
*/
public class TabMethodFragment extends Fragment {

    // Method is the object containing all the data necessary to fill this Tab
    private MethodErosionDistance method;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // We first inflate the layout
        View root = inflater.inflate(R.layout.tab_method_distance_erosion, container, false);

        /*
        // We then have to retrieve the information from the database in order to fill the layout
        // with to correct pictures and text from this marker's method
        DatabaseAssistant databaseAssistant = new DatabaseAssistant(getActivity());
        // We retrieve the marker's latitude and longitude from the PhotoCaptureErosionMainActivity in order to find the method for this marker
        method = databaseAssistant.findDistanceErosion(((PhotoCaptureErosionMainActivity)getActivity()).getMarkerLatitude(), ((PhotoCaptureErosionMainActivity)getActivity()).getMarkerLongitude());
        */
        return null;
    }
}
