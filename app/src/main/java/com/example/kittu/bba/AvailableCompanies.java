package com.example.kittu.bba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class AvailableCompanies extends AppCompatActivity {

    TextView JobTitle;
    ListView listCompanie;
    ArrayAdapter<String> mAdapterAvaCompanies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_companies);

        JobTitle = (TextView) findViewById(R.id.JobTitles);
        listCompanie = (ListView) findViewById(R.id.listCompanesForJobs);
                                                                                        // listCompanesForJobs
        Intent incomIntent = getIntent();
        String incomingName = incomIntent.getStringExtra("Job Title:");
        JobTitle.setText(incomingName);

        mAdapterAvaCompanies = new ArrayAdapter<String>(AvailableCompanies.this,
                android.R.layout.simple_expandable_list_item_1,
                getResources().getStringArray(R.array.BirminghamTechCompanies));

        listCompanie.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(AvailableCompanies.this, CompaniesDetails.class);         // (String Name , Type of value)
                intent.putExtra("CompanieName", listCompanie.getItemAtPosition(i).toString());         // Attaching Data to ListView.
                startActivity(intent);
            }
        });
        listCompanie.setAdapter(mAdapterAvaCompanies);



    }
}
