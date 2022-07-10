package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button euro1, euro2, usd1,usd2, pound1,pound2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        euro1 = (Button) findViewById(R.id.euro1);
        euro2 = (Button) findViewById(R.id.euro2);
        usd1 = (Button) findViewById(R.id.dollar1);
        usd2 = (Button) findViewById(R.id.dollar2);
        pound1 = (Button) findViewById(R.id.pound1);
        pound2 = (Button) findViewById(R.id.pound2);
        EditText editText1, editText2;
        editText1 = (EditText) findViewById(R.id.amountRupees);
        editText2 = (EditText) findViewById(R.id.amountOther);


        TextView textView1, textView2;
        textView1 = (TextView) findViewById(R.id.answer1);
        textView2 = (TextView) findViewById(R.id.answer2);

        euro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double inrs = Double.parseDouble(editText1.getText().toString());
                double ineuro;
                ineuro = inrs * 0.012381683;
                String converted = String.format("%.2f",ineuro);
                textView1.setText(converted + " EURO approx");

            }
        });
        usd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double inrs = Double.parseDouble(editText1.getText().toString());
                double inusd = inrs *0.012611850;
                String converted = String.format("%.2f",inusd);
                textView1.setText(converted + " USD approx");
            }
        });

        pound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double inrs = Double.parseDouble(editText1.getText().toString());
                double inpound = inrs *0.010484102;
                String converted = String.format("%.2f",inpound);
                textView1.setText(converted + " Pounds approx");
            }
        });
        pound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double inpound = Double.parseDouble(editText2.getText().toString());
                double inrs = inpound *95.3825111;
                String converted = String.format("%.2f",inrs);
                textView2.setText(converted + " Rs approx");
            }
        });
        euro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ineuro = Double.parseDouble(editText2.getText().toString());
                double inrs = ineuro *80.7644599;
                String converted = String.format("%.2f",inrs);
                textView2.setText(converted + " Rs approx");
            }
        });

        usd2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                double usd = Double.parseDouble(editText2.getText().toString());
                double inrs = usd *79.290508;
                String converted = String.format("%.2f",inrs);
                textView2.setText(converted + " Rs approx");
            }
        });



    }
}