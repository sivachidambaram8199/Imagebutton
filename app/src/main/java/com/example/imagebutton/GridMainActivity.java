 package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GridMainActivity extends AppCompatActivity {

    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_main);

        name.findViewById(R.id.griddata);

        Intent intent = getIntent();
        name.setText(intent.getStringExtra("name" ));
    }
}