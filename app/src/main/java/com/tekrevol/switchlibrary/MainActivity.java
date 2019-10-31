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

        aSwitch.setData("Male", "Female", 100, 40, getResources().getColor(R.color.panic_blue), getResources().getColor(R.color.query_grey));
    }
}
