package com.example.pc.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 27-Feb-18.
 */

public class MainAnonymousActivity extends AppCompatActivity {

    Button moneyDonationBtn, selfComingBtn;
    // Hardcoded number
    private static final String amotaPhoneNumber = "0547637557";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_anonnymous);


        moneyDonationBtn = (Button) findViewById(R.id.moneyDonationBtn);
        selfComingBtn = (Button) findViewById(R.id.selfComingBtn);

    }

    // Opens the dialer by click with the given number
    // ACTION_DIAL - opens the dialer ACTION_CALL calls the number
    // TODO - Figure out why ACTION_CALL gives an error/doesn't work
    public void onClickMoneyDonationCall(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + amotaPhoneNumber ));
        startActivity(intent);
    }



    public void onClickSelfComing(View view) {
        Intent intent = new Intent(this, AnonymousAddressActivity.class);
        startActivity(intent);
    }
}
