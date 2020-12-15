package com.example.calculatorbmi;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button Calculate;
    private EditText Weight,Height;
    private TextView Answer;
    private Button Next;


   //TODO// String putExtra; //todo add string putextra;//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculate=findViewById(R.id.btCalculate);
        Weight=findViewById(R.id.etWeight);
        Height=findViewById(R.id.etHeight);
        Answer=findViewById(R.id.tvAnswer);
        Next=findViewById(R.id.btn2);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Next=(Button) findViewById(R.id.btn2);
                Intent intent = new Intent(MainActivity.this,Results.class);
                startActivity(intent);
            }
        });

        //add a radio button, isMale = true, female = false

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getW = Weight.getText().toString();
                String getH = Height.getText().toString();

                float Weight = Float.parseFloat(getW);
                float Height = Float.parseFloat(getH);

                float newH = Height / 100;
                float bmi = Weight / (newH * newH);





               if(bmi<18.5)
               {
                    Answer.setText("You Are Underweightwefwefwefwefwef");
                }

              else if(bmi>=18.5&&bmi<25){

                    Answer.setText("You Are Normal ");
                }
              else {
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



                    }



                });


    }
}