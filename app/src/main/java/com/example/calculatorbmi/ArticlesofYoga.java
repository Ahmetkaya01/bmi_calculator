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

        yogandpain = findViewById(R.id.yogandpain);
        yogaforevery = findViewById(R.id.yogaforevery);
        yogapro = findViewById(R.id.yogapro);
        yogamoves12 = findViewById(R.id.yogamoves12);

        yogandpain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yogandpain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        yogandpain = findViewById(R.id.yogandpain);

                        Button yogandpain = (Button) findViewById(R.id.yogandpain);

                        yogandpain.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(ArticlesofYoga.this,yogaandpain.class));
                            }
                        });
                        yogaforevery = findViewById(R.id.yogaforevery);

                        Button yogaforevery = (Button) findViewById(R.id.yogaforevery);

                        yogaforevery.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(ArticlesofYoga.this, com.example.calculatorbmi.Yogaarticle.class));
                            }
                        });

                        yogapro = findViewById(R.id.yogapro);

                        Button yogapro = (Button) findViewById(R.id.yogapro);

                        yogapro.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(ArticlesofYoga.this,YogaforEveryone.class));
                            }
                        });

                        yogamoves12 = findViewById(R.id.yogamoves12);

                        Button thebestyogaposes1 = (Button)  findViewById(R.id.yogamoves12);

                        thebestyogaposes1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(ArticlesofYoga.this,Yogaproses.class));
                            }
                        });
                    }
                });
            }
        });
    }
}