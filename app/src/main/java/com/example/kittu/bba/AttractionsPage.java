package com.example.kittu.bba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class AttractionsPage extends AppCompatActivity {

    ListView lv ;
    ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions_page);

        EditText filter = (EditText) findViewById(R.id.filter);
        lv = (ListView) findViewById(R.id.listViewAtt);

         mAdapter = new ArrayAdapter<String>(AttractionsPage.this,
                android.R.layout.simple_expandable_list_item_1,
                getResources().getStringArray(R.array.Birmingham));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(AttractionsPage.this, AttractionDetails.class);         // (String Name , Type of value)
                intent.putExtra("AttractionName", lv.getItemAtPosition(i).toString());         // Attaching Data to ListView.
                startActivity(intent);

            }
        });
        lv.setAdapter(mAdapter);

        filter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                (AttractionsPage.this).mAdapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }
}
