package com.tekrevol.switchmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivityLibrarySwitch extends LinearLayout {

    LinearLayout layoutbg;
    TextView txtOff,txtOn;

    public MainActivityLibrarySwitch(Context context) {
        super(context);
        initLayout(context);
    }

    public MainActivityLibrarySwitch(Context context, AttributeSet attrs) {
        super(context, attrs);
        initLayout(context);
    }

    public MainActivityLibrarySwitch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initLayout(context);
    }

    public MainActivityLibrarySwitch(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initLayout(context);
    }

    public void setData(String text1, String test2, int width, int height, int backgroundColor, int tabcolor) {

        changeGradientBackgroundColor(layoutbg, backgroundColor);
        changeGradientBackgroundColor(txtOff, tabcolor);
        txtOff.setTextColor(backgroundColor);
        txtOn.setBackground(null);
        txtOn.setTextColor(tabcolor);


    }

    private void initLayout(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_main_library, this);

        bindViews();
    }

    private void bindViews() {

        layoutbg = findViewById(R.id.layoutbg);
        txtOff = findViewById(R.id.txtOff);
        txtOn = findViewById(R.id.txtOn);
    }


    public void changeGradientBackgroundColor(View view, int color) {
        GradientDrawable gd = (GradientDrawable) view.getBackground();
        gd.setColor(color);
    }

}
