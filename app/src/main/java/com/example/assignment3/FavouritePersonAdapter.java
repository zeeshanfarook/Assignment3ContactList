package com.example.assignment3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FavouritePersonAdapter extends RecyclerView.Adapter<FavouritePersonAdapter.ViewHolder> {

    ArrayList<FvrtPerson> fvrtPeople;

    public FavouritePersonAdapter(Context context,ArrayList<FvrtPerson> listFavourite)
    {
        fvrtPeople = listFavourite;

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivPref;
        TextView tvNameFvrt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPref = itemView.findViewById(R.id.ivImageFvrt);
            tvNameFvrt = itemView.findViewById(R.id.tvNameFvrt);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_favourite, parent, false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.ivPref.setImageResource(R.drawable.ic_person);
        holder.tvNameFvrt.setText(fvrtPeople.get(position).getfName());

    }

    @Override
    public int getItemCount() {
        return fvrtPeople.size();
    }
}
