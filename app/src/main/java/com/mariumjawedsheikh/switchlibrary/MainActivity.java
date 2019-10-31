package com.tekrevol.switchlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.tekrevol.switchmodule.MainActivityLibrarySwitch;

public class MainActivity extends AppCompatActivity {

    MainActivityLibrarySwitch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = findViewById(R.id.switchLibrary);
        aSwitch.setHeight(40);
        aSwitch.setWidth(180);
        aSwitch.setText1("Male");
        aSwitch.setText2("Female");
        aSwitch.setBackgroundColor(getResources().getColor(R.color.panic_blue));
        aSwitch.setTabColor(getResources().getColor(R.color.query_grey));
        // set selectedTab after: backgroundColor and TabColor
        // for tab 1 selected
        aSwitch.selectedTab(1);
    }
}
