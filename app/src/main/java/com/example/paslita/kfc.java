package com.example.paslita;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kfc extends AppCompatActivity {
    Button btnkfc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kfc);
        btnkfc = (Button) findViewById(R.id.kfc1);

        btnkfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kfc = new Intent(com.example.paslita.kfc.this,MainActivity.class);
                startActivity(kfc);
            }
        });
    }
}