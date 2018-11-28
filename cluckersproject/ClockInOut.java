package com.example.sanghoon.cluckersproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ClockInOut extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_in_out);

        ArrayList<String> testArray = new ArrayList<>();
        for (int i = 0; i < 25; i++)
        {
            testArray.add("test word: " + Integer.toString(i));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, testArray);
        ListView testListView = findViewById(R.id.listViewTest);
        testListView.setAdapter(arrayAdapter);

        testListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Button clockIn = findViewById(R.id.clockInButton);
                clockIn.setVisibility(View.VISIBLE);
                clockIn.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        recordTime();
                    }
                } );

                Button clockOut = findViewById(R.id.clockOutButton);
                clockOut.setVisibility(View.VISIBLE);
                clockOut.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        recordTime();
                    }
                } );
            }
        } );
    }

    public void recordTime()
    {
        Date currentTime = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        String time = dateFormat.format(currentTime);
        Toast text = Toast.makeText(ClockInOut.this, time, Toast.LENGTH_LONG);
        text.setGravity(Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0 , 150);
        text.show();
        //return time;
    }
}