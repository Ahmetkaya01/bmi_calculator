package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Articlesoffitness extends AppCompatActivity {

    private Button yourfitness;
    private Button thebestworkouts;
    private Button tenstep;
    private Button fiveburpeeworkout;
    private Button eiqhtquick;
    private Button fivemovemorning;
    private Button supereasy;
    private Button randomworkout;
    private Button plankitup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articlesoffitness);

        yourfitness = findViewById(R.id.yourfitness30);

        thebestworkouts = findViewById(R.id.thebestworkout);

        tenstep = findViewById(R.id.tenstep);

        fiveburpeeworkout = findViewById(R.id.fiveburpeeworkout);

        eiqhtquick = findViewById(R.id.eiqhtquick);

        fivemovemorning = findViewById(R.id.fivemovemorning);

        supereasy = findViewById(R.id.supereasy);

        randomworkout = findViewById(R.id.randomworkout);

        plankitup = findViewById(R.id.plankitup);

        yourfitness.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        yourfitness = findViewById(R.id.yourfitness30);

        Button yourfitnes = (Button) findViewById(R.id.yourfitness30);

        yourfitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Articlesoffitness.this,fitnessplan.class));
            }
        });

        thebestworkouts = findViewById(R.id.thebestworkout);

        Button thebestworkout = (Button) findViewById(R.id.thebestworkout);

        thebestworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Articlesoffitness.this,thebestbuttworkouts.class));
            }
        });

        tenstep = findViewById(R.id.tenstep);

        Button tenstep = (Button) findViewById(R.id.tenstep);

        tenstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Articlesoffitness.this,TENStepHIITWorkoutWllToneYour.class));

            }
        });

        fiveburpeeworkout = findViewById(R.id.fiveburpeeworkout);

        Button fiveburpeeworkout = (Button) findViewById(R.id.fiveburpeeworkout);

        fiveburpeeworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Articlesoffitness.this,FiveBurpeeWorkouts.class));
            }
        });

        eiqhtquick = findViewById(R.id.eiqhtquick);

        Button eiqhtquick = (Button) findViewById(R.id.eiqhtquick);

        eiqhtquick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Articlesoffitness.this,EightQuickresistance.class));
            }
        });

        fivemovemorning = findViewById(R.id.fivemovemorning);

        Button fivemovemorning = (Button) findViewById(R.id.fivemovemorning);

        fivemovemorning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Articlesoffitness.this,FiveMoveMorningworkout.class));
            }
        });

        supereasy = findViewById(R.id.supereasy);

        Button supereasy = (Button) findViewById(R.id.supereasy);

        supereasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Articlesoffitness.this,supereasyworkout.class));
            }
        });

        randomworkout = findViewById(R.id.randomworkout);

        Button randomworkout = (Button) findViewById(R.id.randomworkout);

        randomworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Articlesoffitness.this,Randomworkout.class));
            }
        });

        plankitup = findViewById(R.id.plankitup);

        Button plankitup = (Button) findViewById(R.id.plankitup);

        plankitup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Articlesoffitness.this,Plankitup.class));
            }
        });
    }
});









    }
}