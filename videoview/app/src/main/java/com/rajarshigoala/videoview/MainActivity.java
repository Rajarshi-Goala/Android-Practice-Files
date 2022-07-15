package com.rajarshigoala.videoview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
double answer = 0.67;
Toast currentToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        // view Variables
        EditText editText = findViewById(R.id.answernumber);
        Button check = findViewById(R.id.checkButton);



        VideoView videoView = findViewById(R.id.videoViewlv3);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video1lv3);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        calculate();
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double inputans = Double.parseDouble(editText.getText().toString());
                if(inputans==answer){
                    check.setVisibility(View.INVISIBLE);
                    aftercheck(check);
                }
                else{
                    if(currentToast != null)
                        currentToast.cancel();
                    Toast.makeText(MainActivity.this, "Nope this is not the correct answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void calculate(){

        EditText editText1, editText2;
        TextView answertext,equaltext;
        editText1 = findViewById(R.id.inputnum1);
        editText2 = findViewById(R.id.inputno2);


        equaltext = findViewById(R.id.equaltotext);
        answertext = findViewById(R.id.answerbox);
        equaltext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1,num2,result;
                num1 = Double.parseDouble(editText1.getText().toString());
                num2 = Double.parseDouble(editText2.getText().toString());
                result = num1/num2;
                    answertext.setText(String.valueOf(result));
            }
        });


    }
    public void aftercheck(Button next){
        TextView intro,heading;
        heading = findViewById(R.id.textView2);
        intro = findViewById(R.id.textView7);
        heading.setText("Congratulations!! That is the correct answer, I see you know you probability theory.");
        intro.setText("You can now claim your rewards on the next page!!");
        next.setText("Next");
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

}

}