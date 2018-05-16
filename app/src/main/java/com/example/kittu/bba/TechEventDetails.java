package com.example.kittu.bba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TechEventDetails extends AppCompatActivity {

    TextView techDetails, incomingData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_event_details);

        incomingData = (TextView) findViewById(R.id.techIncom);
        techDetails = (TextView) findViewById(R.id.tecDetailTech);

        Intent incomIntent = getIntent();
        String incomingName = incomIntent.getStringExtra("TechEvents");
        incomingData.setText(incomingName);

        if (incomingName.equals("Information Systems Summit-Iron City")){

            techDetails.setText("The AIS Summit is the world leading conference " +
                    "on AIS ship tracking technology. Join Genscape Vesseltracker at this year's summit to discuss " +
                    "big data in ship tracking and new technologies in the industry. Learn how these new technologies" +
                    " could impact ship tracking and bring more transparency into the market.  April 29");
        }else if (incomingName.equals("Java Script Workshop – Innovation depot")) {

            techDetails.setText("Get comfortable speaking the language of web developers, hands-on!" +
                    "We're going to dive into a day of JavaScript to get your footing on the" +
                    " essential skills of programming.May 5th ");
        }
    }
}
