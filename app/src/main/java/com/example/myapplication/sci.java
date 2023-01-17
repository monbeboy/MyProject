package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci);
    }
    public void backPage1(View view) {
        Button button_back = (Button) findViewById(R.id.back1);
        Intent intent = new Intent(this, manuchsad.class);
        startActivity(intent);
    }

    public void HomePage1(View view) {
        Button button_next = (Button) findViewById(R.id.home);
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}