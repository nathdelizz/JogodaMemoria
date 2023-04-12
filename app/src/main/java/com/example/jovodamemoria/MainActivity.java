package com.example.jovodamemoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonX1;
    Button buttonX2;
    Button buttonO1;
    Button button02;
    Button buttonI1;
    Button buttonI2;
    Button buttonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonX1 = findViewById(R.id.buttonX1);
        buttonX2 = findViewById(R.id.buttonX2);
        buttonO1 = findViewById(R.id.buttonO1);
        button02 = findViewById(R.id.buttonO2);
        buttonI1 = findViewById(R.id.buttonI1);
        buttonI2 = findViewById(R.id.buttonI2);
        buttonJogar = findViewById(R.id.buttonJogar);

        buttonJogar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, RespostaMemoria.class);
                startActivity(in);
            }
        });

    }
}