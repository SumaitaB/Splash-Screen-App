package com.example.splashsplash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ManualNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        // Get a reference to the "Navigate" button
        Button navigateButton = findViewById(R.id.btnNavigate);

        // Set a click listener for the button
        navigateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle button click event here
                // For example, navigate to another activity
                openNextActivity();
            }
        });
    }

    private void openNextActivity() {
        // Create an intent to open the next activity
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
    }
}
