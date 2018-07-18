package com.example.prof_noite.primeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.prof_noite.primeiroapp.MainActivity.*;

public class DisplayMessageActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message2);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
