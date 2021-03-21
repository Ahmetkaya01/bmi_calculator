package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArticlesofYoga extends AppCompatActivity {

    private Button yogandpain;
    private Button yogaforevery;
    private Button yogapro;
    private Button yogamoves12;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articlesof_yoga);

                         Button yogandpain = (Button) findViewById(R.id.yogandpain);

                        yogandpain.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(ArticlesofYoga.this,yogaandpain.class));
                            }
                        });


                        Button yogaforevery = (Button) findViewById(R.id.yogaforevery);

                        yogaforevery.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(ArticlesofYoga.this, com.example.calculatorbmi.Yogaarticle.class));
                            }
                        });



                        Button yogapro = (Button) findViewById(R.id.yogapro);

                        yogapro.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(ArticlesofYoga.this,YogaforEveryone.class));
                            }
                        });



                        Button thebestyogaposes1 = (Button)  findViewById(R.id.yogamoves12);

                        thebestyogaposes1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(ArticlesofYoga.this,Yogaproses.class));
                            }
                        });

    }
}