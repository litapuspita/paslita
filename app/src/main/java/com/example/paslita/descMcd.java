package com.example.paslita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class descMcd extends AppCompatActivity {
    Button btnDescMcd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_mcd);
        btnDescMcd = (Button)  findViewById (R.id.nextmcd);

        btnDescMcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Mcd = new Intent(descMcd.this, mcd.class);
                startActivity(Mcd);
            }
        });
    }
}