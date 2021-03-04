package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Articlesofsleeping extends AppCompatActivity {

    private Button healthyhygiene;
    private Button sleepurose;
    private Button reasonwhygood;
    private Button bettergetsleep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articlesofsleeping);

        healthyhygiene = findViewById(R.id.healthyhygiene);

        sleepurose = findViewById(R.id.sleepurose);

        reasonwhygood = findViewById(R.id.reasonwhygood);

        bettergetsleep = findViewById(R.id.bettergetsleep);

        healthyhygiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                healthyhygiene = findViewById(R.id.healthyhygiene);

                Button healthyhygiene = (Button) findViewById(R.id.healthyhygiene);

                healthyhygiene.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Articlesofsleeping.this,HealthySleepHygiene.class));
                    }
                });

                sleepurose = findViewById(R.id.sleepurose);

                Button sleepurose = (Button) findViewById(R.id.sleepurose);

                sleepurose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Articlesofsleeping.this,SleepPurpose.class));
                    }
                });

                reasonwhygood = findViewById(R.id.reasonwhygood);

                Button reasonwhygood = (Button) findViewById(R.id.reasonwhygood);

                reasonwhygood.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Articlesofsleeping.this,whygoodisimportant.class));
                    }
                });

                bettergetsleep = findViewById(R.id.bettergetsleep);

                Button bettergetsleep = (Button) findViewById(R.id.bettergetsleep);

                bettergetsleep.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(Articlesofsleeping.this,thebestwaystogetbetterSLEEP.class));

                    }
                });

            }
        });
    }
}