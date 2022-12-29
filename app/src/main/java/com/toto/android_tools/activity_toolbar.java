package com.toto.android_tools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class activity_toolbar extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  this.setTitle(getString(R.string.page_swiperefresh));
 //       getSupportActionBar().setSubtitle("subtitle");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_toolbar);

        toolbar = findViewById(R.id.toolbar);

        toolbar.setNavigationOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.one:
                        Toast.makeText(activity_toolbar.this,"One Click",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.two:
                        Toast.makeText(activity_toolbar.this,"Two Click",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.bluetooth:
                        Toast.makeText(activity_toolbar.this,"Bluetoot Click",Toast.LENGTH_SHORT).show();
                        return true;
                }
                return false;
            }
        });
    }
}