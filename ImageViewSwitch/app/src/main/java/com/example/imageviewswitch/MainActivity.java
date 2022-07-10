package com.example.imageviewswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    // The below line creates an object of button class
Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.playbutton); // Assigns the id of play button to button 1, another simple way for better identification is to use the id as object itself.
        ImageView imageView; // create a object of class imageview to use the functions on image (switching in this case)
        imageView = (ImageView) findViewById(R.id.valomain); // Assign the current imageview to that button

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.valorant_004);  // change it to the target image view.
            }
        });
    }
}