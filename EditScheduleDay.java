package com.example.sanghoon.cluckersproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class EditScheduleDay extends AppCompatActivity {

    EditText scheduleClockInHourInput;
    EditText scheduleClockInMinuteInput;
    EditText scheduleClockOutHourInput;
    EditText scheduleClockOutMinuteInput;
    Spinner clockInAMPM;
    Spinner clockOutAMPM;
    String selectedListViewID;
    ArrayAdapter arrayAdapter;
    ArrayList<String> listArray;
    ArrayList<String> listArray2;
    ArrayList<String> updatedArrayList;
    ArrayList<String> updatedArrayList2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_schedule_day);
        this.setTitle("Edit Schedule");

        String y = getIntent().getExtras().getString("dayInfo");

        listArray = getIntent().getExtras().getStringArrayList("EmployeeName");
        listArray2 = getIntent().getExtras().getStringArrayList("EmployeeTime");

        Button editAvailable = findViewById(R.id.editScheduleButton);
        editAvailable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.editScheduleButton).setVisibility(View.INVISIBLE);
                findViewById(R.id.editScheduleClockInHourInput).setVisibility(View.VISIBLE);
                findViewById(R.id.editScheduleClockInMinuteInput).setVisibility(View.VISIBLE);
                findViewById(R.id.editScheduleClockOutHourInput).setVisibility(View.VISIBLE);
                findViewById(R.id.editScheduleClockOutMinuteInput).setVisibility(View.VISIBLE);
                findViewById(R.id.scheduleClockInAMPM).setVisibility(View.VISIBLE);
                findViewById(R.id.scheduleClockOutAMPM).setVisibility(View.VISIBLE);
                findViewById(R.id.scheduleSubmitButton).setVisibility(View.VISIBLE);
            }
        });

        scheduleClockInHourInput = findViewById(R.id.editScheduleClockInHourInput);
        scheduleClockInMinuteInput = findViewById(R.id.editScheduleClockInMinuteInput);
        scheduleClockOutHourInput = findViewById(R.id.editScheduleClockOutHourInput);
        scheduleClockOutMinuteInput = findViewById(R.id.editScheduleClockOutMinuteInput);

        ArrayList<String> AMPMspinner = new ArrayList<>();
        AMPMspinner.add("AM");
        AMPMspinner.add("PM");

        clockInAMPM = findViewById(R.id.scheduleClockInAMPM);
        ArrayAdapter<String> adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, AMPMspinner);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        clockInAMPM.setAdapter(adapter1);

        clockOutAMPM = findViewById(R.id.scheduleClockOutAMPM);
        ArrayAdapter<String> adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, AMPMspinner);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        clockOutAMPM.setAdapter(adapter2);

        Button submitButton = findViewById(R.id.scheduleSubmitButton);
        submitButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                String x = scheduleClockInHourInput.getText().toString();
                String y = scheduleClockInMinuteInput.getText().toString();
                String x2 = scheduleClockOutHourInput.getText().toString();
                String y2 = scheduleClockOutMinuteInput.getText().toString();
                String am = clockInAMPM.getSelectedItem().toString();
                String pm = clockOutAMPM.getSelectedItem().toString();

                if(x.equals("") || x2.equals("") || x.equals(".") || y.equals(".") || x2.equals(".") || y2.equals("."))
                {
                    scheduleClockInHourInput.getText().clear();
                    scheduleClockInMinuteInput.getText().clear();
                    scheduleClockOutHourInput.getText().clear();
                    scheduleClockOutMinuteInput.getText().clear();
                    Toast errorText = Toast.makeText(EditScheduleDay.this, "Enter a Number", Toast.LENGTH_SHORT);
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
                    String time = x + ":" + y + am + " - " + x2 + ":" + y2 + pm;

                    final ArrayList<String> updatedArrayList = new ArrayList<>();
                    final ArrayList<String> updatedArrayList2 = new ArrayList<>();

                    for(int i = 0; i < listArray.size(); i++)
                    {
                        updatedArrayList.add(listArray.get(i));
                        if(listArray.get(i).equals(selectedListViewID)) {
                            updatedArrayList2.add(time);
                        }
                        else
                        {
                            updatedArrayList2.add(listArray2.get(i));
                        }

                    }

                    ArrayAdapter updatedArrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_2, android.R.id.text1, listArray) {
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

                    ListView availableListView = findViewById(R.id.testView);
                    arrayAdapter = updatedArrayAdapter;
                    availableListView.setAdapter(arrayAdapter);
                    availableListView.invalidateViews();
                }
                else {
                    String time = x + ":" + y + am + " - " + x2 + ":" + y2 + pm;

                    final ArrayList<String> updatedArrayList = new ArrayList<>();
                    final ArrayList<String> updatedArrayList2 = new ArrayList<>();

                    for(int i = 0; i < listArray.size(); i++)
                    {
                        updatedArrayList.add(listArray.get(i));
                        if(listArray.get(i).equals(selectedListViewID)) {
                            updatedArrayList2.add(time);
                        }
                        else
                        {
                            updatedArrayList2.add(listArray2.get(i));
                        }

                    }

                    ArrayAdapter updatedArrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_2, android.R.id.text1, listArray) {
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

                    ListView availableListView = findViewById(R.id.testView);
                    arrayAdapter = updatedArrayAdapter;
                    availableListView.setAdapter(arrayAdapter);
                    availableListView.invalidateViews();
                }
            }
        });

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, listArray) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);

                text1.setText(listArray.get(position));
                text2.setText(listArray2.get(position));
                return view;
            }
        };
        final ListView ListView = findViewById(R.id.testView);
        ListView.setAdapter(arrayAdapter);

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                findViewById(R.id.editScheduleButton).setVisibility(View.VISIBLE);
                findViewById(R.id.editScheduleClockInHourInput).setVisibility(View.INVISIBLE);
                findViewById(R.id.editScheduleClockInMinuteInput).setVisibility(View.INVISIBLE);
                findViewById(R.id.editScheduleClockOutHourInput).setVisibility(View.INVISIBLE);
                findViewById(R.id.editScheduleClockOutMinuteInput).setVisibility(View.INVISIBLE);
                findViewById(R.id.scheduleClockInAMPM).setVisibility(View.INVISIBLE);
                findViewById(R.id.scheduleClockOutAMPM).setVisibility(View.INVISIBLE);
                findViewById(R.id.scheduleSubmitButton).setVisibility(View.INVISIBLE);
                selectedListViewID = ListView.getItemAtPosition(position).toString();
            }
        });

        Button enterSearchButton = findViewById(R.id.scheduleSearchButton);
        enterSearchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText search = findViewById(R.id.scheduleSearchInput);
                updatedArrayList = new ArrayList<>();
                updatedArrayList2 = new ArrayList<>();

                String searchString = search.getText().toString(); //Search string

                for(int i = 0; i < listArray.size(); i++)
                {
                    Boolean doesContain = listArray.get(i).toLowerCase().contains(searchString.toLowerCase());

                    if(doesContain == true)
                    {
                        updatedArrayList.add(listArray.get(i));
                        updatedArrayList2.add(listArray2.get(i));
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
                ListView availableListView = findViewById(R.id.testView);
                arrayAdapter = updatedArrayAdapter;
                availableListView.setAdapter(arrayAdapter);
                availableListView.invalidateViews();
            }
        });
    }
}
