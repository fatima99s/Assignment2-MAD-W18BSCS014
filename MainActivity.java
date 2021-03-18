package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView l;
    ArrayList<Jobs> jobs;
    private CustomerAdaptor userListViewAdapter;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String a,b;
        a="Software engineers and data scientists are two distinct, yet equally important roles in computer science. ...\n" +
                "Software engineers are responsible for creating and maintaining end-user systems. ...\n" +
                "Data scientists are responsible for analyzing the information that is produced from these systems.";
        b=" As a staff software engineer, your duties include finding and implementing solutions for issues, " +
                "creating new software or applications by writing code, using visual development environments to debug," +
                " and ensuring the technical architecture runs smoothly. ";
        l=findViewById(R.id.listview);
        jobs=new ArrayList<Jobs>();
        jobs.add(new Jobs("Senior Software Engineering Data ","House Canary" , " San Francisco","$150-$170",a));
        jobs.add(new Jobs("Staff Software Engineering ","One Medical " , " San Francisco","$120-170",b));

        userListViewAdapter = new CustomerAdaptor(jobs, this);
        l.setAdapter(userListViewAdapter);

        ListView list=findViewById(R.id.listview);
    }
}