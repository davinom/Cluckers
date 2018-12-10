package com.example.sanghoon.cluckersproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    final String s = "false";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        //StrictMode.setThreadPolicy(policy);
        /*
        try {
            SheetsQuickstart.SearchColumn(0);
            Toast.makeText(this, "pass", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "fail", Toast.LENGTH_SHORT).show();
        }
        */
        Button Schedule = findViewById(R.id.Schedule);
        Schedule.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passInfo(s);
            }
        });

        Button Availability = findViewById(R.id.Availability);
        Availability.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent availability = new Intent(MainActivity.this, Availability.class);
                startActivity(availability);
            }
        });

        final Button ClockInOut = findViewById(R.id.ClockInOut);
        ClockInOut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent clockInOut = new Intent(MainActivity.this, ClockInOut.class);
                startActivity(clockInOut);
            }
        });

        Button Login = findViewById(R.id.Login);
        Login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent login = new Intent(MainActivity.this, Login.class);
                startActivity(login);
            }
        });


        Button Exit = findViewById(R.id.Exit);
        Exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

    private void showToast(String text) {
        Toast login = Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT);
        login.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 150);
        login.show();
    }

    public void passInfo(String s) {
        Intent intent = new Intent(MainActivity.this, Schedule.class);
        intent.putExtra("login", s);
        startActivity(intent);
    }
}