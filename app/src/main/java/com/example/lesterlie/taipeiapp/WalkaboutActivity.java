package com.example.lesterlie.taipeiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WalkaboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);

        // Create an arraylist of walking areas
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(
                getString(R.string.walking_area_1_english_name),
                getString(R.string.walking_area_1_pinyin_name),
                getString(R.string.walking_area_1_admission_fee),
                getString(R.string.walking_area_1_operating_hours),
                getString(R.string.walking_area_1_website),
                getString(R.string.walking_area_1_english_address),
                getString(R.string.walking_area_1_pinyin_address),
                getString(R.string.walking_area_1_description)));
        attractions.add(new Attraction(
                getString(R.string.walking_area_2_english_name),
                getString(R.string.walking_area_2_pinyin_name),
                getString(R.string.walking_area_2_admission_fee),
                getString(R.string.walking_area_2_operating_hours),
                getString(R.string.walking_area_2_website),
                getString(R.string.walking_area_2_english_address),
                getString(R.string.walking_area_2_pinyin_address),
                getString(R.string.walking_area_2_description)));
        attractions.add(new Attraction(
                getString(R.string.walking_area_3_english_name),
                getString(R.string.walking_area_3_pinyin_name),
                getString(R.string.walking_area_3_admission_fee),
                getString(R.string.walking_area_3_operating_hours),
                getString(R.string.walking_area_3_website),
                getString(R.string.walking_area_3_english_address),
                getString(R.string.walking_area_3_pinyin_address),
                getString(R.string.walking_area_3_description)));
        attractions.add(new Attraction(
                getString(R.string.walking_area_4_english_name),
                getString(R.string.walking_area_4_pinyin_name),
                getString(R.string.walking_area_4_admission_fee),
                getString(R.string.walking_area_4_operating_hours),
                getString(R.string.walking_area_4_website),
                getString(R.string.walking_area_4_english_address),
                getString(R.string.walking_area_4_pinyin_address),
                getString(R.string.walking_area_4_description)));
        attractions.add(new Attraction(
                getString(R.string.walking_area_5_english_name),
                getString(R.string.walking_area_5_pinyin_name),
                getString(R.string.walking_area_5_admission_fee),
                getString(R.string.walking_area_5_operating_hours),
                getString(R.string.walking_area_5_website),
                getString(R.string.walking_area_5_english_address),
                getString(R.string.walking_area_5_pinyin_address),
                getString(R.string.walking_area_5_description)));

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
