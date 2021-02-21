package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class browse extends AppCompatActivity {

    private Button Browsebtn;
    private Button Homebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        Browsebtn = findViewById(R.id.browsebutton);
        Homebtn = findViewById(R.id.homebutton);

        

    }
}