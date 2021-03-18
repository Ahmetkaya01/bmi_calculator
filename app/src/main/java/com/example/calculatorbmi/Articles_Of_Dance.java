package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Articles_Of_Dance extends AppCompatActivity {
  //  benefitsofdance
           // historyofdance
 //   cantdance
         //   bestdance//

    private Button benefitsofdance; //
    private Button historyofdance;
    private Button thinkyoucant;
    private Button bestdance;
    private Button Dailymeditation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles__of__dance);

     benefitsofdance = findViewById(R.id.Benefitsofdance);

     historyofdance = findViewById(R.id.Historyofdance);

     thinkyoucant = findViewById(R.id.Thinkyoucant);

     bestdance = findViewById(R.id.Bestdance);

     Dailymeditation = findViewById(R.id.Dailymeditation);

     benefitsofdance.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             benefitsofdance = findViewById(R.id.Benefitsofdance);

             Button Benefitsofdance = (Button) findViewById(R.id.Benefitsofdance);

             Benefitsofdance.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     startActivity(new Intent(Articles_Of_Dance.this,Benefits_Of_Dance.class));
                 }
             });

             historyofdance = findViewById(R.id.Historyofdance);

             Button Historyofdance = (Button) findViewById(R.id.Historyofdance);

             Historyofdance.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     startActivity(new Intent(Articles_Of_Dance.this,History_Of_Dance.class));
                 }
             });

             thinkyoucant = findViewById(R.id.Thinkyoucant);

             Button Thinkyoucant = (Button) findViewById(R.id.Thinkyoucant);

             Thinkyoucant.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     startActivity(new Intent(Articles_Of_Dance.this,Think_You_Cant_Dance.class));
                 }
             });

             bestdance = findViewById(R.id.Bestdance);

             Button Bestdance = (Button) findViewById(R.id.Bestdance);

             Bestdance.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     startActivity(new Intent(Articles_Of_Dance.this,Best_Dance.class));
                 }
             });

             Dailymeditation = findViewById(R.id.Dailymeditation);

             Button Dailymeditation = (Button) findViewById(R.id.Dailymeditation);

             Dailymeditation.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     startActivity(new Intent(Articles_Of_Dance.this,Daily_Benefits_Meditation.class));
                 }
             });



         }
     });


    }
}