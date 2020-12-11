package osirisc.coastappli.distanceErosion;

import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.github.chrisbanes.photoview.PhotoView;

import osirisc.coastappli.Database.DatabaseAssistant;
import osirisc.coastappli.Database.MethodErosionDistance;
import osirisc.coastappli.DistanceErosionMainActivity;
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

        // We then have to retrieve the information from the database in order to fill the layout
        // with to correct pictures and text from this marker's method
        DatabaseAssistant databaseAssistant = new DatabaseAssistant(getActivity());
        // We retrieve the marker's latitude and longitude from the PhotoCaptureErosionMainActivity in order to find the method for this marker
        method = databaseAssistant.findMethodErosionDistance(((DistanceErosionMainActivity)getActivity()).getMarkerLatitude(), ((DistanceErosionMainActivity)getActivity()).getMarkerLongitude());

        if (method!=null) {
            // We fill the layout
            ImageView imageViewMethodPhoto = root.findViewById(R.id.imageViewMethodPhoto);
            imageViewMethodPhoto.setImageBitmap(BitmapFactory.decodeByteArray(method.getPhoto(), 0,method.getPhoto().length));
        }
        return root;
    }

    /**
     * This function is launched when the Activity is created and therefore when the layouts are correctly inflated
     * We can here add the onClickListeners to the two pictures
     * They activate a new dialog allowing the user to zoom in the picture and move around in it
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // We retrieve the first image view
        final ImageView imageViewMethodPhoto = getView().findViewById(R.id.imageViewMethodPhoto);

        // We set a onclick listener for when the image gets clicked
        imageViewMethodPhoto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // We create an AlertDialog.Builder
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(getContext());

                // We inflate a new layout composed of nothing apart from a PhotoView
                View mView = getLayoutInflater().inflate(R.layout.fullscreen, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);

                // In this PhotoView, we set the image we want from the object method
                Bitmap bm = BitmapFactory.decodeByteArray(method.getPhoto(), 0, method.getPhoto().length);
                photoView.setImageBitmap(bm);
                mBuilder.setView(mView);

                // We then create the Builder
                AlertDialog mDialog = mBuilder.create();

                // We set the background as TRANSPARENT in order to see to image in the builder like a pop up
                // (the background is still visible so the user is not lost)
                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();
            }
        });
    }
}
