package com.example.pc.myapplication.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pc.myapplication.R;
import com.example.pc.myapplication.WantedItem;

import java.util.List;

/**
 * Created by Evgeni on 06.03.2018.
 */

public class WantedItemAdapter extends RecyclerView.Adapter<WantedItemAdapter.WantedItemViewHolder> {

    // ViewHolder objects managed by an Adapter
    public static class WantedItemViewHolder extends RecyclerView.ViewHolder{

        CardView wantedItemCv;
        TextView itemName;
        TextView itemQuantity;

        public WantedItemViewHolder(View itemView) {
            super(itemView);
            wantedItemCv = (CardView)itemView.findViewById(R.id.addressCv);
            itemQuantity = (TextView)itemView.findViewById(R.id.streetName);
            itemName = (TextView)itemView.findViewById(R.id.cityName);
        }
    }

    protected List<WantedItem> wantedItems;
    public WantedItemAdapter(List<WantedItem> wantedItems){
        this.wantedItems = wantedItems;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }


    @Override
    public WantedItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // LayoutInflater - Instantiates a layout XML file into its corresponding View objects
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        WantedItemViewHolder wivh = new WantedItemViewHolder(view);
        return wivh;
    }

    @Override
    public void onBindViewHolder(WantedItemViewHolder wantedItemViewHolder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        // TODO - change the setText to a wanted item
        wantedItemViewHolder.itemName.setText(wantedItems.get(position).itemName);
        wantedItemViewHolder.itemQuantity.setText(wantedItems.get(position).itemQuantity);

    }

    @Override
    // Return the size of your dataset (invoked by the layout manager)
    public int getItemCount() {
        return wantedItems.size();
    }


}
