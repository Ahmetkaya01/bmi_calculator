package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.ImageButton;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;


public class HomeActivity extends AppCompatActivity {


    //walking dance running medidation sleep//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        AdView adView = new AdView(this);

        adView.setAdSize(AdSize.BANNER);

        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");


        Button happiniess = (Button) findViewById(R.id.Happines);

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


        Button selflove = (Button) findViewById(R.id.selflove);

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


        Button quickresistance = (Button) findViewById(R.id.Quickresistance);

        quickresistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, EightQuickresistance.class));
            }
        });


        Button bestworkouts = (Button) findViewById(R.id.bestworkouts);

        bestworkouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, thebestbuttworkouts.class));
            }
        });

        ////////////////////////

        Button Fitness = (Button) findViewById(R.id.ArticlesofFitness);

        Fitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Articlesoffitness.class));
            }
        });

        Button Yoga = (Button) findViewById(R.id.yoga);

        Yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ArticlesofYoga.class));
            }
        });

        Button walking = (Button) findViewById(R.id.walking);

        walking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Articlesofwalking.class));
            }
        });

        Button dance = (Button) findViewById(R.id.dance);

        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Articles_Of_Dance.class));
            }
        });

        Button running = (Button) findViewById(R.id.running);

        running.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, articlesofrunning.class));
            }
        });

        Button medidation = (Button) findViewById(R.id.medidation);

        medidation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Articles_Of_Meditation.class));
            }
        });

        Button sleep = (Button) findViewById(R.id.sleep);

        sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Articlesofsleeping.class));
            }
        });


        ////////////////////////////

        ImageButton checkyourbmi = (ImageButton) findViewById(R.id.calculator);

        checkyourbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, CalculatorActivity.class));
            }
        });



    }
}