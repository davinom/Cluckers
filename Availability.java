package com.example.sanghoon.cluckersproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class Availability extends AppCompatActivity
{
    EditText startHourInput;
    EditText startMinuteInput;
    EditText endHourInput;
    EditText endMinuteInput;
    Spinner clockInAMPM;
    Spinner clockOutAMPM;
    String selectedItem;
    ArrayAdapter arrayAdapter;
    ArrayList<String> updatedArrayList;
    ArrayList<String> updatedArrayList2;
    ArrayList<String> availableEmployee;
    ArrayList<String> availableEmployeeTimeArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_availability);
        this.setTitle("Availability");

        availableEmployee = new ArrayList<>();
        availableEmployee.add("Sanghoon Park");
        availableEmployee.add("Matt Davino");
        availableEmployee.add("Adam Cancglin");
        availableEmployee.add("Joe Lashine");
        availableEmployee.add("Corey Wright");
        availableEmployeeTimeArray = new ArrayList<>();
        availableEmployeeTimeArray.add("9:00 AM - 3:00 PM");
        availableEmployeeTimeArray.add("11:00 AM - 6:00 PM");
        availableEmployeeTimeArray.add("12:00 PM - 4:30 PM");
        availableEmployeeTimeArray.add("9:00 AM - 12:00 PM");
        availableEmployeeTimeArray.add("1:30 AM - 6:00 PM");

        Button editAvailable = findViewById(R.id.editAvailabilityButton);
        editAvailable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.editAvailabilityButton).setVisibility(View.INVISIBLE);
                findViewById(R.id.editStartHourInput).setVisibility(View.VISIBLE);
                findViewById(R.id.editStartMinuteInput).setVisibility(View.VISIBLE);
                findViewById(R.id.editEndHourInput).setVisibility(View.VISIBLE);
                findViewById(R.id.editEndMinuteInput).setVisibility(View.VISIBLE);
                findViewById(R.id.clockInAMPM).setVisibility(View.VISIBLE);
                findViewById(R.id.clockOutAMPM).setVisibility(View.VISIBLE);
                findViewById(R.id.submitButton).setVisibility(View.VISIBLE);
            }
        });

        startHourInput = findViewById(R.id.editStartHourInput);
        startMinuteInput = findViewById(R.id.editStartMinuteInput);
        endHourInput = findViewById(R.id.editEndHourInput);
        endMinuteInput = findViewById(R.id.editEndMinuteInput);

        ArrayList<String> AMPMspinner = new ArrayList<>();
        AMPMspinner.add("AM");
        AMPMspinner.add("PM");

        clockInAMPM = findViewById(R.id.clockInAMPM);
        ArrayAdapter<String> adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, AMPMspinner);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        clockInAMPM.setAdapter(adapter1);

        clockOutAMPM = findViewById(R.id.clockOutAMPM);
        ArrayAdapter<String> adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, AMPMspinner);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        clockOutAMPM.setAdapter(adapter2);

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                String x = startHourInput.getText().toString();
                String y = startMinuteInput.getText().toString();
                String x2 = endHourInput.getText().toString();
                String y2 = endMinuteInput.getText().toString();
                String am = clockInAMPM.getSelectedItem().toString();
                String pm = clockOutAMPM.getSelectedItem().toString();

                if(x.equals("") || x2.equals("") || x.equals(".") || y.equals(".") || x2.equals(".") || y2.equals("."))
                {
                    startHourInput.getText().clear();
                    startMinuteInput.getText().clear();
                    endHourInput.getText().clear();
                    endMinuteInput.getText().clear();
                    Toast errorText = Toast.makeText(Availability.this, "Enter a Number", Toast.LENGTH_SHORT);
                    errorText.setGravity(Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0 , 150);
                    errorText.show();
                }
                else if(y.equals("") || y2.equals(""))
                {
                    if (y.equals(""))
                    {
                        y = "00";
                    }
                    if (y2.equals(""))
                    {
                        y2 = "00";
                    }
                    String time = x + ":" + y + " " + am + " - " + x2 + ":" + y2 + " " + pm;


                    updatedArrayList = new ArrayList<>();
                    updatedArrayList2 = new ArrayList<>();

                    for(int i = 0; i < availableEmployee.size(); i++) {
                        updatedArrayList.add(availableEmployee.get(i));
                        if (availableEmployee.get(i).equals(selectedItem)) {
                            updatedArrayList2.add(time);
                        } else {
                            updatedArrayList2.add(availableEmployeeTimeArray.get(i));
                        }
                    }

                    ArrayAdapter updatedArrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_2, android.R.id.text1, availableEmployee) {
                        @Override
                        public View getView(int position, View convertView, ViewGroup parent) {
                            View view = super.getView(position, convertView, parent);
                            TextView text1 = view.findViewById(android.R.id.text1);
                            TextView text2 = view.findViewById(android.R.id.text2);

                            text1.setText(updatedArrayList.get(position));
                            text2.setText(updatedArrayList2.get(position));
                            return view;
                        }
                    };

                    ListView availableListView = findViewById(R.id.availableList);
                    arrayAdapter = updatedArrayAdapter;
                    availableListView.setAdapter(arrayAdapter);
                    availableListView.invalidateViews();

                    findViewById(R.id.editStartHourInput).setVisibility(View.INVISIBLE);
                    findViewById(R.id.editStartMinuteInput).setVisibility(View.INVISIBLE);
                    findViewById(R.id.editEndHourInput).setVisibility(View.INVISIBLE);
                    findViewById(R.id.editEndMinuteInput).setVisibility(View.INVISIBLE);
                    findViewById(R.id.clockInAMPM).setVisibility(View.INVISIBLE);
                    findViewById(R.id.clockOutAMPM).setVisibility(View.INVISIBLE);
                    findViewById(R.id.submitButton).setVisibility(View.INVISIBLE);
                }
                else {
                    String time = x + ":" + y + " " + am + " - " + x2 + ":" + y2 + " " + pm;

                    updatedArrayList = new ArrayList<>();
                    updatedArrayList2 = new ArrayList<>();

                    for(int i = 0; i < availableEmployee.size(); i++)
                    {
                        updatedArrayList.add(availableEmployee.get(i));
                        if(availableEmployee.get(i).equals(selectedItem)) {
                            updatedArrayList2.add(time);
                        }
                        else
                        {
                            updatedArrayList2.add(availableEmployeeTimeArray.get(i));
                        }
                    }

                    ArrayAdapter updatedArrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_2, android.R.id.text1, availableEmployee) {
                        @Override
                        public View getView(int position, View convertView, ViewGroup parent) {
                            View view = super.getView(position, convertView, parent);
                            TextView text1 = view.findViewById(android.R.id.text1);
                            TextView text2 = view.findViewById(android.R.id.text2);

                            text1.setText(updatedArrayList.get(position));
                            text2.setText(updatedArrayList2.get(position));
                            return view;
                        }
                    };

                    ListView availableListView = findViewById(R.id.availableList);
                    arrayAdapter = updatedArrayAdapter;
                    availableListView.setAdapter(arrayAdapter);
                    availableListView.invalidateViews();

                    findViewById(R.id.editStartHourInput).setVisibility(View.INVISIBLE);
                    findViewById(R.id.editStartMinuteInput).setVisibility(View.INVISIBLE);
                    findViewById(R.id.editEndHourInput).setVisibility(View.INVISIBLE);
                    findViewById(R.id.editEndMinuteInput).setVisibility(View.INVISIBLE);
                    findViewById(R.id.clockInAMPM).setVisibility(View.INVISIBLE);
                    findViewById(R.id.clockOutAMPM).setVisibility(View.INVISIBLE);
                    findViewById(R.id.submitButton).setVisibility(View.INVISIBLE);
                }
            }
        });

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, availableEmployee) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(availableEmployee.get(position));
                text2.setText(availableEmployeeTimeArray.get(position));
                return view;
            }
        };
        final ListView availableListView = findViewById(R.id.availableList);
        availableListView.setAdapter(arrayAdapter);

        availableListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                findViewById(R.id.editAvailabilityButton).setVisibility(View.VISIBLE);
                findViewById(R.id.editStartHourInput).setVisibility(View.INVISIBLE);
                findViewById(R.id.editStartMinuteInput).setVisibility(View.INVISIBLE);
                findViewById(R.id.editEndHourInput).setVisibility(View.INVISIBLE);
                findViewById(R.id.editEndMinuteInput).setVisibility(View.INVISIBLE);
                findViewById(R.id.clockInAMPM).setVisibility(View.INVISIBLE);
                findViewById(R.id.clockOutAMPM).setVisibility(View.INVISIBLE);
                findViewById(R.id.submitButton).setVisibility(View.INVISIBLE);
                selectedItem = availableListView.getItemAtPosition(position).toString();
            }

        });

        Button enterSearchButton = findViewById(R.id.searchButton);
        enterSearchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText search = findViewById(R.id.searchInput);
                updatedArrayList = new ArrayList<>();
                updatedArrayList2 = new ArrayList<>();

                String searchString = search.getText().toString(); //Search string

                for(int i = 0; i < availableEmployee.size(); i++)
                {
                    Boolean doesContain = availableEmployee.get(i).toLowerCase().contains(searchString.toLowerCase());

                    if(doesContain == true)
                    {
                        updatedArrayList.add(availableEmployee.get(i));
                        updatedArrayList2.add(availableEmployeeTimeArray.get(i));

                    }
                }
                ArrayAdapter updatedArrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_2, android.R.id.text1, updatedArrayList) {
                    @Override
                    public View getView(int position, View convertView, ViewGroup parent) {
                        View view = super.getView(position, convertView, parent);
                        TextView text1 = view.findViewById(android.R.id.text1);
                        TextView text2 = view.findViewById(android.R.id.text2);

                        text1.setText(updatedArrayList.get(position));
                        text2.setText(updatedArrayList2.get(position));
                        return view;
                    }
                };
                ListView availableListView = findViewById(R.id.availableList);
                arrayAdapter = updatedArrayAdapter;
                availableListView.setAdapter(arrayAdapter);
                availableListView.invalidateViews();
            }
        });
    }
}  
