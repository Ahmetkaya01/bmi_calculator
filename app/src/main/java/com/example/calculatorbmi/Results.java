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

        Answer=findViewById(R.id.tvAnswer);
        Next=findViewById(R.id.btn2);

        // Open Last Activity when Next button tapped!
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


    }

}

