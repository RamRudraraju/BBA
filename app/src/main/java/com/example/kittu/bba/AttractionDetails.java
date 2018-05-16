package com.example.kittu.bba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class AttractionDetails extends AppCompatActivity {

    private  static final String TAG = "SecondActivity";
    ImageView Iv;
    TextView incomingData, Details, Details2, Details3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_details);

        incomingData = (TextView) findViewById(R.id.etIncomingData);
        Iv = (ImageView) findViewById(R.id.imageView);
        Details = (TextView) findViewById(R.id.det);


        // Setting the TextView Contents.
        Intent incomIntent = getIntent();
        String incomingName = incomIntent.getStringExtra("AttractionName");
        incomingData.setText(incomingName);    // Setting the Name to TextView.


        if (incomingName.equals("Birmingham Zoo")){
            Log.d(TAG,"Came into Birmingham Zoo !");
            // Iv.setImageDrawable();
            Iv.setImageDrawable(ContextCompat.getDrawable(AttractionDetails.this, R.drawable.bz));
            Details.setText("2630 Cahaba Rd, Birmingham, AL 35223\n" +
                    "Open 9am-5pm every day; 9am-7pm Saturday and Sunday\n" +
                    "Adult: $16, Senior (65+): $14, Children (2-12): $11\n");
        }else if (incomingName.equals("Barber Motorsports Park")){
            Iv.setImageDrawable(ContextCompat.getDrawable(AttractionDetails.this, R.drawable.bmp));
            Details.setText("The Barber Motorsports Park is 740 acres (300 ha) multi-purpose racing facility located in Leeds, Alabama.\n" +
                    "6040 Barber Motorsports Parkway, Leeds, AL 35094.\n" +
                    "Monday–Saturday: 10am–6pm \n" +
                    "Sunday: Noon–6pm\n ");
        }else if (incomingName.equals("Red Mountain")){
            Iv.setImageDrawable(ContextCompat.getDrawable(AttractionDetails.this, R.drawable.rmo));
            Details.setText("Park contain walking trails, scenic places, historic sites, and zip lines\n" +
                    "2011 Frankfurt Dr, Birmingham, AL 35211\n" +
                    "Open 7am-7pm daily\n");
        }else if (incomingName.equals("Ruffner Mountain")){
            Iv.setImageDrawable(ContextCompat.getDrawable(AttractionDetails.this, R.drawable.rfm));
            Details.setText("Walking and hiking trails with gorgeous scenery in Jefferson County, Alabama\n" +
                    "Open 9am-5pm daily, 1am-5pm Sunday, closed Monday \n" +
                    "1214 81st St S, Birmingham, AL 35206 \n");
        }else if (incomingName.equals("Sloss Furnaces")){
            Iv.setImageDrawable(ContextCompat.getDrawable(AttractionDetails.this, R.drawable.slf));
            Details.setText("\n"+"\n"+"\n"+"Old iron furnace now turned into a national park and concert venue\n" +
                    "Open park times: 10am-4pm daily, 12am-4pm on Sunday, closed on Monday \n" +
                    "Concert prices and times vary \n" +
                    "20 32nd St N, Birmingham, AL 35222 \n");
        }else if (incomingName.equals("Vulcan Park")){
            Iv.setImageDrawable(ContextCompat.getDrawable(AttractionDetails.this, R.drawable.vp));
            Details.setText("\n"+"\n"+"\n"+"The statue of Vulcan symbolizes Birmingham’s industries, but is also a park open to the public. \n" +
                    "1701 Valley View Dr, Birmingham, AL 35209\n" +
                    "Prices vary depending on age, military background, and time of the day. (no more than $6)\n" +
                    "Open 10am-10pm\n");
        }


    }
}
