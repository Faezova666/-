package com.example.faezova;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void onCalculateButton(View v) {
        EditText inputFieldR1 = findViewById(R.id.inputFieldR1);
        EditText inputFieldR2 = findViewById(R.id.inputFieldR2);
        TextView resultField = findViewById(R.id.resultField);

        String inputR1 = inputFieldR1.getText().toString();
        String inputR2 = inputFieldR2.getText().toString();

        double R1 = Double.parseDouble(inputR1);
        double R2 = Double.parseDouble(inputR2);
        if (R1 < R2) {
            resultField.setText("Ошибка: R1 должно быть больше R2");
            return;
        }

        double pi = 3.14;
        double S1 = pi * Math.pow(R1, 2);
        double S2 = pi * Math.pow(R2, 2);
        double S3 = S1 - S2;

        resultField.setText("S1 = " + (S1) + "  S2 = " + (S2) + "  S3 = " + (S3));
    }
}

