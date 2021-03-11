package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    private Button Calculate;
    private EditText Weight,Height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdView adView = new AdView(this);

        adView.setAdSize(AdSize.BANNER);

        adView.setAdUnitId("ca-app-pub-1259119329136843/6346849487");

        Weight=findViewById(R.id.etWeight);
        Height=findViewById(R.id.etHeight);


        Calculate = findViewById(R.id.btCalculate);

        // Open Results Activity when Calculate button tapped!
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get weight and height from text box
                String getW = Weight.getText().toString();
                String getH = Height.getText().toString();

                float Weight = Float.parseFloat(getW);
                float Height = Float.parseFloat(getH);
                float newH = Height / 100;

                // Calculate BMI, based on values given
                float bmiValue = Weight / (newH * newH);

                Intent intent = new Intent(MainActivity.this, Results.class);

                // Put BMI value in Intent to send over Results activity
                intent.putExtra("bmiValue", bmiValue);
                startActivity(intent);

            }
        });





    }
}