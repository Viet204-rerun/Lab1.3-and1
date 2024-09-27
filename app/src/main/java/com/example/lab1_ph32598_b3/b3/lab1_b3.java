package com.example.lab1_ph32598_b3.b3;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.lab1_ph32598_b3.R;

public class lab1_b3 extends ComponentActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_b3);
        tv1=findViewById(R.id.lab1_b3);
    }
}