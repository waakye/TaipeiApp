package com.example.lesterlie.taipeiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AttractionClickListener clickListener = new AttractionClickListener();

        // Find the View that shows the museums category
        TextView museums = (TextView)findViewById(R.id.museums);

        museums.setOnClickListener(clickListener);
    }
}
