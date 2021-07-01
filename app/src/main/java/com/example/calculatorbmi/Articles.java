package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Articles extends AppCompatActivity {

    private Button bmi;
    private Button fitness;
    private Button yoga;
    private Button walking;
    private Button dance;
    private Button running;
    private Button nutrition;
    private Button medidation;
    private Button sleep;
    private Button musicsounds;
    private Button tips;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);
        bmi = findViewById(R.id.bmicalculator);
        fitness = findViewById(R.id.fitnessarticle);
        yoga = findViewById(R.id.yogaarticle);
        walking = findViewById(R.id.walkingarticle);
        dance = findViewById(R.id.dancearticle);
        running = findViewById(R.id.runningarticle);
        nutrition = findViewById(R.id.nutritionarticle);
        medidation = findViewById(R.id.medidationarticle);
        sleep = findViewById(R.id.sleepacticle);
        musicsounds = findViewById(R.id.musicsoundsarticle);
        tips = findViewById(R.id.tipsarticle);


                        bmi.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                bmi.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                       bmi = findViewById(R.id.bmicalculator);
                                       Button bmi = (Button) findViewById(R.id.bmicalculator);

                                       bmi.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               startActivity(new Intent(Articles.this,FitnessArticle.class));
                                           }
                                       });
                                    fitness.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            startActivity(new Intent(Articles.this,FitnessArticle.class));
                                        }
                                    });
                                       fitness = findViewById(R.id.fitnessarticle);

                                       Button fitnes = (Button) findViewById(R.id.fitnessarticle);

                                       fitnes.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {                //need to change//
                                               startActivity(new Intent(Articles.this,FitnessArticle.class));
                                           }
                                       });

                                       yoga = findViewById(R.id.yogaarticle);

                                       Button yoga = (Button) findViewById(R.id.yogaarticle);

                                       yoga.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {                //NEED TO CHANGE //
                                               startActivity(new Intent(Articles.this,Healthyeatingbasics.class));
                                           }
                                       });

                                       walking = findViewById(R.id.walkingarticle);

                                       Button walking = (Button) findViewById(R.id.fitnessarticle);

                                       walking.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {                //NEED TO CHANGE //
                                               startActivity(new Intent(Articles.this,Results.class));

                                           }
                                       });

                                       dance = findViewById(R.id.dancearticle);

                                       Button dance = (Button) findViewById(R.id.dancearticle);

                                       dance.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {                // NEED TO CHANGE //
                                               startActivity(new Intent(Articles.this,ObeseActivity.class));
                                           }
                                       });

                                       running = findViewById(R.id.runningarticle);

                                       Button running = (Button) findViewById(R.id.runningarticle);

                                       running.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               startActivity(new Intent(Articles.this,FiveBurpeeWorkouts.class));
                                           }
                                       });

                                       nutrition = findViewById(R.id.nutritionarticle);

                                       Button nutrition = (Button) findViewById(R.id.nutritionarticle);

                                       nutrition.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               startActivity(new Intent(Articles.this,EightQuickresistance.class));
                                           }
                                       });

                                       medidation = findViewById(R.id.medidationarticle);
                                       Button medidation = (Button) findViewById(R.id.medidationarticle);

                                       medidation.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               startActivity(new Intent(Articles.this,TENStepHIITWorkoutWllToneYour.class));
                                           }
                                       });

                                        sleep = findViewById(R.id.sleepacticle);
                                        Button slepp = (Button) findViewById(R.id.sleepacticle);

                                        sleep.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                startActivity(new Intent(Articles.this,FiveBurpeeWorkouts.class));
                                            }
                                        });

                                        musicsounds = findViewById(R.id.musicsoundsarticle);

                                        Button musicsounds = (Button) findViewById(R.id.musicsoundsarticle);

                                        musicsounds.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                startActivity(new Intent(Articles.this,FunctionalFitness.class));
                                            }
                                        });

                                        tips = findViewById(R.id.tipsarticle);

                                        Button tips = findViewById(R.id.tipsarticle);

                                        tips.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                startActivity(new Intent(Articles.this,Exercise.class));
                                            }
                                        });


                                    }
                                });
                            }
                        });

            }
        }
