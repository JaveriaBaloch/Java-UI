package com.javeria.appthree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
TextView textview;
EditText txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.txt2);
        txt1 = findViewById(R.id.txt1);
    }

    public void animate(View view) {
        textview.animate().rotationXBy(120);
//        textview.animate().rotationYBy(30);
//        textview.animate().alpha(0).setDuration(4000).start();
        textview.animate().scaleY(2.2f).scaleX(2.2f).setDuration(4000).start();
        textview.animate().translationX(20).translationY(20).setDuration(4000).start();
        textview.animate().rotationY(30);

    }

    public void goToTheSecondScreen(View view) {
//        Intent intent = new Intent(Start screen.this, navigateScreen.class);
        Intent intent = new Intent(MainActivity.this, ActivityScreenTwo.class);
        intent.putExtra("Some text",txt1.getText().toString());
//        startActivity(Intent variable);
          startActivity(intent);
    }
}