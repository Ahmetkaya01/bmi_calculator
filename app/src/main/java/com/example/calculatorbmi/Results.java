package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

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
                    "Diet. A steady weight loss of about one pound a week is the safest way to lose weight. Your doctor can refer you to a registered dietitian if you need help in planning your diet.\n" +
                    "Regular exercise such as brisk walking, running, swimming, biking, dancing. The amount of exercise needed to lose weight is different for everyone. Talk to your healthcare professional before you begin any new exercise program.\n" +
                    "Behavior modification techniques such as:\n" +
                    "Keep a food diary of everything you eat.\n" +
                    "Shop from a list and do not shop when you're hungry.\n" +
                    "Take a different route if you usually pass by a tempting fast food place. " +

                    "- If you want to have best advices Click The Next Button");
        }

        // Open Last Activity when Next button tapped!
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


    }

}

