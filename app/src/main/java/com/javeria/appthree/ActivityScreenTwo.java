package com.javeria.appthree;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityScreenTwo extends AppCompatActivity {
    TextView Dis;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_two);
        String textShow = getIntent().getStringExtra("Some text");
        Dis= findViewById(R.id.Dis);
////
        Dis.setText(textShow);

    }



}