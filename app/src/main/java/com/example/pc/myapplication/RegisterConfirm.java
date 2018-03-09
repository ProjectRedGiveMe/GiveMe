package com.example.pc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Evgeni on 06.03.2018.
 */

public class RegisterConfirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_register);
    }

    public void onClickHomePage(View view) {
        Intent intent=new Intent(this,MainAmotaActivity.class);
        startActivity(intent);
    }

    public void onClickGoToLogin(View view) {
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
