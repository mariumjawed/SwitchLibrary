package com.mariumjawedsheikh.switchlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mariumjawedsheikh.switchmodule.MainActivityLibrarySwitch;
import com.mariumjawedsheikh.switchlibrary.R;

public class MainActivity extends AppCompatActivity {

    MainActivityLibrarySwitch aSwitch, aSwitch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = findViewById(R.id.switchLibrary);
        aSwitch.setHeight(40);
        aSwitch.setWidth(90);
        aSwitch.setText1("On");
        aSwitch.setText2("Off");
        aSwitch.setBackgroundColor(getResources().getColor(R.color.panic_blue));
        aSwitch.setTabColor(getResources().getColor(R.color.query_grey));
        // set selectedTab after: backgroundColor and TabColor
        // for tab 1 selected
        aSwitch.selectedTab(1);


        aSwitch1 = findViewById(R.id.switchLibrary1);
        aSwitch1.setHeight(40);
        aSwitch1.setWidth(180);
        aSwitch1.setText1("Male");
        aSwitch1.setText2("Female");
        aSwitch1.setBackgroundColor(getResources().getColor(R.color.material_purple500));
        aSwitch1.setTabColor(getResources().getColor(R.color.query_grey));
        // set selectedTab after: backgroundColor and TabColor
        // for tab 1 selected
        aSwitch1.selectedTab(2);
    }
}
