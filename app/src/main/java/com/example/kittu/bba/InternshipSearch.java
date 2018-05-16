package com.example.kittu.bba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class InternshipSearch extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internship_search);

        b1 = (Button) findViewById(R.id.bb1);
        b2 = (Button) findViewById(R.id.bb2);
      //  b3 = (Button) findViewById(R.id.bb3);
        b4 = (Button) findViewById(R.id.bb4);
       // b5 = (Button) findViewById(R.id.bb5);
       // b6 = (Button) findViewById(R.id.bb6);


        View.OnClickListener lsave1 = new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                Intent is = new Intent(InternshipSearch.this, StudentCatogiry.class);
                startActivity(is);
            }
        };
        b1.setOnClickListener(lsave1);
        b2.setOnClickListener(lsave1);
      //  b3.setOnClickListener(lsave1);
        b4.setOnClickListener(lsave1);
     //   b5.setOnClickListener(lsave1);
      //  b6.setOnClickListener(lsave1);
    }
}
