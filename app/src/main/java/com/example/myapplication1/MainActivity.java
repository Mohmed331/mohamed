package com.example.myapplication1;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int num1, num2;
    private TextView resultView, num1View, num2View;
    private Button addButton, subtractButton, multiplyButton, divideButton, randomizeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1View = findViewById(R.id.num1View);
        num2View = findViewById(R.id.num2View);
        resultView = findViewById(R.id.resultView);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        randomizeButton = findViewById(R.id.randomizeButton);

        generateRandomNumbers();

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = num1 + num2;
                resultView.setText("Result: " + result);
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = num1 - num2;
                resultView.setText("Result: " + result);
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = num1 * num2;
                resultView.setText("Result: " + result);
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num2 != 0) {
                    double result = (double) num1 / num2;
                    resultView.setText("Result: " + result);
                } else {
                    resultView.setText("Can't divide by zero!");
                }
            }
        });

        randomizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateRandomNumbers();
            }
        });
    }

    private void generateRandomNumbers() {
        Random random = new Random();
        num1 = random.nextInt(10);
        num2 = random.nextInt(10);

        num1View.setText(String.valueOf(num1));
        num2View.setText(String.valueOf(num2));
        resultView.setText("Result:");
    }
}






