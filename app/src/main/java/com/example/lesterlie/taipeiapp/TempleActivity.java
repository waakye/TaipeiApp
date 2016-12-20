package com.example.lesterlie.taipeiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TempleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);

        // Create an arraylist of temples
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(
                "Dalongdong Baoan Temple",
                "Dalongdong Baoan Gong",
                "Free",
                "Hours: 7:00am to 10:00pm daily",
                "www.baoan.org.tw/english",
                "No. 61 Hami Street, Datong District",
                "Datong Qu, Hami Jie, Liushi Yi Hao",
                "UNESCO World Heritage site founded in 1760"
        ));
        attractions.add(new Attraction(
                "Longshan Temple",
                "Longshan Si",
                "Free",
                "Hours: 6am to 10pm daily",
                "www.lungshan.org.tw",
                "211 Guangzhou Street, Wanhua District",
                "Wanhua Qu, Guangzhou Jie, Liangbai Shiyi Hao",
                "One of the city's top religious sites and a prime venue for exploring both " +
                        "Taiwan's vibrant folk faith and its unique temple arts and architecture"
        ));
        attractions.add(new Attraction(
                "Xingtian Temple",
                "Xingtian Kong",
                "Free",
                "Hours: 5am to 11pm daily",
                "No website",
                "109 Mingquan East Road, Section 2, Zhongshan District",
                "Zhongshan Qu, Minquan Dong Lu, Er Duan, Yiling Jiu Hao",
                "One of the city's top centers of folk worship"
        ));
        attractions.add(new Attraction(
                "Shandao Temple",
                "Shandao Si",
                "Free",
                "Hours: 6:30am to 10:30pm daily",
                "www.shandaotemple.org.tw",
                "No. 23, Section 1, Zhongxiao E Rd, Zhongzheng District",
                "Zhongzheng Qu, Zhongxiao Dong Lu, Yi Duan, Ershi San Hao",
                "Unusually modern style temple"
        ));

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
