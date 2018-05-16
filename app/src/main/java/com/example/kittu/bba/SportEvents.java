package com.example.kittu.bba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class SportEvents extends AppCompatActivity {

    private  static final String TAG = "SportActivity";
    ImageView Iv;
    TextView incomingData, sportFields, sportDetails, sportTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_events);

        String ground, squ, det;

        incomingData = (TextView) findViewById(R.id.Sport);
        Iv = (ImageView) findViewById(R.id.sportImage);
        sportDetails = (TextView) findViewById(R.id.sportDetails);
        sportFields = (TextView)findViewById(R.id.sportField);
        sportTimes = (TextView) findViewById(R.id.sportTime);

        Intent incomIntent = getIntent();
        String incomingName = incomIntent.getStringExtra("SportName");
        incomingData.setText(incomingName);

        if (incomingName.equals("Cricket")){
            Log.d(TAG,"Cricket !!!");
         /*   ground = "arkadelphia cricket ground";
            det = "Stell City Sparks vs BamaLions";
            squ = "Saturday: 8AM to 12PM"; */
            // Iv.setImageDrawable();
            sportFields.setText("Arkadelphia cricket ground");
            Iv.setImageDrawable(ContextCompat.getDrawable(SportEvents.this, R.drawable.cricket));
            sportDetails.setText("Stell City Sparks vs BamaLions");
            sportTimes.setText("Saturday: 8AM to 12PM");
        }else if (incomingName.equals("Baseball")){
            sportFields.setText("Regions Field");
            Iv.setImageDrawable(ContextCompat.getDrawable(SportEvents.this, R.drawable.baseball));
            sportDetails.setText("Stell City Sparks vs BamaLions");
            sportTimes.setText("Sundayday: 10AM to 1PM");
        }else if (incomingName.equals("Basketball")){
            sportFields.setText("Bartow Arena.");
            Iv.setImageDrawable(ContextCompat.getDrawable(SportEvents.this, R.drawable.basketball));
            sportDetails.setText("UAB vs UAH");
            sportTimes.setText("Friday: 8AM to 12PM");
        }
    }
}
