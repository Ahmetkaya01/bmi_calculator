package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity1 extends AppCompatActivity {
    private Button Browsebtn;
    private Button Homebtn;
////
    private Button Happiness;
    private Button Anti;
    private Button Diet;
    private Button Self;
    // // // // // // // // // // //
    private Button Randomworkout;
    private Button Plankitup;
    private Button Quickresistance;
    private Button Bestworkouts;
    /////////////////////////////
    private ImageButton Check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Check = findViewById(R.id.checkyourbmi);
        Browsebtn = findViewById(R.id.browsebutton);
        Homebtn = findViewById(R.id.homebutton);
        ////
        Randomworkout = findViewById(R.id.randomworkout);
        Plankitup = findViewById(R.id.plankitup);
        Quickresistance= findViewById(R.id.quickresistance);
        Bestworkouts = findViewById(R.id.bestworkouts);
        // // HORIZONTAL // // // // // // // // // // //
        Happiness = findViewById(R.id.happiness);
        Anti = findViewById(R.id.antistress);
        Diet = findViewById(R.id.allfooddiet);
        Self = findViewById(R.id.selflove);

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

                        Anti = findViewById(R.id.antistress);

                        Button Anti = (Button) findViewById(R.id.antistress);

                        Anti.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity1.this,Antistress.class));
                            }
                        });

                        Diet = findViewById(R.id.allfooddiet);

                        Button Diet = (Button) findViewById(R.id.allfooddiet);

                        Diet.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity1.this,allfooddiet.class));
                            }
                        });

                Self = findViewById(R.id.selflove);

                Button Self = (Button) findViewById(R.id.selflove);

                Self.setOnClickListener(new View.OnClickListener() {
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

                        Browsebtn = findViewById(R.id.browsebutton);

                        Button browsebutton = (Button) findViewById(R.id.browsebutton);

                        browsebutton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity1.this,browse.class));
                            }
                        });

                        Homebtn = findViewById(R.id.homebutton);
                        Button homebutton = (Button) findViewById(R.id.homebutton);

                        homebutton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity1.this,MainActivity1.class));
                            }
                        });
                        Check = findViewById(R.id.checkyourbmi);

                        ImageButton Check = (ImageButton) findViewById(R.id.checkyourbmi);

                        Check.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity1.this,MainActivity.class));
                            }
                        });
                    }

                });
            }
        });
    }
}