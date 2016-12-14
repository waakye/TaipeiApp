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
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(
                "National Palace Museum",
                "Gugong Bowuguan",
                "Regular admission: NT250",
                "Open daily from 08:30 to 18:30 all year round.\n" +
                        "Extension of opening hours at night: 18:30 - 21:00 on Fridays and Saturdays.",
                "www.npm.gov.tw",
                "No. 221, Section 2, Zhishan Rd, Shilin District",
                "Shilin Qu, Zhishan Lu, Er Duan, Liang Bai Er Shi Yi Hao",
                "A permanent collection of nearly 700,000 pieces of ancient Chinese imperial " +
                        "artifacts and artworks, making it one of the largest of its type in the " +
                        "world. "));
        attractions.add(new Attraction(
                "Taipei Fine Arts Museum",
                "Taibei Shili Meishuguan",
                "Regular admission: NT30",
                "Tuesdays through Friday and Sunday open 9:30 to 17:30; " +
                        "open until 20:30 on Saturdays; closed on Mondays",
                "http://www.tfam.museum/",
                "No. 181, Section 3, Zhongshan N Rd, Zhongshan District",
                "Zhongshan Qu, Zhongshan Bei Lu, San Duan, Yibai BaShi Yi Hao",
                "The first museum in Taiwan built for contemporary art exhibitions. "));
        attractions.add(new Attraction(
                "National Museum of History",
                "Lishi Bowuguan",
                "Regular admission: NT30",
                "Tuesdays through Sunday open 10:00 to 18:00",
                "http://www.nmh.gov.tw/",
                "No. 49, Nanhai Rd, Zhongzheng District",
                "Zhongzheng qu, Nanhai Lu, Sishi Jiu Hao",
                "Exhibits Taiwanese historical items."));
        attractions.add(new Attraction(
                "National Taiwan Museum",
                "Guoli Taiwan Bowuguan",
                "Regular admission: NT30",
                "Tuesdays through Sunday open 09:30 to 17:00",
                "www2.ntm.gov.tw",
                "No. 2, Xiangyang Rd, Zhongzheng District",
                "Zhongzheng Qu, Xiangyang Lu, Er Hao",
                "The collection and research continue to focus on anthropology, earth sciences, " +
                        "zoology, and botany that are relevant to Taiwan. "));
        attractions.add(new Attraction(
                "Museum of Contemporary Art",
                "Taibei Dangdai Yishuguan",
                "Regular admission: NT50",
                "Tuesdays through Sunday open 10:00 to 18:00",
                "http://www.mocataipei.org.tw/",
                "No.39, Chang'an W. Rd., Datong District",
                "Datong Qu, Chang An Xilu, Sanshi Jiu Hao",
                "A museum displaying contemporary Taiwan art."));
        attractions.add(new Attraction(
                "Shung Ye Museum of Formosan Aborigines",
                "Shunyi Yaiwan Yuan Zhumin Bowuguan",
                "Regular admission: NT150",
                "Tuesdays through Sunday open 09:00 to 17:00",
                "http://www.museum.org.tw/symm_en/index.htm",
                "No. 282, Sec.2 Zhishan Rd., Shihlin District",
                "Shilin Qu, Zhishan Lu, Er Duan, Liang Bai Bashi Er Hao",
                "A museum dedicated to displaying the cultures and histories of the " +
                        "Taiwanese aborigines. "));

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
