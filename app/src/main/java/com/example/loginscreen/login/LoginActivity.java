package com.example.loginscreen.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.loginscreen.R;
import com.example.loginscreen.Registration.RegistrationActivity;


public class LoginActivity extends AppCompatActivity {

    TextView mSignUpLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();

        goToSignUpActivity();
    }

    private void goToSignUpActivity() {
        mSignUpLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
                finish();
            }
        });
    }


    private void initViews() {

        mSignUpLink = findViewById(R.id.signUpLink);
    }
}