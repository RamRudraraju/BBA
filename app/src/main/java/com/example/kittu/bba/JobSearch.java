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

public class JobSearch extends AppCompatActivity {

    ListView listViewJob ;
    ArrayAdapter<String> mAdapterJobs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_search);

        EditText filterJob = (EditText) findViewById(R.id.filterJobs);
        listViewJob = (ListView) findViewById(R.id.listViewJobs);

        mAdapterJobs = new ArrayAdapter<String>(JobSearch.this,
                android.R.layout.simple_expandable_list_item_1,
                getResources().getStringArray(R.array.BirminghamJobs));

        listViewJob.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(JobSearch.this, AvailableCompanies.class);         // (String Name , Type of value)
                intent.putExtra("Job Title:", listViewJob.getItemAtPosition(i).toString());         // Attaching Data to ListView.
                startActivity(intent);
            }
        });
        listViewJob.setAdapter(mAdapterJobs);

        filterJob.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                (JobSearch.this).mAdapterJobs.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}
