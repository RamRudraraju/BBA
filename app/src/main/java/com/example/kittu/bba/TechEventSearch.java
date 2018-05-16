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

public class TechEventSearch extends AppCompatActivity {

    ListView lvTec ;
    ArrayAdapter<String> mAdapterTechEven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_event_search);


        EditText filterTE = (EditText) findViewById(R.id.filterTechEven);
        lvTec = (ListView) findViewById(R.id.listViewTecEven);

        mAdapterTechEven = new ArrayAdapter<String>(TechEventSearch.this,
                android.R.layout.simple_expandable_list_item_1,
                getResources().getStringArray(R.array.TechEvents));

        lvTec.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(TechEventSearch.this, TechEventDetails.class);         // (String Name , Type of value)
                intent.putExtra("TechEvents", lvTec.getItemAtPosition(i).toString());         // Attaching Data to ListView.
                startActivity(intent);
            }
        });
        lvTec.setAdapter(mAdapterTechEven);

        filterTE.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                (TechEventSearch.this).mAdapterTechEven.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });





    }
}
