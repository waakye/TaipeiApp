package com.example.lesterlie.taipeiapp;

import android.view.View;
import android.widget.Toast;

/**
 * Created by lesterlie on 12/10/16.
 */

public class AttractionClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"Open the list of categories", Toast.LENGTH_SHORT).show();
    }
}
