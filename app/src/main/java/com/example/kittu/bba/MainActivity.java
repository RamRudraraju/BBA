package com.example.kittu.bba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    Dbhandler Db1 = new Dbhandler(this);

    EditText TFusername, TFpassword;
    Button Bsignup, Blogin;
    String Username, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TFusername = (EditText) findViewById(R.id.TFusername);
        TFpassword = (EditText) findViewById(R.id.TFpassword);
        Bsignup = (Button) findViewById(R.id.Bsignup);
        Blogin = (Button) findViewById(R.id.Blogin);


        View.OnClickListener lsave = new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent is = new Intent(MainActivity.this, Signupac.class);
                startActivity(is);
            }
        };
        Bsignup.setOnClickListener(lsave);

        View.OnClickListener log = new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Toast tl = Toast.makeText(MainActivity.this, "Entered in to the login", Toast.LENGTH_SHORT);
                tl.show();

                TFusername = (EditText) findViewById(R.id.TFusername); // TFusername
                Username = TFusername.getText().toString();

                TFpassword = (EditText) findViewById(R.id.TFpassword);
                Password = TFpassword.getText().toString();

                Log.d(TAG, "onClick: Of Login ");

                //  Opassword = Db1.searchPass(Username, Password);
                Boolean tf = Db1.searchPass(Username, Password);

                if(tf){
                    Log.d(TAG, "Login Successful");

                    Toast t = Toast.makeText(MainActivity.this, "Login Successful ", Toast.LENGTH_SHORT);
                    t.show();

                    Intent is = new Intent(MainActivity.this, Success.class);
                    startActivity(is);
                }
                else
                {
                    Toast t = Toast.makeText(MainActivity.this, "Wrong Username OR Password ", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        };
        Blogin.setOnClickListener(log);

    }
}
