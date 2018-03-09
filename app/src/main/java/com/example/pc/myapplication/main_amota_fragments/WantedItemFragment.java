package com.example.pc.myapplication.main_amota_fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
;
import com.example.pc.myapplication.R;
import com.example.pc.myapplication.WantedItem;
import com.example.pc.myapplication.adapters.WantedItemAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeni on 04.03.2018.
 */

public class WantedItemFragment extends Fragment {

    private List<WantedItem> wantedItems;
    // TODO - do I need a new recyclerview?
    RecyclerView wantedItemRv;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        wantedItemRv = view.findViewById(R.id.wantedItemRv);

        /*LinearLayoutManager llm = new LinearLayoutManager(context);
        wantedItemRv.setLayoutManager(llm);*/
        /*initData();
        initAdapter();*/

        return view;






    }
    /*// A method to start/initialize your Data, you may add as well
    private void initData(){
        wantedItems = new ArrayList<>();
        // TODO - ----- NICO TODO ----- from DB - itemName, itemQuantity - list
        // TODO - Figure out what the fuck is the problem with fragment, recycler, cardview
        // TODO - Make a method to sort the most wanted items
        wantedItems.add(new WantedItem("דייסות מטרה", 5));
        wantedItems.add(new WantedItem("מטרנה חלבי", 3));
        wantedItems.add(new WantedItem("מטרה מהדרין", 8));
        wantedItems.add(new WantedItem("מטרנה אקסטרה קאר", 23));
        wantedItems.add(new WantedItem("מחיות מטרנה", 16));
        wantedItems.add(new WantedItem("מטרנה ביסקוויט", 2));


    }
    // initiate Adapter
    private void initAdapter(){
        WantedItemAdapter adapter = new WantedItemAdapter(wantedItems);
        wantedItemRv.setAdapter(adapter);
    }*/





}
