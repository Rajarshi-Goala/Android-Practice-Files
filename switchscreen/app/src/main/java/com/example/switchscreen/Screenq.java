package com.example.switchscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Screenq extends AppCompatActivity {
    public int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screenq);
        getSupportActionBar().hide();

        switchscreen();

    }

    public void switchscreen(){
        Button back;
        back = (Button) findViewById(R.id.backButton);
        final Context context = this;



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,MainActivity.class); // Main line which switches screen
                Intent mintent = getIntent();
                val = mintent.getIntExtra("check",1);
                val++;
                intent.putExtra("check1",val);
                Log.i("check valfrom string", Integer.toString(val));
                if (val == 20){
                    hiddenbutton();
                }
                else{
                startActivity(intent);}
            }
        });

    }
    public void hiddenbutton(){
        Button button;
        button = findViewById(R.id.hidden);
        button.setVisibility(View.VISIBLE);
        final Context context = this;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i = new Intent(context,Hidden.class);
            startActivity(i);
            }
        });
    }

}