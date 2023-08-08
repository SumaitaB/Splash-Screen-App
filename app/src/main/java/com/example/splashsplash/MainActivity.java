package com.example.splashsplash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_DURATION = 3000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Handler to delay opening the manual navigation screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                openManualNavigationScreen();
            }
        }, SPLASH_DURATION);
    }

    private void openManualNavigationScreen() {
        Intent intent = new Intent(this, ManualNavigationActivity.class);
        startActivity(intent);
    }
}
