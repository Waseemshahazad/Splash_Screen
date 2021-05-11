package com.waseem.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread bg = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(10 * 1000);


                    Intent intent = new Intent(getBaseContext(),MainActivity2.class);
                    startActivity(intent);

                    finish();

                } catch (Exception ignored) {

                }
            }
        };

         bg.start();
}}