package com.example.kittu.bba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TechSearch extends AppCompatActivity {

    Button JSearch, ISearch, TEveSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_search);

        JSearch = (Button) findViewById(R.id.jSearch);
        ISearch = (Button) findViewById(R.id.iSearch) ;
        TEveSearch = (Button) findViewById(R.id.tEveSea);

        JSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TechSearch.this, JobSearch.class);
                startActivity(intent);
            }
        });

        ISearch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TechSearch.this, InternshipSearch.class);
                startActivity(intent);
            }
        });

        TEveSearch.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TechSearch.this, TechEventSearch.class);
                startActivity(intent);
            }
        });




    }
}
