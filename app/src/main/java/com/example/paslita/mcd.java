package com.example.paslita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mcd extends AppCompatActivity {
    Button btnmcd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcd);
        btnmcd = (Button) findViewById(R.id.kmblmcd);

        btnmcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mcd = new Intent(mcd.this,MainActivity.class);
                startActivity(mcd);
            }
        });
    }
}