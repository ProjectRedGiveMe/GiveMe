package com.example.pc.myapplication.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pc.myapplication.Address;
import com.example.pc.myapplication.R;

import java.util.List;

/**
 * Created by Evgeni on 03.03.2018.
 */

public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.AddressViewHolder> {

    // ViewHolder objects managed by an Adapter
    public static class AddressViewHolder extends RecyclerView.ViewHolder{

        CardView addressCv;
        TextView cityName;
        TextView streetName;

        public AddressViewHolder(View itemView) {
            super(itemView);
            addressCv = (CardView)itemView.findViewById(R.id.addressCv);
            streetName = (TextView)itemView.findViewById(R.id.streetName);
            cityName = (TextView)itemView.findViewById(R.id.cityName);
        }
    }

    protected List<Address> addresses;
    public AddressAdapter(List<Address> addresses){
        this.addresses = addresses;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView anonymousAddressRv){
        super.onAttachedToRecyclerView(anonymousAddressRv);
    }


    @Override
    public AddressViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // LayoutInflater - Instantiates a layout XML file into its corresponding View objects
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        AddressViewHolder avh = new AddressViewHolder(view);
        return avh;
    }

    @Override
    public void onBindViewHolder(AddressViewHolder addressViewHolder, int position) {
       // - get element from your dataset at this position
       // - replace the contents of the view with that element
       addressViewHolder.cityName.setText(addresses.get(position).city);
       addressViewHolder.streetName.setText(addresses.get(position).street);
    }

    @Override
    // Return the size of your dataset (invoked by the layout manager)
    public int getItemCount() {
        return addresses.size();
    }


}
