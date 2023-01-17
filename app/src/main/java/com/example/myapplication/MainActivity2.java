package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
        public void backPage1(View view) {
            Button button_back = (Button)findViewById(R.id.back1);
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        public void NextPage2(View view) {
            Button button_next = (Button)findViewById(R.id.next2);
            Intent intent = new Intent(this, kacan60pe.class);
            startActivity(intent);
        }
        public void Pagekacan60pe(View view) {
        Button button_next = (Button)findViewById(R.id.btnkacan60pe);
        Intent intent = new Intent(this, kacan60pe.class);
        startActivity(intent);
    }
        public void Pagekanjadkan(View view) {
        Button button_next = (Button)findViewById(R.id.btnkanjadkan);
        Intent intent = new Intent(this, kanjadkan.class);
        startActivity(intent);
    }
        public void Pagemanuchsad(View view) {
        Button button_next = (Button)findViewById(R.id.btnmanuchsad);
        Intent intent = new Intent(this, manuchsad.class);
        startActivity(intent);
    }
        public void Pagekulusad(View view) {
        Button button_next = (Button)findViewById(R.id.btnkulusad);
        Intent intent = new Intent(this, kulusad.class);
        startActivity(intent);
    }
        public void Pagesci(View view) {
        Button button_next = (Button)findViewById(R.id.btnsci);
        Intent intent = new Intent(this, sci.class);
        startActivity(intent);
    }
    public void Pageprofile(View view) {
        Button button_next = (Button) findViewById(R.id.btnprofile);
        Intent intent = new Intent(this, Information.class);
        startActivity(intent);
    }
}

