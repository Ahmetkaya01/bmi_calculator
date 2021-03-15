package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Metabolism extends AppCompatActivity {


    private Button Workoutmorning;
    private Button Fitnesplan;
    private Button Quickresistance;
    private Button Yogamovestotarger;
    private Button Energyboosting;
    private Button functionalfitness;
    private Button asimple15minuteworkout;
    private Button     supereasymoves;
    private Button Showarticles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metabolism);
        Showarticles = findViewById(R.id.ArticleButton);
        Workoutmorning = findViewById(R.id.btn01);
        Fitnesplan = findViewById(R.id.btn2);
        Quickresistance = findViewById(R.id.btn3);
        Yogamovestotarger = findViewById(R.id.btn4);
        Energyboosting = findViewById(R.id.btn5);
        functionalfitness = findViewById(R.id.btn6);
        asimple15minuteworkout = findViewById(R.id.btn7);

        Workoutmorning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Workoutmorning.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Workoutmorning = findViewById(R.id.btn01);
                        Button workout = (Button) findViewById(R.id.btn01);

                        workout.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(Metabolism.this, FiveMoveMorningworkout.class));
                            }
                        });

                        Fitnesplan = findViewById(R.id.btn2);
                        Button fitnes = (Button) findViewById(R.id.btn2);

                        fitnes.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(Metabolism.this,fitnessplan.class));
                            }
                        });

                        Quickresistance= findViewById(R.id.btn3);
                        Button quick = (Button) findViewById(R.id.btn3);

                       quick.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(Metabolism.this,EightQuickresistance.class));
                            }
                        });

                        Yogamovestotarger = findViewById(R.id.btn4);
                        Button yoga = (Button) findViewById(R.id.btn4);

                        yoga.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(Metabolism.this,Yogaarticle.class));
                            }
                        });

                        Energyboosting = findViewById(R.id.btn5);
                        Button energy= (Button) findViewById(R.id.btn5);

                        energy.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                startActivity(new Intent(Metabolism.this,FiveBurpeeWorkouts.class));
                            }
                        });

                        functionalfitness= findViewById(R.id.btn6);
                        Button funfitness = (Button) findViewById(R.id.btn6);

                        funfitness.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(Metabolism.this,FunctionalFitness.class));
                            }
                        });

                        asimple15minuteworkout = findViewById(R.id.btn7);
                        Button simplework = (Button) findViewById(R.id.btn7);

                        simplework.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(Metabolism.this,TENStepHIITWorkoutWllToneYour.class));
                            }
                        });

                        supereasymoves = findViewById(R.id.btn8);
                        Button easy =(Button) findViewById(R.id.btn8);

                        easy.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(Metabolism.this,supereasyworkout.class));
                            }
                        });

                        Showarticles = findViewById(R.id.ArticleButton);

                        Button show = (Button) findViewById(R.id.ArticleButton);

                        show.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(Metabolism.this, HomeActivity.class));
                            }
                        });



                    }
                });
            }
        });


    }
}