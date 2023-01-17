package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Information extends AppCompatActivity {

    Button FB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        FB = findViewById(R.id.btnfacebook);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/profile.php?id=100048057098043");
            }
        });
    }

    private void goLink(String s) {
    }

    public void HomePage1(View view) {
        Button button_next = (Button) findViewById(R.id.home);
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}