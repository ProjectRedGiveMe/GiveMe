package com.example.pc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Evgeni on 24.02.2018.
 */



public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        Button btnReg = (Button)findViewById(R.id.registerBtn);
    }


    public void onClickRegisterSuccess(View v) {
        Intent intent=new Intent(this,RegisterConfirm.class);
        startActivity(intent);
    }
}
