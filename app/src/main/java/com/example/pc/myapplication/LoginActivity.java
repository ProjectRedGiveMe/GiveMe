package com.example.pc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class LoginActivity extends AppCompatActivity {

    Button loginBtn, registerBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginBtn = (Button)findViewById(R.id.loginBtn);
        registerBtn = (Button)findViewById(R.id.registerBtn);
    }
    //TODO - Goes to storage for now
    public void onClickLogin(View view) {
        Intent intent=new Intent(this,StorageActivity.class);
        startActivity(intent);

    }

    public void onClickGoToRegister(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
