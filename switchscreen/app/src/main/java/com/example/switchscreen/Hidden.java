package com.example.switchscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hidden extends AppCompatActivity {
public boolean check = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidden);
        final Context context = this;
        Button b = findViewById(R.id.restart);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,MainActivity.class);
                intent.putExtra("check",check);
                startActivity(intent);

            }
        });
    }
}