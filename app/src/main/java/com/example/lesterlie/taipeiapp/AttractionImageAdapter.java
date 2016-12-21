package com.example.lesterlie.taipeiapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * AttractionAdapter
 * Created by lesterlie on 12/14/16.
 */

public class AttractionImageAdapter extends ArrayAdapter<Attraction> {

    /**
     * This is Udacity's custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we ant to
     * populate into the lists
     */
    public AttractionImageAdapter(Activity context, ArrayList<Attraction> attractions) {
        // Here we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView
        // Because this is a custom adapter for two TextViews, the adapter is not going to use
        // this second argument , so it can be any value.  Here we used 0.
        super(context, 0, attractions);
    }

    /**
     * Provide a view for an AdapterView (ListView, GridView, etc.)
     * @param position The position in the list of data that should be displayed in the list item
     *                 view.
     * @param convertView The recycled view to populate.
     * @param parent    The parent ViewGroup that is used for inflation
     * @return          The view for the position in the AdapterView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_with_image, parent, false);
        }

        // Get the {@link Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID attractionEnglishName
        TextView englishNameTextView =
                (TextView)listItemView.findViewById(R.id.attraction_english_name);
        // Get the attraction English name from the current attraction object and set this text on
        // the englishNameTextView
        englishNameTextView.setText(currentAttraction.getEnglishName());

        // Find the TextView in the list_item.xml layout with the ID attractionPinyinName
        TextView pinyinNameTextView =
                (TextView)listItemView.findViewById(R.id.attraction_pinyin_name);
        // Get the attraction Pinyin name from the current attraction object and set this text on
        // the pinyinNameTextView
        pinyinNameTextView.setText(currentAttraction.getPinyinName());

        // Find the TextView in the list_item.xml layout with the ID admissionFees
        TextView admissionFeesTextView =
                (TextView)listItemView.findViewById(R.id.attraction_admission_fees);
        // Get the attraction admission fees from the current attraction object and set this text on
        // the admissionFeesTextView
        admissionFeesTextView.setText(currentAttraction.getAdmissionFees());

        // Find the TextView in the list_item.xml layout with the ID operatingHours
        TextView operatingHoursTextView =
                (TextView)listItemView.findViewById(R.id.attraction_operating_hours);
        // Get the attraction operating hours from the current attraction object and set this text
        // on the operatingHoursTextView
        operatingHoursTextView.setText(currentAttraction.getOperatingHours());

        // Find the TextView in the list_item.xml layout with the ID attractionWebsite
        TextView attractionWebsiteTextView =
                (TextView)listItemView.findViewById(R.id.attraction_website);
        // Get the attraction operating hours from the current attraction object and set this text
        // on the attractionWebsiteTextView
        attractionWebsiteTextView.setText(currentAttraction.getAttractionWebsite());

        // Find the TextView in the list_item.xml layout with the ID attractionEnglishAddress
        TextView englishAddressTextView =
                (TextView)listItemView.findViewById(R.id.attraction_english_address);
        // Get the attraction English address from the current attraction object and set this text
        // on the englishAddressTextView
        englishAddressTextView.setText(currentAttraction.getEnglishAddress());

        // Find the TextView in the list_item.xml layout with the ID attractionPinyinName
        TextView pinyinAddressTextView =
                (TextView)listItemView.findViewById(R.id.attraction_pinyin_address);
        // Get the attraction Pinyin address from the current attraction object and set this text on
        // the pinyinAddressTextView
        pinyinAddressTextView.setText(currentAttraction.getPinyinAddress());

        // Find the TextView in the list_item.xml layout with the ID attractionEnglishDescription
        TextView descriptionTextView =
                (TextView) listItemView.findViewById(R.id.attraction_english_description);
        // Get the attraction English description from teh current attraction object and set this
        // text on the description TextView
        descriptionTextView.setText(currentAttraction.getEnglishDescription());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentAttraction.getImageResourceId());
        
        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView
        return listItemView;
    }
}
