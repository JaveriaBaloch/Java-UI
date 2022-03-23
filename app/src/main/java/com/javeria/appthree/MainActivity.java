package com.javeria.appthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.txt2);
    }

    public void animate(View view) {
        textview.animate().rotationXBy(120);
//        textview.animate().rotationYBy(30);
//        textview.animate().alpha(0).setDuration(4000).start();
        textview.animate().scaleY(2.2f).scaleX(2.2f).setDuration(4000).start();

    }
}