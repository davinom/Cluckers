package com.example.sanghoon.cluckersproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity
{

    String password;
    EditText passwordInput;
    Boolean loggedIn = false;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        passwordInput = findViewById(R.id.passwordInput);

        Button enterPassword = findViewById(R.id.passwordButton);
        enterPassword.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                password = passwordInput.getText().toString();
                if(password.equals("password"))
                {
                    showToast("Success: " + password);
                    loggedIn = true;
                    passLoginInfo(loggedIn);
                    finish();
                }
                else
                {
                    showToast("Incorrect Password");
                }

            }
        } );
    }

    private void showToast(String text)
    {
        Toast login = Toast.makeText(Login.this, text, Toast.LENGTH_SHORT);;
        login.setGravity(Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0 , 150);
        login.show();
    }

    public void passLoginInfo(Boolean loggedIn)
    {
        Intent intent = new Intent(Login.this, Schedule.class);
        Bundle bundle = new Bundle();
        intent.putExtra("Login", loggedIn);
        bundle.putBoolean("login", loggedIn);
        startActivity(intent);
    }
}


