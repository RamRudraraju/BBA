package com.example.kittu.bba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CompaniesDetails extends AppCompatActivity {

    TextView compAddress1, hrEmail1, compName1, compDetails1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companies_details); // compDetails

        compAddress1 = (TextView) findViewById(R.id.compAddress);
        hrEmail1 = (TextView) findViewById(R.id.hrEmail);
        compName1 = (TextView) findViewById(R.id.compName);
        compDetails1 = (TextView) findViewById(R.id.compDetails);

        Intent incomIntent = getIntent();    // compAddress
        String incomingName = incomIntent.getStringExtra("CompanieName");
        compName1.setText(incomingName);

        if (incomingName.equals("CTS")){
            String em, ca, cd;
            em = "hr@cts.com"; ca = "300 Riverchase, Parkway East, Birmingham, AL 35244";
            cd = "Software consulting firm with business in Birmingham that helps solve complex IT problems.";
            hrEmail1.setText(em);
            compAddress1.setText(ca);
            compDetails1.setText(cd);
        }else if(incomingName.equals("Shipt") )
        {
            String em, ca, cd;
            em = "hr@shipt.com"; ca = "300 Riverchase, Parkway East, Birmingham, AL 35244";
            cd = "Software consulting firm with business in Birmingham that helps solve complex IT problems.";
            hrEmail1.setText(em);
            compAddress1.setText(ca);
            compDetails1.setText(cd);
        }else if(incomingName.equals("Virtue Technology")){
            String em, ca, cd;
            em = "hr@virtuetechnology.com"; ca = "300 Riverchase, Parkway East, Birmingham, AL 35244";
            cd = "To help support starting off tech companies and entrepreneurs in the Birmingham area";
            hrEmail1.setText(em);
            compAddress1.setText(ca);
            compDetails1.setText(cd);
          //  compDetails1.setText();
          //  hrEmail1.setText();
           // compAddress1.setText("");
        }else if(incomingName.equals("Tech Birmingham")){
            String em, ca, cd;
            em = "hr@TechBirmingham.com"; ca = "1500 First Avenue North, Unit 42, Birmingham, AL 35203.";
            cd = "To help support starting off tech companies and entrepreneurs in the Birmingham area";
            hrEmail1.setText(em);
            compAddress1.setText(ca);
            compDetails1.setText(cd);

        }

    }
}
