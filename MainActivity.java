package com.kavya.messmanagement;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView status = findViewById(R.id.tvStatus);

        findViewById(R.id.btnMenu).setOnClickListener(v ->
                status.setText("Today's Menu will be displayed here."));

        findViewById(R.id.btnAttendance).setOnClickListener(v ->
                status.setText("Mess attendance will be managed here."));

        findViewById(R.id.btnFeedback).setOnClickListener(v ->
                status.setText("Students will be able to submit feedback here."));

        findViewById(R.id.btnComplaint).setOnClickListener(v ->
                status.setText("Students can report mess complaints here."));

        findViewById(R.id.btnFees).setOnClickListener(v ->
                status.setText("Mess fee details will be displayed here."));
    }
}
