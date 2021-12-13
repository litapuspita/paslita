package com.example.paslita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class richesse extends AppCompatActivity {
    Button btnrichesse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_richesse);
        btnrichesse = (Button) findViewById(R.id.richesse);

        btnrichesse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent richesse = new Intent(richesse.this,MainActivity.class);
                startActivity(richesse);
            }
        });
    }
}