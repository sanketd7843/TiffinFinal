package com.example.tiffin01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class loginMobActivity extends AppCompatActivity {

    EditText mobileNo;
    Button sendOtp;
    TextView gotoSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_mob);

        mobileNo = findViewById(R.id.loginMobNo);
        sendOtp = findViewById(R.id.loginOtp);
        gotoSignup = findViewById(R.id.jumpToSignUp);

        sendOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(loginMobActivity.this, loginOtpActivity.class);
                startActivity(i);
                finish();
            }
        });
        gotoSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(loginMobActivity.this, SignUpActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}