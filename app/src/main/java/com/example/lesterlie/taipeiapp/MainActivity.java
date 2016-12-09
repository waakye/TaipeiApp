package com.example.lesterlie.taipeiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the museums category
        TextView museums = (TextView)findViewById(R.id.museums);

        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MuseumActivity}
                Intent museumsIntent = new Intent(MainActivity.this, MuseumActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });

        // Find the View that shows the monuments category
        TextView monuments = (TextView)findViewById(R.id.monuments);

        monuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link MonumentActivity}
                Intent monumentsIntent = new Intent(MainActivity.this, MonumentActivity.class);

                // Start the new activity
                startActivity(monumentsIntent);
            }
        });


        // Find the View that shows the night markets category
        TextView nightMarkets = (TextView)findViewById(R.id.night_markets);

        nightMarkets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NightMarketActivity}
                Intent nightMarketsIntent = new Intent(MainActivity.this, NightMarketActivity.class);

                // Start the new activity
                startActivity(nightMarketsIntent);
            }
        });

        // Find the View that shows the temples category
        TextView temples = (TextView)findViewById(R.id.temples);

        temples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TempleActivity}
                Intent templesIntent = new Intent(MainActivity.this, TempleActivity.class);

                // Start the new activity
                startActivity(templesIntent);
            }
        });

        // Find the View that shows the walkabouts category
        TextView walkabouts = (TextView)findViewById(R.id.walkabouts);

        walkabouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link WalkaboutActivity}
                Intent walkaboutsIntent = new Intent(MainActivity.this, WalkaboutActivity.class);

                // Start the new activity
                startActivity(walkaboutsIntent);
            }
        });
    }
}
