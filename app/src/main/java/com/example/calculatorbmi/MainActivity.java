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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculate=findViewById(R.id.btCalculate);
        Weight=findViewById(R.id.etWeight);
        Height=findViewById(R.id.etHeight);
        Answer=findViewById(R.id.tvAnswer);
        Next=findViewById(R.id.btn2);
        //add a radio button, isMale = true, female = false

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getW=Weight.getText().toString();
                String getH=Height.getText().toString();

                float Weight=Float.parseFloat(getW);
                float Height=Float.parseFloat(getH);

                float newH=Height/100;
                float bmi=Weight/(newH*newH);

                Intent intent = new Intent(MainActivity.this,Results.class);
               // intent.putExtra("bmi", bmi);
                startActivity(intent);

//                if(bmi<18.5)
//
//                {
//                    Answer.setText("You Are Underweight");
//                }
//
//                else if(bmi>=18.5&&bmi<25){
//
//                    Answer.setText("You Are Normal");
//
//                }
//
//                else Answer.setText("You Are Obese");

            }

            {
                Next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Next=(Button) findViewById(R.id.btn2);

                        Intent intent = new Intent(MainActivity.this,Results.class);

                        startActivity(intent);

                    }
                });
            }
        });


    }
}