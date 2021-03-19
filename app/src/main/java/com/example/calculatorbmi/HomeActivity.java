package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button happiniess = (Button) findViewById(R.id.Happiness);

        happiniess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, happinies.class));
            }
        });


        Button antistress = (Button) findViewById(R.id.Antistress);

        antistress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Antistress.class));
            }
        });


        Button allfooddiet = (Button) findViewById(R.id.Allfooddiet);

        allfooddiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, allfooddiet.class));
            }
        });


        Button selflove = (Button) findViewById(R.id.Selflove);

        selflove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, SelfLove.class));
            }
        });


        Button randomworkout = (Button) findViewById(R.id.randomworkout);

        randomworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Randomworkout.class));
            }
        });


        Button plankitup = (Button) findViewById(R.id.plankitup);

        plankitup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Plankitup.class));
            }
        });


        Button quickresistance = (Button) findViewById(R.id.quickresistance);

        quickresistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, EightQuickresistance.class));
            }
        });


        Button bestworkouts = (Button) findViewById(R.id.Bestworkouts);

        bestworkouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, thebestbuttworkouts.class));
            }
        });


        Button browsebutton = (Button) findViewById(R.id.browsebutton);

        browsebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, browse.class));
            }
        });

        Button homebutton = (Button) findViewById(R.id.homebutton);

        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this, HomeActivity.class));
            }
        });


        Button checkyourbmi = (Button) findViewById(R.id.checkyourbmi);

        checkyourbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, CalculatorActivity.class));
            }
        });
    }
}