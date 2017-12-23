package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // completed (2) Display the weather forecast that was passed from MainActivity

        TextView detailStringTextView = (TextView) findViewById(R.id.tv_detail_string);

        //Get the intent
        Intent parentIntent = getIntent();

        //Check if the intent actually exists
        if (parentIntent != null) {

            // if it exists check if it has our text
            if (parentIntent.hasExtra(Intent.EXTRA_TEXT)) {

                // if it has our text get our text and display it
                String giveMeTheText = parentIntent.getStringExtra(Intent.EXTRA_TEXT);
                detailStringTextView.setText(giveMeTheText);
            }
        }

    }
}