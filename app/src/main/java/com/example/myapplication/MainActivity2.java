package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import java.net.URI;

public class MainActivity2 extends AppCompatActivity {
    Button mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            mp = findViewById(R.id.btnpan);
            mp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    goLink("https://www.pcru.ac.th/main/view/mapbuilding");
                }
            });
        }

        private void goLink(String s) {
            Uri uri = Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW,uri));
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
    public void Pagepan(View view) {
        Button button_next = (Button) findViewById(R.id.btnpan);
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }
}

