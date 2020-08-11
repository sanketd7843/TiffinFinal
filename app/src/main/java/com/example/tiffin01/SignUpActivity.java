package com.example.tiffin01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    EditText fullname,dob,email,refcode;
    Button signup;
    String gender;
    TextView jumpSignin;
    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        fullname = findViewById(R.id.fullNameSignup);
        dob = findViewById(R.id.dobSignup);
        email = findViewById(R.id.emailIdSignup);
        refcode = findViewById(R.id.refCodeSignup);
        signup = findViewById(R.id.signUpBtn);
        jumpSignin = findViewById(R.id.jumpSignIn);

        builder = new AlertDialog.Builder(this);

        radioSexGroup = (RadioGroup) findViewById(R.id.gender1);
        int selectedId = radioSexGroup.getCheckedRadioButtonId();
        radioSexButton = (RadioButton) findViewById(selectedId);
        gender = radioSexButton.getText().toString();


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignUpActivity.this, loginMobActivity.class);
                startActivity(i);
                finish();}
        });
        jumpSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignUpActivity.this, loginMobActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(SignUpActivity.this, loginMobActivity.class);
        startActivity(i);
        finish();

    }
}
