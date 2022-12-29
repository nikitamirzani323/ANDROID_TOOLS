package com.toto.android_tools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSwipeRefresh, btnRTPSlot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSwipeRefresh = findViewById(R.id.btnSwipeRefresh);
        btnRTPSlot = findViewById(R.id.btnRTPSlot);

        btnSwipeRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity_toolbar.class);
                startActivity(intent);
            }
        });
        btnRTPSlot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity_rtpslot.class);
                startActivity(intent);
            }
        });
    }
}