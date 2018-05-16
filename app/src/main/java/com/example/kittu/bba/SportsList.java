package com.example.kittu.bba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class SportsList extends AppCompatActivity {

    ListView listSport ;
    ArrayAdapter<String> mAdapterSport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_list);

        EditText filter = (EditText) findViewById(R.id.filterSport);
        listSport = (ListView) findViewById(R.id.listViewSport);

        mAdapterSport = new ArrayAdapter<String>(SportsList.this,
                android.R.layout.simple_expandable_list_item_1,
                getResources().getStringArray(R.array.BirminghamSportEvents));

        listSport.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SportsList.this, SportEvents.class);         // (String Name , Type of value)
                intent.putExtra("SportName", listSport.getItemAtPosition(i).toString());         // Attaching Data to ListView.
                startActivity(intent);

            }
        });
        listSport.setAdapter(mAdapterSport);

        filter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                (SportsList.this).mAdapterSport.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}
