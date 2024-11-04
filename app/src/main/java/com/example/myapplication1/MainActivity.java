package com.example.myapplication1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private boolean isOn = true;
    private int mode = 1;
    private TextView tvmode,tvtemp;

    private int temp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvmode = findViewById(R.id.tvmode);
        temp = 24;
        tvtemp=findViewById(R.id.tvTemp);



    }


    public void checkMode(View view) {
        if (isOn&&mode==1) {
            mode = 2;

            tvmode.setText("heat");
        } else {
            mode = 1;

            tvmode.setText("cool");
        }
    }
    public void checkstatus(View view) {
        if (isOn) {
            isOn = false;
        } else {
            isOn = true;
        }
    }

    public void m1(View view) {
        if (  isOn&&temp > 16 ) {
            temp--;
            tvtemp.setText(String.valueOf(temp));
        }
    }
    public void pu1(View view) {
        if (  isOn&&temp < 30 ) {
            temp++;
            tvtemp.setText(String.valueOf(temp));
        }
    }
}
