package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class LaunchScreen extends AppCompatActivity {

    private static int SPLASH_SCREEN  = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);
        getWindow().
        setContentView(R.layout.activity_launch_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
                    public void run() {
                Intent intent = new Intent (LaunchScreen.this, Main.MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN
    }
}