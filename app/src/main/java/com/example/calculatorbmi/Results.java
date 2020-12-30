package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    private TextView Answer;
    private Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Answer = findViewById(R.id.tvAnswer);
        Next = findViewById(R.id.btn3);

        // Get BMI value sent from Main activity, using the key "bmiValue"
        Bundle extras = getIntent().getExtras();
        float bmiValue = extras.getFloat("bmiValue", 0);

        // Check bmiValue here and assign the text based on BMI value.
        if (bmiValue < 18.5) {
            // If BMI value less than 18.5, he is "underweight"
            Answer.setText("You Are Underweight\n" +
                    "Here are some healthy ways to gain weight when you're underweight:\n" +
                    "1-Eat more frequently. When you're underweight, you may feel full faster. \n" +
                    "2-Choose nutrient-rich foods. \n" +
                    "3-Try smoothies and shakes. \n" +
                    "4-Watch when you drink. \n" +
                    "5-Make every bite count. \n" +
                    "6-Top it off. \n" +
                    "7-Have an occasional treat. \n" +
                    "8-Exercise." );


        } else if (bmiValue >= 18.5 && bmiValue < 25) {
            // If BMI value more than 18.5 and less than 25 he is "normal"
            Answer.setText("You Are Normal " +
                    "Tips for Maintaining a Healthy Weight\n" +
                    "Limit portion size to control calorie intake.\n" +
                    "Add healthy snacks during the day if you want to gain weight.\n" +
                    "Be as physically active as you can be.\n" +
                    "Talk to your doctor about your weight if you think that you weigh too much or too little.");


        } else {
            Answer.setText("You are obese\n" +
                    "Follow These Steps\n"+
                    "8 weight loss tips\n" +
                    "1-Eat a high protein breakfast. ...\n" +
                    "2-Avoid sugary drinks and fruit juice. ...\n" +
                    "3-Drink water before meals. ...\n" +
                    "4-Choose weight-loss-friendly foods. ...\n" +
                    "5-Eat soluble fiber. ...\n" +
                    "6-Drink coffee or tea. ...\n" +
                    "7-Base your diet on whole foods. ...\n" +
                    "8-Eat slowly.");

        }

        // Open Next Activity when Next button tapped!
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Results.this,ObeseActivity.class));

            }
        });


    }

}

