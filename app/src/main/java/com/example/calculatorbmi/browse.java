package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Browser;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class browse extends AppCompatActivity {
    private Button fitnessarticle;
    private Button yogaarticle;
    private Button walkingarticle;
    private Button runningarticle;
    private Button sleeparticle;
    private Button Browsebtn;
    private Button Homebtn;
///AD//
    AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        fitnessarticle = findViewById(R.id.fitnessarticle);
        yogaarticle = findViewById(R.id.yogaarticle);
        walkingarticle = findViewById(R.id.walkingarticle);
        runningarticle = findViewById(R.id.runningarticle);
        sleeparticle = findViewById(R.id.sleepacticle);


        Browsebtn = findViewById(R.id.browsebutton);
        Homebtn = findViewById(R.id.homebutton);

        Browsebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Browsebtn = findViewById(R.id.browsebutton);

                Button browsebutton = (Button) findViewById(R.id.browsebutton);

                browsebutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(browse.this,browse.class));
                    }
                });

                Homebtn = findViewById(R.id.homebutton);

//                Button homebutton = (Button) findViewById(R.id.homebutton);
//
//                homebutton.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        startActivity(new Intent(browse.this,testercan.class));
//                    }
//                });

                fitnessarticle = findViewById(R.id.fitnessarticle);

                Button fitnessarticle = (Button) findViewById(R.id.fitnessarticle);

                fitnessarticle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(browse.this,Articlesoffitness.class));
                    }
                });

                yogaarticle = findViewById(R.id.yogaarticle);

                Button yogaarticle = findViewById(R.id.yogaarticle);

                yogaarticle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(browse.this,ArticlesofYoga.class));
                    }
                });

                walkingarticle = findViewById(R.id.yogaarticle);

                Button walkingarticle = findViewById(R.id.yogaarticle);

                walkingarticle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(browse.this,Articlesofwalking.class));
                    }
                });

                runningarticle = findViewById(R.id.runningarticle);

                Button runningarticle = findViewById(R.id.runningarticle);

                runningarticle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(browse.this,articlesofrunning.class));
                    }
                });

                sleeparticle = findViewById(R.id.sleepacticle);

                Button sleeparticle = findViewById(R.id.sleepacticle);

                sleeparticle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(browse.this,Articlesofsleeping.class));
                    }
                });

                adView = findViewById(R.id.adView);

                AdRequest adRequest = new AdRequest.Builder().build();

                  ///request internet permission///
                adView.loadAd(adRequest);

            }
        });

    }
}