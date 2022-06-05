package com.example.birthdaygreetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {
    // Something to do
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);
        Intent I1 = getIntent();
        String name1 = I1.getStringExtra("name");
        TextView BD = findViewById(R.id.BDGreeting);
        BD.setText("Happy Birthday\n"+name1+"!");
    }
}