package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends AppCompatActivity {
    private Button Browsebtn;
    private Button Homebtn;
////
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

        Browsebtn = findViewById(R.id.browsebutton);
        Homebtn = findViewById(R.id.homebutton);
        ////
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
                                startActivity(new Intent(HomeActivity.this,happinies.class));
                            }
                        });

                        Antistress = findViewById(R.id.antistress);

                        Button antistress = (Button) findViewById(R.id.antistress);

                        antistress.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(HomeActivity.this,Antistress.class));
                            }
                        });

                        Allfooddiet = findViewById(R.id.allfooddiet);

                        Button allfooddiet = (Button) findViewById(R.id.allfooddiet);

                        allfooddiet.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(HomeActivity.this,allfooddiet.class));
                            }
                        });

                Selflove = findViewById(R.id.selflove);

                Button selflove = (Button) findViewById(R.id.selflove);

                selflove.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(HomeActivity.this,SelfLove.class));
                    }
                });

                Randomworkout = findViewById(R.id.randomworkout);

                Button randomworkout = (Button) findViewById(R.id.randomworkout);

                randomworkout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(HomeActivity.this,Randomworkout.class));
                    }
                });

                Plankitup= findViewById(R.id.plankitup);

                Button plankitup = (Button) findViewById(R.id.plankitup);

                plankitup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(HomeActivity.this,Plankitup.class));
                    }
                });

                Quickresistance = findViewById(R.id.quickresistance);

                Button quickresistance = (Button) findViewById(R.id.quickresistance);

                quickresistance.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(HomeActivity.this,EightQuickresistance.class));
                    }
                });

                Bestworkouts = findViewById(R.id.bestworkouts);

                        Button bestworkouts = (Button) findViewById(R.id.bestworkouts);

                        bestworkouts.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(HomeActivity.this,thebestbuttworkouts.class));
                            }
                        });

                        Browsebtn = findViewById(R.id.browsebutton);

                        Button browsebutton = (Button) findViewById(R.id.browsebutton);

                        browsebutton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(HomeActivity.this,browse.class));
                            }
                        });

                        Homebtn = findViewById(R.id.homebutton);
                        Button homebutton = (Button) findViewById(R.id.homebutton);

                        homebutton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(HomeActivity.this, HomeActivity.class));
                            }
                        });
                    }

                });
            }
        });
    }
}