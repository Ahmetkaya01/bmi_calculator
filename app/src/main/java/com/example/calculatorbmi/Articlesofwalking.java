package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Articlesofwalking extends AppCompatActivity {

    private Button walkingsafety;
    private Button whenyouwalking;
    private Button benefitsofwalking;
    private Button walk30minutes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articlesofwalking);

        walkingsafety = findViewById(R.id.walkingsafety);

        whenyouwalking = findViewById(R.id.whenyouwalking);

        benefitsofwalking = findViewById(R.id.benefitsofwalking);

        walk30minutes = findViewById(R.id.walk30minutes);

        walkingsafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                walkingsafety = findViewById(R.id.walkingsafety);

                Button walkingsafety = (Button) findViewById(R.id.walkingsafety);

                walkingsafety.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Articlesofwalking.this,walkingsafetytips.class));
                    }
                });

                whenyouwalking = findViewById(R.id.whenyouwalking);

                Button whenyouwalking = (Button) findViewById(R.id.whenyouwalking);

                whenyouwalking.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Articlesofwalking.this,whilewalkingwhathappens.class));
                    }
                });

                benefitsofwalking = findViewById(R.id.benefitsofwalking);

                Button benefitsofwalking = (Button) findViewById(R.id.benefitsofwalking);

                benefitsofwalking.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Articlesofwalking.this, com.example.calculatorbmi.benefitsofwalking.class));
                    }
                });

                walk30minutes = findViewById(R.id.walk30minutes);

                Button walk30minutes = (Button) findViewById(R.id.walk30minutes);

                walk30minutes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Articlesofwalking.this, com.example.calculatorbmi.walk30minutes.class));
                    }
                });

            }
        });


    }
}