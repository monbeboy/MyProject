package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private DataBaseHelper db;
    private Spinner spinnerCategories;
    private EditText editTextNewCategory;
    private Button buttonCategory;
    private List<String> listCategories = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //connect database
        db = new DataBaseHelper(this);
        if (db == null)
            db = new DataBaseHelper(this);
        spinnerCategories = (Spinner) findViewById(R.id.spinner_categories);
        editTextNewCategory = (EditText) findViewById(R.id.edittext_newcategory);
        buttonCategory = (Button) findViewById(R.id.button_category);
        buttonCategory.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String newCategory = editTextNewCategory.getText().toString();
                if (newCategory.equalsIgnoreCase("")) {
                    Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_SHORT).show();

                } else {
                    db.addCategory(new Category(newCategory));
                    prepareData();
                    editTextNewCategory.setText("");
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }
            }

        });
        prepareData();
    }

    public void prepareData() {
        listCategories = db.getAllCategories();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, android.R.id.text1, listCategories);
        spinnerCategories.setAdapter(adapter);
    }

    }
