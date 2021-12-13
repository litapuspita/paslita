package com.example.paslita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class descpizzahut extends AppCompatActivity {
    Button btnDescPizzahut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descpizzahut);
        btnDescPizzahut = (Button)  findViewById (R.id.nextpizza);

        btnDescPizzahut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Pizza = new Intent(descpizzahut.this, pizzahut.class);
                startActivity(Pizza);
            }
        });


    }
}