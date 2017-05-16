package com.example.zhou.travelapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Zhou on 2017/4/23.
 */
public class Search_reult extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_result);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textViewOfcountryName);
        textView.setText(message);

    }
    TextView textView1 = (TextView) findViewById(R.id.textViewOfBackground);
    TextView textView2 = (TextView) findViewById(R.id.textViewOfLanguage1);
    TextView textView3 = (TextView) findViewById(R.id.textViewOfLanguage2);
    TextView textView4 = (TextView) findViewById(R.id.textViewOfLanguage2);
    TextView textView5 = (TextView) findViewById(R.id.textViewOflanguage3);
    TextView textView6 = (TextView) findViewById(R.id.textViewOfVisa);
    TextView textView7 = (TextView) findViewById(R.id.textViewOfWeatherInfo);
    TextView textView8 = (TextView) findViewById(R.id.textViewOfTravelWaring);
    TextView textView9 = (TextView) findViewById(R.id.textViewOfDisasterInfo);
}
