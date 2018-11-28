package com.example.sanghoon.cluckersproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Schedule extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        Button nextWeekButton = findViewById(R.id.nextWeekButton);
        nextWeekButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                LinearLayout week1schedule = findViewById(R.id.Week1Schedule);
                week1schedule.setVisibility(View.INVISIBLE);

                LinearLayout week2schedule = findViewById(R.id.Week2Schedule);
                week2schedule.setVisibility(View.VISIBLE);
            }
        } );

        Button lastWeekButton = findViewById(R.id.lastWeekButton);
        lastWeekButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                LinearLayout week2schedule = findViewById(R.id.Week2Schedule);
                week2schedule.setVisibility(View.INVISIBLE);

                LinearLayout week1schedule = findViewById(R.id.Week1Schedule);
                week1schedule.setVisibility(View.VISIBLE);
            }
        } );

        week1SundayFillListView();
        week1MondayFillListView();
        week1TuesdayFillListView();
        week1WednesdayFillListView();
        week1ThursdayFillListView();
        week1FridayFillListView();
        week1SaturdayFillListView();

        Boolean LoginInfo = getIntent().getExtras().getBoolean("login");
        if(LoginInfo = true) {
            LinearLayout week1schedule = findViewById(R.id.Week1Schedule);

            if (week1schedule.getVisibility() == View.VISIBLE)
            {
                findViewById(R.id.editWeek1Sunday).setVisibility(View.VISIBLE);
                findViewById(R.id.editWeek1Monday).setVisibility(View.VISIBLE);
                findViewById(R.id.editWeek1Tuesday).setVisibility(View.VISIBLE);
                findViewById(R.id.editWeek1Wednesday).setVisibility(View.VISIBLE);
                findViewById(R.id.editWeek1Thursday).setVisibility(View.VISIBLE);
                findViewById(R.id.editWeek1Friday).setVisibility(View.VISIBLE);
                findViewById(R.id.editWeek1Saturday).setVisibility(View.VISIBLE);
            }
            else
            {
                findViewById(R.id.editWeek2Sunday).setVisibility(View.VISIBLE);
                findViewById(R.id.editWeek2Monday).setVisibility(View.VISIBLE);
                findViewById(R.id.editWeek2Tuesday).setVisibility(View.VISIBLE);
                findViewById(R.id.editWeek2Wednesday).setVisibility(View.VISIBLE);
                findViewById(R.id.editWeek2Thursday).setVisibility(View.VISIBLE);
                findViewById(R.id.editWeek2Friday).setVisibility(View.VISIBLE);
                findViewById(R.id.editWeek2Saturday).setVisibility(View.VISIBLE);
            }
        }
    }

    public void week1SundayFillListView()
    {
        ArrayList<String> week1SundayArray = new ArrayList<>();
        for (int i = 0; i < 25; i++)
        {
            week1SundayArray.add("Employee #" + Integer.toString(i));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, week1SundayArray);
        ListView week1Sunday = findViewById(R.id.week1SundayList);
        week1Sunday.setAdapter(arrayAdapter);
    }

    public void week1MondayFillListView()
    {
        ArrayList<String> week1MondayArray = new ArrayList<>();
        for (int i = 0; i < 25; i++)
        {
            week1MondayArray.add("Employee #" + Integer.toString(i));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, week1MondayArray);
        ListView week1Monday = findViewById(R.id.week1MondayList);
        week1Monday.setAdapter(arrayAdapter);
    }

    public void week1TuesdayFillListView()
    {
        ArrayList<String> week1TuesdayArray = new ArrayList<>();
        for (int i = 0; i < 25; i++)
        {
            week1TuesdayArray.add("Employee #" + Integer.toString(i));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, week1TuesdayArray);
        ListView week1Tuesday = findViewById(R.id.week1TuesdayList);
        week1Tuesday.setAdapter(arrayAdapter);
    }

    public void week1WednesdayFillListView()
    {
        ArrayList<String> week1WednesdayArray = new ArrayList<>();
        for (int i = 0; i < 25; i++)
        {
            week1WednesdayArray.add("Employee #" + Integer.toString(i));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, week1WednesdayArray);
        ListView week1Wednesday = findViewById(R.id.week1WednesdayList);
        week1Wednesday.setAdapter(arrayAdapter);
    }

    public void week1ThursdayFillListView()
    {
        ArrayList<String> week1ThursdayArray = new ArrayList<>();
        for (int i = 0; i < 25; i++)
        {
            week1ThursdayArray.add("Employee #" + Integer.toString(i));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, week1ThursdayArray);
        ListView week1Thursday = findViewById(R.id.week1ThursdayList);
        week1Thursday.setAdapter(arrayAdapter);
    }

    public void week1FridayFillListView()
    {
        ArrayList<String> week1FridayArray = new ArrayList<>();
        for (int i = 0; i < 25; i++)
        {
            week1FridayArray.add("Employee #" + Integer.toString(i));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, week1FridayArray);
        ListView week1Friday = findViewById(R.id.week1FridayList);
        week1Friday.setAdapter(arrayAdapter);
    }

    public void week1SaturdayFillListView()
    {
        ArrayList<String> week1SaturdayArray = new ArrayList<>();
        for (int i = 0; i < 25; i++)
        {
            week1SaturdayArray.add("Employee #" + Integer.toString(i));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, week1SaturdayArray);
        ListView week1Saturday = findViewById(R.id.week1SaturdayList);
        week1Saturday.setAdapter(arrayAdapter);
    }
}
