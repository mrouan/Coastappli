package osirisc.coastappli.hauteurErosion;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.concurrent.atomic.AtomicInteger;

import osirisc.coastappli.Database.DatabaseAssistant;
import osirisc.coastappli.DatabaseHelper;
import osirisc.coastappli.R;

public class hauteurinputfragment extends Fragment {

    DatabaseHelper mDatabasehelper;

    private String hauteurerosion;



    public static hauteurinputfragment getInstance(){
        hauteurinputfragment hauteurinputfragment= new hauteurinputfragment();
        return hauteurinputfragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.hauteurinput, container, false);

        Button enterhauteurvaluebutton = view.findViewById(R.id.enterhauteurvaluebutton);
        final EditText enterhauteurinput=view.findViewById(R.id.enterhauteurinput);
        final TextView  hauteurinputvalue=view.findViewById(R.id.hauteurinputvalue);
        enterhauteurvaluebutton.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                String hauteurerosion=enterhauteurinput.getText().toString();





                hauteurinputvalue.setText("Valeur Enregistrée:"+hauteurerosion+ " cm");
                addData(hauteurerosion);









            }
        });
        return view;



    }

    public void addData(String newentry){
        boolean insertData=mDatabasehelper.addData(newentry);
        if (insertData){
            toastmessage("Donnée enregistée");
        }
        else {
            toastmessage("problème");
        }
    }

    public void toastmessage(String message){
        Toast.makeText(getContext(),message,Toast.LENGTH_SHORT).show();
    }




}