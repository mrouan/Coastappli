package osirisc.coastappli.distanceErosion;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import osirisc.coastappli.Database.MethodErosionDistance;
import osirisc.coastappli.R;

/**
 * This tab is one of the tabs of the DistanceErosionMainActivity
 * It's the tab where the user can enter the distance they measured and then validate to send the data to the database
 */
public class TabInputFragment extends Fragment {
    private EditText steps;
    private EditText distance;
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // We first inflate the layout
        final View root = inflater.inflate(R.layout.tab_input_distance_erosion, container, false);

        RadioButton mMetre = (RadioButton) root.findViewById(R.id.metre);
        RadioButton mSteps = (RadioButton) root.findViewById(R.id.steps);

        mMetre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                root.findViewById(R.id.step_use).setVisibility(View.GONE);
                root.findViewById(R.id.metre_use).setVisibility(View.VISIBLE);
                distance = (EditText) root.findViewById(R.id.distance_metre);
                distance.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        if(s.length() != 0){
                            root.findViewById(R.id.validate_distance).setVisibility(View.VISIBLE);
                        }
                        else{ root.findViewById(R.id.validate_distance).setVisibility(View.GONE);}
                    }
                    @Override
                    public void afterTextChanged(Editable s) { }
                });


            }
        });
        mSteps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                root.findViewById(R.id.metre_use).setVisibility(View.GONE);
                root.findViewById(R.id.step_use).setVisibility(View.VISIBLE);
                steps = (EditText) root.findViewById(R.id.distance_step);
                steps.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        if(s.length() != 0){
                            root.findViewById(R.id.validate_distance).setVisibility(View.VISIBLE);
                        }
                        else{ root.findViewById(R.id.validate_distance).setVisibility(View.GONE);}
                    }
                    @Override
                    public void afterTextChanged(Editable s) { }
                });
            }
        });

        return root;
    }

}
