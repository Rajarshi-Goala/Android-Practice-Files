package com.example.switchscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public  int val1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClicknext();
    }


    public void onClicknext() {
        Button next;
        next = findViewById(R.id.nextButton);
        final  Context context = this;

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, Screenq.class);
                Intent myintent = getIntent();
                boolean check = myintent.getBooleanExtra("check",false);
                if ( check == true){
                    val1 = 0;
                }
                else
                {
                    val1 = myintent.getIntExtra("check1",0);
                }

                val1++;
                intent.putExtra("check",val1);
                startActivity(intent);
            }
        });
    }

}