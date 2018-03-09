package com.example.pc.myapplication;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.pc.myapplication.adapters.AddressAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 27-Feb-18.
 */

public class AnonymousAddressActivity extends AppCompatActivity {

    private static final String TelAvivDerahHagana140 = "waze://?ll=32.053548, 34.802653&navigate=yes";
    Button wazeBtn;
    private List<Address> addresses;
    RecyclerView anonymousAddressRv;
    Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anonymous_address_rv);

        anonymousAddressRv = (RecyclerView) findViewById(R.id.anonymousAddressRv);
        wazeBtn = (Button) findViewById(R.id.wazeBtn);

        // LinearLayoutManager sets by default RecyclerView look like a ListView
        LinearLayoutManager llm = new LinearLayoutManager(context);
        anonymousAddressRv.setLayoutManager(llm);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        // recyclerView.setHasFixedSize(true);

        initData();
        initAdapter();
    }

    // A method to start/initialize your Data, you may add as well
    private void initData(){
        addresses = new ArrayList<>();
        // TODO - ----- NICO TODO ----- from DB - city, street - list
        addresses.add(new Address("תל אביב", "דרך ההגנה 140"));
        addresses.add(new Address("אשדוד", "הנפילים 18"));
        addresses.add(new Address("חולון", "בר לב 75"));
        addresses.add(new Address("באר שבע", "מאזה 25"));
        addresses.add(new Address("חיפה", "פינת 98"));
        addresses.add(new Address("נהריה", "מאפו 55"));
        addresses.add(new Address("אילת", "אנילא 43"));
        addresses.add(new Address("קריית גת", "מכיר 43"));
        addresses.add(new Address("גבעתיים", "רחובות 31"));
    }
    // initiate Adapter
    private void initAdapter(){
        AddressAdapter adapter = new AddressAdapter(addresses);
        anonymousAddressRv.setAdapter(adapter);
    }

    // Starts navigate on click 
    public void onClickWazeStart(View view) {
        // TODO - Find a way to make it not hardcoded Longitude latitude
        String uri = TelAvivDerahHagana140;
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);

    }
}
