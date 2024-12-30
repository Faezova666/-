package com.example.faezova;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void calculateCircleProperties(View v) {
        EditText inputField = findViewById(R.id.inputField);
        TextView resultField = findViewById(R.id.resultField);

        String input = inputField.getText().toString();

        double x = Double.parseDouble(input);


        double y = 4 * Math.pow((x - 3), 6) - 7 * Math.pow((x - 3), 6) + 2;

        resultField.setText("y =  " + y);

    }
    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity1.class);
        startActivity(intent);
    }
}
