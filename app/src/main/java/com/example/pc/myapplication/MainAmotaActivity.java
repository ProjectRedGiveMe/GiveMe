package com.example.pc.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pc.myapplication.adapters.TabsPagerAdapter;

public class MainAmotaActivity extends AppCompatActivity {

    Button anonDonationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_amota);

        anonDonationBtn = (Button)findViewById(R.id.anonDonationBtn);

        ViewPager vpPager = (ViewPager) findViewById(R.id.viewpager);
        TabsPagerAdapter tpa = new TabsPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(tpa);
        vpPager.setCurrentItem(1); // Set the current fragment to display onCreate
    }
    public void onClickAnonDonation(View view) {
        Intent intent = new Intent(this, MainAnonymousActivity.class);
        startActivity(intent);
    }


    public void onClickLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

        public void onClickCallAmota(View view) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:1234567890"));
            startActivity(intent);

        }
}
