package ru.samsung.lesson19012021;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {
    FragmentManager fm;
    FragmentTransaction ft;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

    }

    public void LoadFragment(View view) {
        if (count % 2 == 0) {
            SampleFragmentB fb = new SampleFragmentB();
            ft.add(R.id.place_holder, fb);
            ft.commit();
        } else {
            SampleFragmentC fb = new SampleFragmentC();
            ft.add(R.id.place_holder, fb);
            ft.commit();
        }
    }
}