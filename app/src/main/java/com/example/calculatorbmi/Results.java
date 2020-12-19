package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    private TextView Answer;
    private Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Answer = findViewById(R.id.tvAnswer);
        Next = findViewById(R.id.btn2);

        // Get BMI value sent from Main activity, using the key "bmiValue"
        Bundle extras = getIntent().getExtras();
        float bmiValue = extras.getFloat("bmiValue", 0);

        // Check bmiValue here and assign the text based on BMI value.
        if (bmiValue < 18.5) {
            // If BMI value less than 18.5, he is "underweight"
            Answer.setText("You Are Underweigh");
        } else if (bmiValue >= 18.5 && bmiValue < 25) {
            // If BMI value more than 18.5 and less than 25 he is "normal"
            Answer.setText("You Are Normal ");
        } else {
            Answer.setText("You Are Obese, What should you do if you are overweight or obese?\n" +
                    "Speak to your doctor about a weight loss program that is right for you. New research shows that a weight loss program should include three components to be successful — diet, exercise, and behavior modification. Your program may include:\n" +
                    "\n" +

                  "What are the treatments for obesity?\n" +


                    "- Get more information ");
        }

        // Open Next Activity when Next button tapped!
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Results.this,info.class));

            }
        });


    }

}

