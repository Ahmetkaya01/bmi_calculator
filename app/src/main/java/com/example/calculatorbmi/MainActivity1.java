package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity1 extends AppCompatActivity {


    private Button Happiness;
    private Button Antistress;
    private Button Allfooddiet;
    private Button Selflove;
    // // // // // // // // // // //
    private Button Randomworkout;
    private Button Plankitup;
    private Button Quickresistance;
    private Button Bestworkouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Randomworkout = findViewById(R.id.randomworkout);
        Plankitup = findViewById(R.id.plankitup);
        Quickresistance= findViewById(R.id.quickresistance);
        Bestworkouts = findViewById(R.id.bestworkouts);
        // // HORIZONTAL // // // // // // // // // // //
        Happiness = findViewById(R.id.happiness);
        Antistress = findViewById(R.id.antistress);
        Allfooddiet = findViewById(R.id.allfooddiet);
        Selflove = findViewById(R.id.selflove);

        Happiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Happiness.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Happiness = findViewById(R.id.happiness);

                        Button happiniess = (Button) findViewById(R.id.happiness);

                        happiniess.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity1.this,happinies.class));
                            }
                        });

                        Antistress = findViewById(R.id.antistress);

                        Button antistress = (Button) findViewById(R.id.antistress);

                        antistress.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity1.this,Antistress.class));
                            }
                        });

                        Allfooddiet = findViewById(R.id.allfooddiet);

                        Button allfooddiet = (Button) findViewById(R.id.allfooddiet);

                        allfooddiet.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity1.this,allfooddiet.class));
                            }
                        });

                Selflove = findViewById(R.id.selflove);

                Button selflove = (Button) findViewById(R.id.selflove);

                selflove.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity1.this,SelfLove.class));
                    }
                });

                Randomworkout = findViewById(R.id.randomworkout);

                Button randomworkout = (Button) findViewById(R.id.randomworkout);

                randomworkout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity1.this,Randomworkout.class));
                    }
                });

                Plankitup= findViewById(R.id.plankitup);

                Button plankitup = (Button) findViewById(R.id.plankitup);

                plankitup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity1.this,Plankitup.class));
                    }
                });

                Quickresistance = findViewById(R.id.quickresistance);

                Button quickresistance = (Button) findViewById(R.id.quickresistance);

                quickresistance.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity1.this,EightQuickresistance.class));
                    }
                });

                Bestworkouts = findViewById(R.id.bestworkouts);

                        Button bestworkouts = (Button) findViewById(R.id.bestworkouts);

                        bestworkouts.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity1.this,thebestbuttworkouts.class));
                            }
                        });

                    }
                });
            }
        });



    }
}