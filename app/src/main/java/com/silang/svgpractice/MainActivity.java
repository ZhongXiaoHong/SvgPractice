package com.silang.svgpractice;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.AppCompatImageView;

public class MainActivity extends AppCompatActivity {

    AppCompatImageView mAppCompatImageView;
    AppCompatImageView bg_AppCompatImageView;
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAppCompatImageView = (AppCompatImageView) findViewById(R.id.mAppCompatImageView);
        mAppCompatImageView.setImageResource(R.drawable.ic_directions_bike_black_24dp);

        bg_AppCompatImageView = (AppCompatImageView) findViewById(R.id.bg_AppCompatImageView);
        bg_AppCompatImageView.setBackground(ContextCompat.getDrawable(this, R.drawable.ic_directions_bike_black_24dp));
    }
}
