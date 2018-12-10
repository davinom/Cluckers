package com.example.sanghoon.cluckersproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;


public class Schedule extends AppCompatActivity {

    ArrayList<String> EmployeeName;
    ArrayList<String> EmployeeTime;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        this.setTitle("Schedule");

        Button nextWeekButton = findViewById(R.id.nextWeekButton);
        nextWeekButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LinearLayout week1schedule = findViewById(R.id.Week1Schedule);
                week1schedule.setVisibility(View.INVISIBLE);

                LinearLayout week2schedule = findViewById(R.id.Week2Schedule);
                week2schedule.setVisibility(View.VISIBLE);
            }
        });

        Button lastWeekButton = findViewById(R.id.lastWeekButton);
        lastWeekButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LinearLayout week2schedule = findViewById(R.id.Week2Schedule);
                week2schedule.setVisibility(View.INVISIBLE);

                LinearLayout week1schedule = findViewById(R.id.Week1Schedule);
                week1schedule.setVisibility(View.VISIBLE);
            }
        });

        week1SundayFillListView();
        week1MondayFillListView();
        week1TuesdayFillListView();
        week1WednesdayFillListView();
        week1ThursdayFillListView();
        week1FridayFillListView();
        week1SaturdayFillListView();

        week2SundayFillListView();
        week2MondayFillListView();
        week2TuesdayFillListView();
        week2WednesdayFillListView();
        week2ThursdayFillListView();
        week2FridayFillListView();
        week2SaturdayFillListView();

        SimpleDateFormat mdformat = new SimpleDateFormat("MM / dd ");
        SimpleDateFormat dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        SimpleDateFormat dayOfWeekNumber = new SimpleDateFormat("u");
        Calendar calendar = Calendar.getInstance();


        if(dayOfWeek.format(calendar.getTime()).toUpperCase().equals("SUNDAY")) {
            TextView day1Text = findViewById(R.id.day1Name);
            calendar.add(Calendar.DAY_OF_YEAR, 0);
            String week1Sunday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day1Text.setText(week1Sunday);

            TextView day2Text = findViewById(R.id.day2Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Monday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day2Text.setText(week1Monday);

            TextView day3Text = findViewById(R.id.day3Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Tuesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day3Text.setText(week1Tuesday);

            TextView day4Text = findViewById(R.id.day4Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Wednesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day4Text.setText(week1Wednesday);

            TextView day5Text = findViewById(R.id.day5Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Thursday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day5Text.setText(week1Thursday);

            TextView day6Text = findViewById(R.id.day6Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Friday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day6Text.setText(week1Friday);

            TextView day7Text = findViewById(R.id.day7Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Saturday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day7Text.setText(week1Saturday);

            TextView day8Text = findViewById(R.id.day8Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Sunday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day8Text.setText(week2Sunday);

            TextView day9Text = findViewById(R.id.day9Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Monday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day9Text.setText(week2Monday);

            TextView day10Text = findViewById(R.id.day10Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Tuesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day10Text.setText(week2Tuesday);

            TextView day11Text = findViewById(R.id.day11Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Wednesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day11Text.setText(week2Wednesday);

            TextView day12Text = findViewById(R.id.day12Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Thursday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day12Text.setText(week2Thursday);

            TextView day13Text = findViewById(R.id.day13Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Friday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day13Text.setText(week2Friday);

            TextView day14Text = findViewById(R.id.day14Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Saturday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day14Text.setText(week2Saturday);
        }
        else if(dayOfWeek.format(calendar.getTime()).toUpperCase().equals("MONDAY"))
        {
            TextView day1Text = findViewById(R.id.day1Name);
            calendar.add(Calendar.DAY_OF_YEAR, -1);
            String week1Sunday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day1Text.setText(week1Sunday);

            TextView day2Text = findViewById(R.id.day2Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Monday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day2Text.setText(week1Monday);

            TextView day3Text = findViewById(R.id.day3Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Tuesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day3Text.setText(week1Tuesday);

            TextView day4Text = findViewById(R.id.day4Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Wednesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day4Text.setText(week1Wednesday);

            TextView day5Text = findViewById(R.id.day5Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Thursday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day5Text.setText(week1Thursday);

            TextView day6Text = findViewById(R.id.day6Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Friday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day6Text.setText(week1Friday);

            TextView day7Text = findViewById(R.id.day7Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Saturday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day7Text.setText(week1Saturday);

            TextView day8Text = findViewById(R.id.day8Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Sunday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day8Text.setText(week2Sunday);

            TextView day9Text = findViewById(R.id.day9Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Monday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day9Text.setText(week2Monday);

            TextView day10Text = findViewById(R.id.day10Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Tuesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day10Text.setText(week2Tuesday);

            TextView day11Text = findViewById(R.id.day11Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Wednesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day11Text.setText(week2Wednesday);

            TextView day12Text = findViewById(R.id.day12Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Thursday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day12Text.setText(week2Thursday);

            TextView day13Text = findViewById(R.id.day13Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Friday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day13Text.setText(week2Friday);

            TextView day14Text = findViewById(R.id.day14Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Saturday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day14Text.setText(week2Saturday);
        }
        else if(dayOfWeek.format(calendar.getTime()).toUpperCase().equals("TUESDAY"))
        {
            TextView day1Text = findViewById(R.id.day1Name);
            calendar.add(Calendar.DAY_OF_YEAR, -2);
            String week1Sunday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day1Text.setText(week1Sunday);

            TextView day2Text = findViewById(R.id.day2Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Monday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day2Text.setText(week1Monday);

            TextView day3Text = findViewById(R.id.day3Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Tuesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day3Text.setText(week1Tuesday);

            TextView day4Text = findViewById(R.id.day4Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Wednesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day4Text.setText(week1Wednesday);

            TextView day5Text = findViewById(R.id.day5Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Thursday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day5Text.setText(week1Thursday);

            TextView day6Text = findViewById(R.id.day6Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Friday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day6Text.setText(week1Friday);

            TextView day7Text = findViewById(R.id.day7Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Saturday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day7Text.setText(week1Saturday);

            TextView day8Text = findViewById(R.id.day8Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Sunday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day8Text.setText(week2Sunday);

            TextView day9Text = findViewById(R.id.day9Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Monday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day9Text.setText(week2Monday);

            TextView day10Text = findViewById(R.id.day10Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Tuesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day10Text.setText(week2Tuesday);

            TextView day11Text = findViewById(R.id.day11Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Wednesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day11Text.setText(week2Wednesday);

            TextView day12Text = findViewById(R.id.day12Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Thursday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day12Text.setText(week2Thursday);

            TextView day13Text = findViewById(R.id.day13Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Friday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day13Text.setText(week2Friday);

            TextView day14Text = findViewById(R.id.day14Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Saturday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day14Text.setText(week2Saturday);
        }
        else if(dayOfWeek.format(calendar.getTime()).toUpperCase().equals("WEDNESDAY"))
        {
            TextView day1Text = findViewById(R.id.day1Name);
            calendar.add(Calendar.DAY_OF_YEAR, -3);
            String week1Sunday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day1Text.setText(week1Sunday);

            TextView day2Text = findViewById(R.id.day2Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Monday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day2Text.setText(week1Monday);

            TextView day3Text = findViewById(R.id.day3Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Tuesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day3Text.setText(week1Tuesday);

            TextView day4Text = findViewById(R.id.day4Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Wednesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day4Text.setText(week1Wednesday);

            TextView day5Text = findViewById(R.id.day5Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Thursday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day5Text.setText(week1Thursday);

            TextView day6Text = findViewById(R.id.day6Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Friday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day6Text.setText(week1Friday);

            TextView day7Text = findViewById(R.id.day7Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Saturday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day7Text.setText(week1Saturday);

            TextView day8Text = findViewById(R.id.day8Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Sunday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day8Text.setText(week2Sunday);

            TextView day9Text = findViewById(R.id.day9Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Monday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day9Text.setText(week2Monday);

            TextView day10Text = findViewById(R.id.day10Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Tuesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day10Text.setText(week2Tuesday);

            TextView day11Text = findViewById(R.id.day11Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Wednesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day11Text.setText(week2Wednesday);

            TextView day12Text = findViewById(R.id.day12Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Thursday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day12Text.setText(week2Thursday);

            TextView day13Text = findViewById(R.id.day13Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Friday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day13Text.setText(week2Friday);

            TextView day14Text = findViewById(R.id.day14Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Saturday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day14Text.setText(week2Saturday);
        }
        else if(dayOfWeek.format(calendar.getTime()).toUpperCase().equals("THURSDAY"))
        {
            TextView day1Text = findViewById(R.id.day1Name);
            calendar.add(Calendar.DAY_OF_YEAR, -4);
            String week1Sunday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day1Text.setText(week1Sunday);

            TextView day2Text = findViewById(R.id.day2Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Monday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day2Text.setText(week1Monday);

            TextView day3Text = findViewById(R.id.day3Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Tuesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day3Text.setText(week1Tuesday);

            TextView day4Text = findViewById(R.id.day4Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Wednesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day4Text.setText(week1Wednesday);

            TextView day5Text = findViewById(R.id.day5Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Thursday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day5Text.setText(week1Thursday);

            TextView day6Text = findViewById(R.id.day6Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Friday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day6Text.setText(week1Friday);

            TextView day7Text = findViewById(R.id.day7Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Saturday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day7Text.setText(week1Saturday);

            TextView day8Text = findViewById(R.id.day8Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Sunday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day8Text.setText(week2Sunday);

            TextView day9Text = findViewById(R.id.day9Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Monday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day9Text.setText(week2Monday);

            TextView day10Text = findViewById(R.id.day10Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Tuesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day10Text.setText(week2Tuesday);

            TextView day11Text = findViewById(R.id.day11Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Wednesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day11Text.setText(week2Wednesday);

            TextView day12Text = findViewById(R.id.day12Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Thursday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day12Text.setText(week2Thursday);

            TextView day13Text = findViewById(R.id.day13Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Friday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day13Text.setText(week2Friday);

            TextView day14Text = findViewById(R.id.day14Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Saturday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day14Text.setText(week2Saturday);
        }
        else if(dayOfWeek.format(calendar.getTime()).toUpperCase().equals("FRIDAY"))
        {
            TextView day1Text = findViewById(R.id.day1Name);
            calendar.add(Calendar.DAY_OF_YEAR, -5);
            String week1Sunday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day1Text.setText(week1Sunday);

            TextView day2Text = findViewById(R.id.day2Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Monday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day2Text.setText(week1Monday);

            TextView day3Text = findViewById(R.id.day3Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Tuesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day3Text.setText(week1Tuesday);

            TextView day4Text = findViewById(R.id.day4Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Wednesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day4Text.setText(week1Wednesday);

            TextView day5Text = findViewById(R.id.day5Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Thursday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day5Text.setText(week1Thursday);

            TextView day6Text = findViewById(R.id.day6Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Friday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day6Text.setText(week1Friday);

            TextView day7Text = findViewById(R.id.day7Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Saturday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day7Text.setText(week1Saturday);

            TextView day8Text = findViewById(R.id.day8Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Sunday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day8Text.setText(week2Sunday);

            TextView day9Text = findViewById(R.id.day9Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Monday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day9Text.setText(week2Monday);

            TextView day10Text = findViewById(R.id.day10Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Tuesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day10Text.setText(week2Tuesday);

            TextView day11Text = findViewById(R.id.day11Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Wednesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day11Text.setText(week2Wednesday);

            TextView day12Text = findViewById(R.id.day12Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Thursday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day12Text.setText(week2Thursday);

            TextView day13Text = findViewById(R.id.day13Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Friday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day13Text.setText(week2Friday);

            TextView day14Text = findViewById(R.id.day14Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Saturday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day14Text.setText(week2Saturday);
        }
        else if(dayOfWeek.format(calendar.getTime()).toUpperCase().equals("SATURDAY"))
        {
            TextView day1Text = findViewById(R.id.day1Name);
            calendar.add(Calendar.DAY_OF_YEAR, -6);
            String week1Sunday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day1Text.setText(week1Sunday);

            TextView day2Text = findViewById(R.id.day2Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Monday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day2Text.setText(week1Monday);

            TextView day3Text = findViewById(R.id.day3Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Tuesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day3Text.setText(week1Tuesday);

            TextView day4Text = findViewById(R.id.day4Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Wednesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day4Text.setText(week1Wednesday);

            TextView day5Text = findViewById(R.id.day5Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Thursday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day5Text.setText(week1Thursday);

            TextView day6Text = findViewById(R.id.day6Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Friday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day6Text.setText(week1Friday);

            TextView day7Text = findViewById(R.id.day7Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week1Saturday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day7Text.setText(week1Saturday);

            TextView day8Text = findViewById(R.id.day8Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Sunday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day8Text.setText(week2Sunday);

            TextView day9Text = findViewById(R.id.day9Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Monday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day9Text.setText(week2Monday);

            TextView day10Text = findViewById(R.id.day10Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Tuesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day10Text.setText(week2Tuesday);

            TextView day11Text = findViewById(R.id.day11Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Wednesday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day11Text.setText(week2Wednesday);

            TextView day12Text = findViewById(R.id.day12Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Thursday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day12Text.setText(week2Thursday);

            TextView day13Text = findViewById(R.id.day13Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Friday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day13Text.setText(week2Friday);

            TextView day14Text = findViewById(R.id.day14Name);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            String week2Saturday = dayOfWeek.format(calendar.getTime()).toUpperCase() + ": " + "\n" + mdformat.format(calendar.getTime());
            day14Text.setText(week2Saturday);
        }


        String y = getIntent().getExtras().getString("login2");

        if(y == null)
        {
            y = "";
        }

        if(y.equals("true"))
        {
            findViewById(R.id.editWeek1Sunday).setVisibility(View.VISIBLE);
            findViewById(R.id.editWeek1Monday).setVisibility(View.VISIBLE);
            findViewById(R.id.editWeek1Tuesday).setVisibility(View.VISIBLE);
            findViewById(R.id.editWeek1Wednesday).setVisibility(View.VISIBLE);
            findViewById(R.id.editWeek1Thursday).setVisibility(View.VISIBLE);
            findViewById(R.id.editWeek1Friday).setVisibility(View.VISIBLE);
            findViewById(R.id.editWeek1Saturday).setVisibility(View.VISIBLE);

            findViewById(R.id.editWeek2Sunday).setVisibility(View.VISIBLE);
            findViewById(R.id.editWeek2Monday).setVisibility(View.VISIBLE);
            findViewById(R.id.editWeek2Tuesday).setVisibility(View.VISIBLE);
            findViewById(R.id.editWeek2Wednesday).setVisibility(View.VISIBLE);
            findViewById(R.id.editWeek2Thursday).setVisibility(View.VISIBLE);
            findViewById(R.id.editWeek2Friday).setVisibility(View.VISIBLE);
            findViewById(R.id.editWeek2Saturday).setVisibility(View.VISIBLE);
        }
        else
        {
        }

        Button editWeek1Sunday = findViewById(R.id.editWeek1Sunday);
        editWeek1Sunday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passDayInfo(((TextView) findViewById(R.id.day1Name)).getText().toString(), EmployeeName, EmployeeTime);
            }
        });

        Button editWeek1Monday = findViewById(R.id.editWeek1Monday);
        editWeek1Monday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passDayInfo(((TextView) findViewById(R.id.day2Name)).getText().toString(), EmployeeName, EmployeeTime);
            }
        });

        Button editWeek1Tuesday = findViewById(R.id.editWeek1Tuesday);
        editWeek1Tuesday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passDayInfo(((TextView) findViewById(R.id.day3Name)).getText().toString(), EmployeeName, EmployeeTime);
            }
        });

        Button editWeek1Wednesday = findViewById(R.id.editWeek1Wednesday);
        editWeek1Wednesday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passDayInfo(((TextView) findViewById(R.id.day4Name)).getText().toString(), EmployeeName, EmployeeTime);
            }
        });

        Button editWeek1Thursday = findViewById(R.id.editWeek1Thursday);
        editWeek1Thursday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passDayInfo(((TextView) findViewById(R.id.day5Name)).getText().toString(), EmployeeName, EmployeeTime);
            }
        });

        Button editWeek1Friday = findViewById(R.id.editWeek1Friday);
        editWeek1Friday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passDayInfo(((TextView) findViewById(R.id.day6Name)).getText().toString(), EmployeeName, EmployeeTime);
            }
        });

        Button editWeek1Saturday = findViewById(R.id.editWeek1Saturday);
        editWeek1Saturday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passDayInfo(((TextView) findViewById(R.id.day7Name)).getText().toString(),EmployeeName, EmployeeTime);
            }
        });

        Button editWeek2Sunday = findViewById(R.id.editWeek2Sunday);
        editWeek2Sunday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passDayInfo(((TextView) findViewById(R.id.day8Name)).getText().toString(), EmployeeName, EmployeeTime);
            }
        });

        Button editWeek2Monday = findViewById(R.id.editWeek2Monday);
        editWeek2Monday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passDayInfo(((TextView) findViewById(R.id.day9Name)).getText().toString(), EmployeeName, EmployeeTime);
            }
        });

        Button editWeek2Tuesday = findViewById(R.id.editWeek2Tuesday);
        editWeek2Tuesday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passDayInfo(((TextView) findViewById(R.id.day10Name)).getText().toString(), EmployeeName, EmployeeTime);
            }
        });

        Button editWeek2Wednesday = findViewById(R.id.editWeek2Wednesday);
        editWeek2Wednesday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passDayInfo(((TextView) findViewById(R.id.day11Name)).getText().toString(), EmployeeName, EmployeeTime);
            }
        });

        Button editWeek2Thursday = findViewById(R.id.editWeek2Thursday);
        editWeek2Thursday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passDayInfo(((TextView) findViewById(R.id.day12Name)).getText().toString(), EmployeeName, EmployeeTime);
            }
        });

        Button editWeek2Friday = findViewById(R.id.editWeek2Friday);
        editWeek2Friday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passDayInfo(((TextView) findViewById(R.id.day13Name)).getText().toString(), EmployeeName, EmployeeTime);
            }
        });

        Button editWeek2Saturday = findViewById(R.id.editWeek2Saturday);
        editWeek2Saturday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passDayInfo(((TextView) findViewById(R.id.day14Name)).getText().toString(), EmployeeName, EmployeeTime);
            }
        });
    }

    public void week1SundayFillListView() {
        final ArrayList<String> week1SundayArray = new ArrayList<>();
        week1SundayArray.add("Sanghoon Park");
        week1SundayArray.add("Matt Davino");
        week1SundayArray.add("Adam Cancglin");
        week1SundayArray.add("Joe Lashine");
        week1SundayArray.add("Corey Wright");
        final ArrayList<String> week1SundayArraySubtext = new ArrayList<>();
        week1SundayArraySubtext.add("9:00 AM - 3:00 PM");
        week1SundayArraySubtext.add("11:00 AM - 6:00 PM");
        week1SundayArraySubtext.add("12:00 PM - 4:30 PM");
        week1SundayArraySubtext.add("9:00 AM - 12:00 PM");
        week1SundayArraySubtext.add("1:30 AM - 6:00 PM");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, week1SundayArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(week1SundayArray.get(position));
                text2.setText(week1SundayArraySubtext.get(position));
                return view;
            }
        };
        ListView week1Sunday = findViewById(R.id.week1SundayList);
        week1Sunday.setAdapter(arrayAdapter);
        EmployeeName = week1SundayArray;
        EmployeeTime = week1SundayArraySubtext;
    }

    public void week1MondayFillListView() {
        final ArrayList<String> week1MondayArray = new ArrayList<>();
        week1MondayArray.add("Sanghoon Park");
        week1MondayArray.add("Matt Davino");
        week1MondayArray.add("Adam Cancglin");
        week1MondayArray.add("Joe Lashine");
        week1MondayArray.add("Corey Wright");
        final ArrayList<String> week1MondayArraySubtext = new ArrayList<>();
        week1MondayArraySubtext.add("9:00 AM - 3:00 PM");
        week1MondayArraySubtext.add("11:00 AM - 6:00 PM");
        week1MondayArraySubtext.add("12:00 PM - 4:30 PM");
        week1MondayArraySubtext.add("9:00 AM - 12:00 PM");
        week1MondayArraySubtext.add("1:30 AM - 6:00 PM");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, week1MondayArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(week1MondayArray.get(position));
                text2.setText(week1MondayArraySubtext.get(position));
                return view;
            }
        };
        ListView week1Monday = findViewById(R.id.week1MondayList);
        week1Monday.setAdapter(arrayAdapter);
        EmployeeName = week1MondayArray;
        EmployeeTime = week1MondayArraySubtext;
    }

    public void week1TuesdayFillListView() {
        final ArrayList<String> week1TuesdayArray = new ArrayList<>();
        week1TuesdayArray.add("Sanghoon Park");
        week1TuesdayArray.add("Matt Davino");
        week1TuesdayArray.add("Adam Cancglin");
        week1TuesdayArray.add("Joe Lashine");
        week1TuesdayArray.add("Corey Wright");
        final ArrayList<String> week1TuesdayArraySubtext = new ArrayList<>();
        week1TuesdayArraySubtext.add("9:00 AM - 3:00 PM");
        week1TuesdayArraySubtext.add("11:00 AM - 6:00 PM");
        week1TuesdayArraySubtext.add("12:00 PM - 4:30 PM");
        week1TuesdayArraySubtext.add("9:00 AM - 12:00 PM");
        week1TuesdayArraySubtext.add("1:30 AM - 6:00 PM");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, week1TuesdayArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(week1TuesdayArray.get(position));
                text2.setText(week1TuesdayArraySubtext.get(position));
                return view;
            }
        };
        ListView week1Tuesday = findViewById(R.id.week1TuesdayList);
        week1Tuesday.setAdapter(arrayAdapter);
        EmployeeName = week1TuesdayArray;
        EmployeeTime = week1TuesdayArraySubtext;
    }

    public void week1WednesdayFillListView() {
        final ArrayList<String> week1WednesdayArray = new ArrayList<>();
        week1WednesdayArray.add("Sanghoon Park");
        week1WednesdayArray.add("Matt Davino");
        week1WednesdayArray.add("Adam Cancglin");
        week1WednesdayArray.add("Joe Lashine");
        week1WednesdayArray.add("Corey Wright");
        final ArrayList<String> week1WednesdayArraySubtext = new ArrayList<>();
        week1WednesdayArraySubtext.add("9:00 AM - 3:00 PM");
        week1WednesdayArraySubtext.add("11:00 AM - 6:00 PM");
        week1WednesdayArraySubtext.add("12:00 PM - 4:30 PM");
        week1WednesdayArraySubtext.add("9:00 AM - 12:00 PM");
        week1WednesdayArraySubtext.add("1:30 AM - 6:00 PM");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, week1WednesdayArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(week1WednesdayArray.get(position));
                text2.setText(week1WednesdayArraySubtext.get(position));
                return view;
            }
        };
        ListView week1Wednesday = findViewById(R.id.week1WednesdayList);
        week1Wednesday.setAdapter(arrayAdapter);
        EmployeeName = week1WednesdayArray;
        EmployeeTime = week1WednesdayArraySubtext;
    }

    public void week1ThursdayFillListView() {
        final ArrayList<String> week1ThursdayArray = new ArrayList<>();
        week1ThursdayArray.add("Sanghoon Park");
        week1ThursdayArray.add("Matt Davino");
        week1ThursdayArray.add("Adam Cancglin");
        week1ThursdayArray.add("Joe Lashine");
        week1ThursdayArray.add("Corey Wright");
        final ArrayList<String> week1ThursdayArraySubtext = new ArrayList<>();
        week1ThursdayArraySubtext.add("9:00 AM - 3:00 PM");
        week1ThursdayArraySubtext.add("11:00 AM - 6:00 PM");
        week1ThursdayArraySubtext.add("12:00 PM - 4:30 PM");
        week1ThursdayArraySubtext.add("9:00 AM - 12:00 PM");
        week1ThursdayArraySubtext.add("1:30 AM - 6:00 PM");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, week1ThursdayArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(week1ThursdayArray.get(position));
                text2.setText(week1ThursdayArraySubtext.get(position));
                return view;
            }
        };
        ListView week1Thursday = findViewById(R.id.week1ThursdayList);
        week1Thursday.setAdapter(arrayAdapter);
        EmployeeName = week1ThursdayArray;
        EmployeeTime = week1ThursdayArraySubtext;
    }

    public void week1FridayFillListView() {
        final ArrayList<String> week1FridayArray = new ArrayList<>();
        week1FridayArray.add("Sanghoon Park");
        week1FridayArray.add("Matt Davino");
        week1FridayArray.add("Adam Cancglin");
        week1FridayArray.add("Joe Lashine");
        week1FridayArray.add("Corey Wright");
        final ArrayList<String> week1FridayArraySubtext = new ArrayList<>();
        week1FridayArraySubtext.add("9:00 AM - 3:00 PM");
        week1FridayArraySubtext.add("11:00 AM - 6:00 PM");
        week1FridayArraySubtext.add("12:00 PM - 4:30 PM");
        week1FridayArraySubtext.add("9:00 AM - 12:00 PM");
        week1FridayArraySubtext.add("1:30 AM - 6:00 PM");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, week1FridayArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(week1FridayArray.get(position));
                text2.setText(week1FridayArraySubtext.get(position));
                return view;
            }
        };
        ListView week1Friday = findViewById(R.id.week1FridayList);
        week1Friday.setAdapter(arrayAdapter);
        EmployeeName = week1FridayArray;
        EmployeeTime = week1FridayArraySubtext;
    }

    public void week1SaturdayFillListView() {
        final ArrayList<String> week1SaturdayArray = new ArrayList<>();
        week1SaturdayArray.add("Sanghoon Park");
        week1SaturdayArray.add("Matt Davino");
        week1SaturdayArray.add("Adam Cancglin");
        week1SaturdayArray.add("Joe Lashine");
        week1SaturdayArray.add("Corey Wright");
        final ArrayList<String> week1SaturdayArraySubtext = new ArrayList<>();
        week1SaturdayArraySubtext.add("9:00 AM - 3:00 PM");
        week1SaturdayArraySubtext.add("11:00 AM - 6:00 PM");
        week1SaturdayArraySubtext.add("12:00 PM - 4:30 PM");
        week1SaturdayArraySubtext.add("9:00 AM - 12:00 PM");
        week1SaturdayArraySubtext.add("1:30 AM - 6:00 PM");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, week1SaturdayArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(week1SaturdayArray.get(position));
                text2.setText(week1SaturdayArraySubtext.get(position));
                return view;
            }
        };
        ListView week1Saturday = findViewById(R.id.week1SaturdayList);
        week1Saturday.setAdapter(arrayAdapter);
        EmployeeName = week1SaturdayArray;
        EmployeeTime = week1SaturdayArraySubtext;
    }

    public void week2SundayFillListView() {
        final ArrayList<String> week2SundayArray = new ArrayList<>();
        week2SundayArray.add("Sanghoon Park");
        week2SundayArray.add("Matt Davino");
        week2SundayArray.add("Adam Cancglin");
        week2SundayArray.add("Joe Lashine");
        week2SundayArray.add("Corey Wright");
        final ArrayList<String> week2SundayArraySubtext = new ArrayList<>();
        week2SundayArraySubtext.add("9:00 AM - 3:00 PM");
        week2SundayArraySubtext.add("11:00 AM - 6:00 PM");
        week2SundayArraySubtext.add("12:00 PM - 4:30 PM");
        week2SundayArraySubtext.add("9:00 AM - 12:00 PM");
        week2SundayArraySubtext.add("1:30 AM - 6:00 PM");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, week2SundayArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(week2SundayArray.get(position));
                text2.setText(week2SundayArraySubtext.get(position));
                return view;
            }
        };
        ListView week2Sunday = findViewById(R.id.week2SundayList);
        week2Sunday.setAdapter(arrayAdapter);
        EmployeeName = week2SundayArray;
        EmployeeTime = week2SundayArraySubtext;
    }

    public void week2MondayFillListView() {
        final ArrayList<String> week2MondayArray = new ArrayList<>();
        week2MondayArray.add("Sanghoon Park");
        week2MondayArray.add("Matt Davino");
        week2MondayArray.add("Adam Cancglin");
        week2MondayArray.add("Joe Lashine");
        week2MondayArray.add("Corey Wright");
        final ArrayList<String> week2MondayArraySubtext = new ArrayList<>();
        week2MondayArraySubtext.add("9:00 AM - 3:00 PM");
        week2MondayArraySubtext.add("11:00 AM - 6:00 PM");
        week2MondayArraySubtext.add("12:00 PM - 4:30 PM");
        week2MondayArraySubtext.add("9:00 AM - 12:00 PM");
        week2MondayArraySubtext.add("1:30 AM - 6:00 PM");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, week2MondayArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(week2MondayArray.get(position));
                text2.setText(week2MondayArray.get(position));
                return view;
            }
        };
        ListView week2Monday = findViewById(R.id.week2MondayList);
        week2Monday.setAdapter(arrayAdapter);
        EmployeeName = week2MondayArray;
        EmployeeTime = week2MondayArraySubtext;
    }

    public void week2TuesdayFillListView() {
        final ArrayList<String> week2TuesdayArray = new ArrayList<>();
        week2TuesdayArray.add("Sanghoon Park");
        week2TuesdayArray.add("Matt Davino");
        week2TuesdayArray.add("Adam Cancglin");
        week2TuesdayArray.add("Joe Lashine");
        week2TuesdayArray.add("Corey Wright");
        final ArrayList<String> week2TuesdayArraySubtext = new ArrayList<>();
        week2TuesdayArraySubtext.add("9:00 AM - 3:00 PM");
        week2TuesdayArraySubtext.add("11:00 AM - 6:00 PM");
        week2TuesdayArraySubtext.add("12:00 PM - 4:30 PM");
        week2TuesdayArraySubtext.add("9:00 AM - 12:00 PM");
        week2TuesdayArraySubtext.add("1:30 AM - 6:00 PM");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, week2TuesdayArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(week2TuesdayArray.get(position));
                text2.setText(week2TuesdayArraySubtext.get(position));
                return view;
            }
        };
        ListView week2Tuesday = findViewById(R.id.week2TuesdayList);
        week2Tuesday.setAdapter(arrayAdapter);
        EmployeeName = week2TuesdayArray;
        EmployeeTime = week2TuesdayArraySubtext;
    }

    public void week2WednesdayFillListView() {
        final ArrayList<String> week2WednesdayArray = new ArrayList<>();
        week2WednesdayArray.add("Sanghoon Park");
        week2WednesdayArray.add("Matt Davino");
        week2WednesdayArray.add("Adam Cancglin");
        week2WednesdayArray.add("Joe Lashine");
        week2WednesdayArray.add("Corey Wright");
        final ArrayList<String> week2WednesdayArraySubtext = new ArrayList<>();
        week2WednesdayArraySubtext.add("9:00 AM - 3:00 PM");
        week2WednesdayArraySubtext.add("11:00 AM - 6:00 PM");
        week2WednesdayArraySubtext.add("12:00 PM - 4:30 PM");
        week2WednesdayArraySubtext.add("9:00 AM - 12:00 PM");
        week2WednesdayArraySubtext.add("1:30 AM - 6:00 PM");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, week2WednesdayArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(week2WednesdayArray.get(position));
                text2.setText(week2WednesdayArraySubtext.get(position));
                return view;
            }
        };
        ListView week1Wednesday = findViewById(R.id.week2WednesdayList);
        week1Wednesday.setAdapter(arrayAdapter);
        EmployeeName = week2WednesdayArray;
        EmployeeTime = week2WednesdayArraySubtext;
    }

    public void week2ThursdayFillListView() {
        final ArrayList<String> week2ThursdayArray = new ArrayList<>();
        week2ThursdayArray.add("Sanghoon Park");
        week2ThursdayArray.add("Matt Davino");
        week2ThursdayArray.add("Adam Cancglin");
        week2ThursdayArray.add("Joe Lashine");
        week2ThursdayArray.add("Corey Wright");
        final ArrayList<String> week2ThursdayArraySubtext = new ArrayList<>();
        week2ThursdayArraySubtext.add("9:00 AM - 3:00 PM");
        week2ThursdayArraySubtext.add("11:00 AM - 6:00 PM");
        week2ThursdayArraySubtext.add("12:00 PM - 4:30 PM");
        week2ThursdayArraySubtext.add("9:00 AM - 12:00 PM");
        week2ThursdayArraySubtext.add("1:30 AM - 6:00 PM");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, week2ThursdayArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(week2ThursdayArray.get(position));
                text2.setText(week2ThursdayArraySubtext.get(position));
                return view;
            }
        };
        ListView week2Thursday = findViewById(R.id.week2ThursdayList);
        week2Thursday.setAdapter(arrayAdapter);
        EmployeeName = week2ThursdayArray;
        EmployeeTime = week2ThursdayArraySubtext;
    }

    public void week2FridayFillListView() {
        final ArrayList<String> week2FridayArray = new ArrayList<>();
        week2FridayArray.add("Sanghoon Park");
        week2FridayArray.add("Matt Davino");
        week2FridayArray.add("Adam Cancglin");
        week2FridayArray.add("Joe Lashine");
        week2FridayArray.add("Corey Wright");
        final ArrayList<String> week2FridayArraySubtext = new ArrayList<>();
        week2FridayArraySubtext.add("9:00 AM - 3:00 PM");
        week2FridayArraySubtext.add("11:00 AM - 6:00 PM");
        week2FridayArraySubtext.add("12:00 PM - 4:30 PM");
        week2FridayArraySubtext.add("9:00 AM - 12:00 PM");
        week2FridayArraySubtext.add("1:30 AM - 6:00 PM");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, week2FridayArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(week2FridayArray.get(position));
                text2.setText(week2FridayArraySubtext.get(position));
                return view;
            }
        };
        ListView week2Friday = findViewById(R.id.week2FridayList);
        week2Friday.setAdapter(arrayAdapter);
        EmployeeName = week2FridayArray;
        EmployeeTime = week2FridayArraySubtext;
    }

    public void week2SaturdayFillListView() {
        final ArrayList<String> week2SaturdayArray = new ArrayList<>();
        week2SaturdayArray.add("Sanghoon Park");
        week2SaturdayArray.add("Matt Davino");
        week2SaturdayArray.add("Adam Cancglin");
        week2SaturdayArray.add("Joe Lashine");
        week2SaturdayArray.add("Corey Wright");
        final ArrayList<String> week2SaturdayArraySubtext = new ArrayList<>();
        week2SaturdayArraySubtext.add("9:00 AM - 3:00 PM");
        week2SaturdayArraySubtext.add("11:00 AM - 6:00 PM");
        week2SaturdayArraySubtext.add("12:00 PM - 4:30 PM");
        week2SaturdayArraySubtext.add("9:00 AM - 12:00 PM");
        week2SaturdayArraySubtext.add("1:30 AM - 6:00 PM");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, week2SaturdayArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(week2SaturdayArray.get(position));
                text2.setText(week2SaturdayArraySubtext.get(position));
                return view;
            }
        };
        ListView week2Saturday = findViewById(R.id.week2SaturdayList);
        week2Saturday.setAdapter(arrayAdapter);
        EmployeeName = week2SaturdayArray;
        EmployeeTime = week2SaturdayArraySubtext;
    }

    public void passDayInfo(String s, ArrayList l, ArrayList m)
    {
        Intent intent = new Intent(Schedule.this, EditScheduleDay.class);
        intent.putStringArrayListExtra("EmployeeName", l);
        intent.putStringArrayListExtra("EmployeeTime", m);
        intent.putExtra("dayInfo", s);
        startActivity(intent);
    }
}
