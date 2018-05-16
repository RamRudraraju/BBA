package com.example.kittu.bba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentCatogiry extends AppCompatActivity {

    Button bbsp, bbsu, bbfa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_catogiry);

        bbsp = (Button) findViewById(R.id.bSpring);
        bbsu = (Button) findViewById(R.id.bSummer);
        bbfa = (Button) findViewById(R.id.bFall);

        View.OnClickListener lsave2 = new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                Intent is = new Intent(StudentCatogiry.this, JobSearch.class);
                startActivity(is);
            }
        };
        bbsp.setOnClickListener(lsave2);
        bbsu.setOnClickListener(lsave2);
        bbfa.setOnClickListener(lsave2);

    }
}
