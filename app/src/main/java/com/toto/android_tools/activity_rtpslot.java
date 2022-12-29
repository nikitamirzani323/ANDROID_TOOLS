package com.toto.android_tools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class activity_rtpslot extends AppCompatActivity {
    Toolbar toolbar;
    ProgressBar pb1,pb2;
    int counter = 0;
    int counter2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_rtpslot);

        toolbar = findViewById(R.id.toolbar);
        pb1 = findViewById(R.id.pb1);
        pb2 = findViewById(R.id.pb2);

        toolbar.setNavigationOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });

        pb1.setProgress(50);
        pb2.setProgress(80);
    }
}