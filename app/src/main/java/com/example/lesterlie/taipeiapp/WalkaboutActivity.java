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
                "Huashan 1914 Creative Park",
                "Huashan 1914 Wenhua Chuangyi Chanye Yuanqu",
                "Free",
                "Hours: 9:30am to 9:00pm daily",
                "www.huashan1914.com/en/index.html",
                "No. 1, Bade Road Sec. 1, Zhong Zheng District",
                "Zhongzheng Qu, Yi Duan, Bade Lu, Yi Hao",
                "Huashan 1914 now serves as Taipei’s primary creative arts center and a " +
                        "hosting ground for Taiwan’s most significant cultural activities. "
        ));
        attractions.add(new Attraction(
                "Songshan Cultural and Creative Park",
                "Songshan Wen Chuang Yuanqu",
                "Free",
                "Hours: 9:00am to 6:00pm daily",
                "www.songshanculturalpark.taipei/en/index.aspx",
                "No. 133, Guangfu S Rd, Xinyi District",
                "Xinyi Qu, Guangfu Nanlu, Yibai Sanshi San Hao",
                "A large public park with exhibition halls, art shows, and conference spaces."
        ));
        attractions.add(new Attraction(
                "2-28 Peace Memorial Park",
                "Er Erba Heping Gongyuan",
                "Free",
                "Hours: 6:00am to 12:00am daily",
                "No website",
                "3 Ketagalan Boulevard, Zhongzheng District",
                "Zhongzheng Qu, Ketagalan Dadao, San Hao",
                "A memorial park for an incident involving an uprising of Taiwanese against the " +
                        "post-WWII Chinese government led by Chiang Kai-shek"
        ));
        attractions.add(new Attraction(
                "Taipei Botanical Garden",
                "Taibei Zhiwu Yuan",
                "Free",
                "Hours: 5:30am to 10:00pm",
                "http://tpbg.tfri.gov.tw/en/Introduction.php",
                "No. 53, Nanhai Rd, Zhongzheng District",
                "Zhongzheng Qu, Nanhai Lu, Wushi San Hao",
                "Founded in 1896 as a nursery, it became the first botanical garden in Taiwan"
        ));
        attractions.add(new Attraction(
                "National Chiang Kai-shek Memorial Hall",
                "Zhongzheng Jinian Tang",
                "Free",
                "Hours: 9:00am to 6:00pm daily",
                "http://www.cksmh.gov.tw/eng/index.php",
                "No.21, Zhongshan S.Rd., Zhongzheng District",
                "Zhongzheng Qu, Zhongshan Nanlu, Ershi Yi Hao",
                "A national monument, landmark, and tourist attraction erected in memory of " +
                        "former president, Chiang Kai-shek"
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
