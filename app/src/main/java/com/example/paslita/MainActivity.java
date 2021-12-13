package com.example.paslita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

CircleImageView imgKfc, imgPizza, imgMcd,imgRichesse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgKfc=(CircleImageView) findViewById(R.id.img_kfc);
        imgPizza=(CircleImageView) findViewById(R.id.img_pizza);
        imgMcd=(CircleImageView) findViewById(R.id.img_mcd);
        imgRichesse=(CircleImageView) findViewById(R.id.img_richesse);

        imgKfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahKfc = new Intent(MainActivity.this, descKfc.class);
                startActivity(pindahKfc);
            }
        });
        imgPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahPizza = new Intent(MainActivity.this, descpizzahut.class);
                startActivity(pindahPizza);
            }
        });
        imgMcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahMcd = new Intent(MainActivity.this, descMcd.class);
                startActivity(pindahMcd);
            }
        });
        imgRichesse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahRichesse = new Intent(MainActivity.this, descrechesse.class);
                startActivity(pindahRichesse);
            }
        });
    }
}