package com.example.paslita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class descrechesse extends AppCompatActivity {
    Button btnDescRichesse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descrechesse);
        btnDescRichesse = (Button)  findViewById (R.id.richesse);

        btnDescRichesse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Richesse = new Intent(descrechesse.this, richesse.class);
                startActivity(Richesse);
            }
        });
    }
}