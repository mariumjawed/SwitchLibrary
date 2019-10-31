package com.tekrevol.switchmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
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
    TextView txtOff, txtOn;
    private int bgColor, tabBgColor;

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

    private void initLayout(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_main_library, this);

        bindViews();
    }

    private void bindViews() {

        layoutbg = findViewById(R.id.layoutbg);
        txtOff = findViewById(R.id.txtOff);
        txtOn = findViewById(R.id.txtOn);

        setListeners();
    }

    private void setListeners() {

        txtOff.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                setColor(txtOff, txtOn);

            }
        });
        txtOn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                setColor(txtOn, txtOff);

            }
        });
    }

    private void changeGradientBackgroundColor(View view, int color) {
        GradientDrawable gd = (GradientDrawable) view.getBackground();
        gd.setColor(color);
    }

    public void setText1(String text1) {
        txtOff.setText(text1);
    }

    public void setText2(String text2) {
        txtOn.setText(text2);
    }

    public void setWidth(int width) {
        final float scale = getContext().getResources().getDisplayMetrics().density;
        int pixels = (int) (width * scale + 0.5f);
        LayoutParams params = (LayoutParams) layoutbg.getLayoutParams();
        params.width = pixels;
        layoutbg.setLayoutParams(params);
    }

    public void setHeight(int height) {
        final float scale = getContext().getResources().getDisplayMetrics().density;
        int pixels = (int) (height * scale + 0.5f);
        LayoutParams params = (LayoutParams) layoutbg.getLayoutParams();
        params.height = pixels;
        layoutbg.setLayoutParams(params);
    }

    public void setBackgroundColor(int backgroundColor) {
        bgColor = backgroundColor;
        changeGradientBackgroundColor(layoutbg, backgroundColor);
    }

    public void setTabColor(int tabColor) {
        tabBgColor = tabColor;
    }

    private void setColor(TextView text1, TextView text2) {
        changeGradientBackgroundColor(text1, tabBgColor);
        changeGradientBackgroundColor(text2, Color.TRANSPARENT);
        text1.setTextColor(bgColor);
        text2.setTextColor(tabBgColor);

    }

    public void selectedTab(int value) {
        if (value == 1) {

            setColor(txtOff, txtOn);

        } else if (value == 2) {

            setColor(txtOn, txtOff);

        } else return;
    }

}