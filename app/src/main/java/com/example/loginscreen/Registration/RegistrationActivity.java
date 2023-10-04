package com.example.loginscreen.Registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginscreen.R;
import com.example.loginscreen.login.LoginActivity;


public class RegistrationActivity extends AppCompatActivity {


    TextView mSignInLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initViews();

        openLoginActivity();
    }

    private void openLoginActivity() {
        mSignInLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
                finish();
            }
        });
    }






    private void initViews() {

        mSignInLink = findViewById(R.id.login_link);
    }
}
