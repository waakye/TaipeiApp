package com.example.lesterlie.taipeiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);

        // Create an arrayList of museums
        ArrayList<String> museums = new ArrayList<String>();
        museums.add("National Palace Museum");
        museums.add("Taipei Fine Arts Museum");
        museums.add("National Museum of History");
        museums.add("National Taiwan Museum");
        museums.add("Museum of Contemporary Art");
        museums.add("Shung Ye Museum of Formosan Aborigines");

        // Create an {@link ArrayAdapter}, whose data source is a activity_attraction of Strings. The adapter
        // knows how to create layouts for each item in the activity_attraction, using the simple_list_item_1.xml
        // layout resource defined in the Android framework.
        // This activity_attraction item layout contains a single {@link TextView}, which the adapter will set
        // to display a single word.
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, museums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.  There
        // should be a {@link ListView} with the view ID called activity_attraction, which is declared in the
        // activity_museum.xml file
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display activity_attraction items for each word in the activity_attraction of attractions.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in 1
        // argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }
}
