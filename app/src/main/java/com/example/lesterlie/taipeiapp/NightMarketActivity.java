package com.example.lesterlie.taipeiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NightMarketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night_market);

        // Create an arraylist of night markets
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(
                "Shilin Night Market",
                "Shilin Yeshi", "Admission: Free",
                "Hours: 4:30pm to 12:00am daily",
                "www.shilin-night-market.com",
                "Lane 101, Wenlin Road, Shilin District",
                "Shilin Qu, Wenlin Lu, 101 Xiang",
                "One of the most popular night markets"));
        attractions.add(new Attraction(
                "Raohe Night Market",
                "Raohe Jie Guangong Yeshi","Admission: Free",
                "Hours: 5:00pm to 12:00am daily",
                "www.raohestreet.com.tw",
                "Raohe Street, Songshan District",
                "Songshan Qu, Raohe Lu",
                "One of the oldest night markets"));
        attractions.add(new Attraction(
                "Shida Night Market",
                "Shida Yeshi", "Admission: Free",
                "Hours: 12:00pm to 12:00am daily",
                "No website",
                "Lane 39, Shida Road, Da'an District",
                "Da'an Qu, Shida Lu, Sanshi Jiu Xiang",
                "One of the liveliest night markets"));
        attractions.add(new Attraction(
                "Linjiang Night Market",
                "Linjiang Jie Guangong Yeshi",
                "Admission: Free",
                "Hours: 5:00pm to 1:30am daily",
                "No website",
                "Linjiang Street, Da'an District",
                "Da'an Qu, Linjiang Jie",
                "One of the liveliest night markets"));

        // Create an {@link ArrayAdapter}, whose data source is a activity_attraction of Strings. The adapter
        // knows how to create layouts for each item in the activity_attraction, using the simple_list_item_1.xml
        // layout resource defined in the Android framework.
        // This activity_attraction item layout contains a single {@link TextView}, which the adapter will set
        // to display a single word.
        AttractionAdapter adapter =
                new AttractionAdapter(this, attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.  There
        // should be a {@link ListView} with the view ID called activity_attraction, which is declared in the
        // activity_museum.xml file
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display activity_attraction items for each word in the activity_attraction of attractions.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in 1
        // argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}
