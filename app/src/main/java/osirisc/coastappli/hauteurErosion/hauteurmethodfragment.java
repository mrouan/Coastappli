package osirisc.coastappli.hauteurErosion;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import osirisc.coastappli.R;

public class hauteurmethodfragment extends Fragment {

    public static hauteurmethodfragment getInstance(){
        hauteurmethodfragment hauteurmethodfragment=new hauteurmethodfragment();
        return hauteurmethodfragment;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hauteurmethod, container, false);

        return view;
    }
}
