package com.example.paslita;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class descKfc extends AppCompatActivity {
   Button btnDescKfc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_kfc);
        btnDescKfc = (Button)  findViewById (R.id.nextkfc);

        btnDescKfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Mcd = new Intent(descKfc.this, kfc.class);
                startActivity(Mcd);
            }
        });
    }
}