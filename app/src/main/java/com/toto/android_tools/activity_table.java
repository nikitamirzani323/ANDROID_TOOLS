package com.toto.android_tools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import java.util.ArrayList;
import java.util.Random;

import ir.androidexception.datatable.DataTable;
import ir.androidexception.datatable.model.DataTableHeader;
import ir.androidexception.datatable.model.DataTableRow;

public class activity_table extends AppCompatActivity {
    Toolbar toolbarTable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_table);
        DataTable dataTable = findViewById(R.id.data_table);
        toolbarTable = findViewById(R.id.toolbarTable);

        toolbarTable.setNavigationOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });
        DataTableHeader header = new DataTableHeader.Builder()
                .item("Item", 3)
                .item("Qty", 1)
                .item("Price", 2)
                .item("Discount", 2)
                .build();

        ArrayList<DataTableRow> rows = new ArrayList<>();
        // define 200 fake rows for table
        for(int i=0;i<200;i++) {
            Random r = new Random();
            int random = r.nextInt(i+1);
            int randomDiscount = r.nextInt(20);
            DataTableRow row = new DataTableRow.Builder()
                    .value("Product #" + i)
                    .value(String.valueOf(random))
                    .value(String.valueOf(random*1000).concat("$"))
                    .value(String.valueOf(randomDiscount).concat("%"))
            .build();
            rows.add(row);
        }


        dataTable.setHeader(header);
        dataTable.setRows(rows);
        dataTable.inflate(this);
    }
}