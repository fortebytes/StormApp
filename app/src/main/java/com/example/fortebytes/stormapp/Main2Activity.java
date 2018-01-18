package com.example.fortebytes.stormapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    GestureDetector detector;
    public static final String EXTRA_MESSAGE = "com.example.fortebytes.stormapp.Main2Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.getWindow().getDecorView().findViewById(android.R.id.content).setOnTouchListener(new OnSwipeTouchListener(Main2Activity.this) {

            public void onSwipeRight() {
                Toast.makeText(Main2Activity.this, "right", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }

        });


    }
}
