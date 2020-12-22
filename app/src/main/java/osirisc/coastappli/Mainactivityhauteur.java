package osirisc.coastappli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

import com.google.android.material.tabs.TabLayout;

import osirisc.coastappli.hauteurErosion.Viewpagerhauteur;
import osirisc.coastappli.hauteurErosion.hauteurinputfragment;
import osirisc.coastappli.hauteurErosion.hauteurmethodfragment;

public class Mainactivityhauteur extends AppCompatActivity {


    TabLayout tabLayout;
    ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hauteurmainactivity);
        tabLayout= findViewById(R.id.tabLayout);
        viewPager= findViewById(R.id.viewPager);
        getTabs();



    }

    public void getTabs(){
        final Viewpagerhauteur viewpagerhauteur= new Viewpagerhauteur(getSupportFragmentManager());
        new Handler().post(new Runnable() {
            @Override
            public void run() {

                viewpagerhauteur.addFragment(hauteurinputfragment.getInstance(), "Input");
                viewpagerhauteur.addFragment(hauteurmethodfragment.getInstance(), "Method");

                viewPager.setAdapter(viewpagerhauteur);
                tabLayout.setupWithViewPager((viewPager));
            }
        });
    }
}