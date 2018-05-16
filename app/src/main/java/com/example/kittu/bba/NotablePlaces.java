package com.example.kittu.bba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NotablePlaces extends AppCompatActivity {

    Button places, sportEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notable_places);

        places = (Button) findViewById(R.id.listAtt);
        sportEvent = (Button) findViewById(R.id.sportEvent);

        View.OnClickListener lsave = new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                Intent is = new Intent(NotablePlaces.this, AttractionsPage.class);
                startActivity(is);
            }
        };
        places.setOnClickListener(lsave);

        View.OnClickListener se = new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                Intent is = new Intent(NotablePlaces.this, SportsList.class);
                startActivity(is);
            }
        };
        sportEvent.setOnClickListener(se);




    }
}
