package com.rajarshigoala.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            // shared preferences stores data permanently thus when restarting the app the data stays.
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.rajarshigoala.sharedpreferences", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("admin", "Rajarshi Goala").apply();
        String admin = sharedPreferences.getString("admin","did not work");
        EditText username, password;
        username = (EditText) findViewById(R.id.userName);
        password = (EditText) findViewById(R.id.password);
        Button Login, Register;
        Login = (Button) findViewById(R.id.Login);
        Register = (Button) findViewById(R.id.Register);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences.edit().putString("username",username.getText().toString()).apply();
                sharedPreferences.edit().putString("password",password.getText().toString()).apply();
                user = sharedPreferences.getString("username","admin");
                pass = sharedPreferences.getString("password","admin");
                Log.i("user",user);
                Log.i("pass",pass);
                Toast.makeText(MainActivity.this, "This button worked!", Toast.LENGTH_SHORT).show();
            }
        });

        final Context context = this;

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals(user) && password.getText().toString().equals(pass)){
                    Intent intent = new Intent(context,loginpage.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(context, "Invalid creds", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}