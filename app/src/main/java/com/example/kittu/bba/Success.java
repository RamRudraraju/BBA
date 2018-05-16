package com.example.kittu.bba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Success extends AppCompatActivity {

    private Button cOptions, lAttraction, bBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        cOptions = (Button) findViewById(R.id.cOpt);
        lAttraction = (Button) findViewById(R.id.lAtt);
        bBack = (Button) findViewById(R.id.bBut);

        View.OnClickListener lback = new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent is = new Intent(Success.this, MainActivity.class);
                startActivity(is);
            }
        };
        bBack.setOnClickListener(lback);

        View.OnClickListener Attractions = new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent is = new Intent(Success.this, NotablePlaces.class);
                startActivity(is);
            }
        };
        lAttraction.setOnClickListener(Attractions);

        View.OnClickListener TechOptions = new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent is = new Intent(Success.this, TechSearch.class);
                startActivity(is);
            }
        };
        cOptions.setOnClickListener(TechOptions);
    }
}
