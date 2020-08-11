package com.example.tiffin01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class loginOtpActivity extends AppCompatActivity {

    Button verifyOtp;
    EditText otp;
    TextView gotoSignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_otp);

        otp = findViewById(R.id.verifyOtp);
        verifyOtp = findViewById(R.id.btnVerifyOtp);
        gotoSignin = findViewById(R.id.goToSignIn);


        verifyOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(loginOtpActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        gotoSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(loginOtpActivity.this, loginMobActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}