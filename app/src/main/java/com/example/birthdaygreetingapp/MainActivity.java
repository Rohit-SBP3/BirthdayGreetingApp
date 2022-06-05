package com.example.birthdaygreetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnClick(View view) {
         TextView Name = findViewById(R.id.nameInput);
         String name = Name.getText().toString();
         //Toast t1;
         //t1 = Toast.makeText(this,"Name is " + Name.getText().toString(),Toast.LENGTH_LONG);
         //t1.show();*/
        Intent I1 = new Intent(this,BirthdayGreetingActivity.class);
        I1.putExtra("name",name);
        startActivity(I1);

    }
}
