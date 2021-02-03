package com.example.myapplication_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h);

        TextView view = (TextView)findViewById(R.id.textView);
        Intent intent = getIntent();
        view.setText("Hallo "+intent.getStringExtra("PersonName"));

    }
}