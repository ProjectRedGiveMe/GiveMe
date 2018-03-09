package com.example.pc.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by Evgeni on 03.03.2018.
 */

public class CardViewActivity extends Activity {

    TextView cityName;
    TextView streetName;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anonymous_address_cv);


        cityName = (TextView)findViewById(R.id.cityName);
        streetName = (TextView)findViewById(R.id.streetName);

        cityName.setText("תל אביב");
        streetName.setText("דרך ההגנה 140");
    }
}
