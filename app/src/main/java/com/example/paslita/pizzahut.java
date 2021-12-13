package com.example.paslita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pizzahut extends AppCompatActivity {
    Button btnpizzahut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzahut);
        btnpizzahut = (Button) findViewById(R.id.kmblpizzahut);

        btnpizzahut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pizzahut = new Intent(pizzahut.this,MainActivity.class);
                startActivity(pizzahut);
            }
        });
    }
}