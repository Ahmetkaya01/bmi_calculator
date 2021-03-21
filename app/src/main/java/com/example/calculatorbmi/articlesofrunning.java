package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class articlesofrunning extends AppCompatActivity {
    private Button benefitofrunning;
    private Button benefitsofjogging;
    private Button runinthemorning;
    private Button sixbenefits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articlesofrunning);



                Button benefitofrunning = (Button) findViewById(R.id.benefitofrunning);

                benefitofrunning.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(articlesofrunning.this,benefitsofRunningThatMakeYou.class));
                    }
                });

                benefitsofjogging = findViewById(R.id.benefitsofjogging);

                Button benefitsofjogging = (Button) findViewById(R.id.benefitsofjogging);

                benefitsofjogging.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(articlesofrunning.this,benefitsofrunningandjogging.class));
                    }
                });

                runinthemorning = findViewById(R.id.runinthemorning);

                 Button runinthemorning = (Button) findViewById(R.id.runinthemorning);

                runinthemorning.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(articlesofrunning.this,runninginthemorning.class));
                    }
                });

                sixbenefits = findViewById(R.id.sixbenefits);

                Button sixbenefits = (Button) findViewById(R.id.sixbenefits);

                sixbenefits.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(articlesofrunning.this,sixbenefitsofrunning.class));
                    }
                });



    }
}