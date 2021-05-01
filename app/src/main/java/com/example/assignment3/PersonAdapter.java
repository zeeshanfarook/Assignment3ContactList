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

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder>{
    ArrayList<Person> people;
    public PersonAdapter(Context context, ArrayList<Person> list)
    {
        people =list;

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivDp, ivCallBtn, ivVideoCallBtn;
        TextView tvName, tvPhone;




        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivDp = itemView.findViewById(R.id.ivDp);
            tvName = itemView.findViewById(R.id.tvName);
            tvPhone = itemView.findViewById(R.id.tvPhone);
            ivCallBtn = itemView.findViewById(R.id.ivCallBtn);
            ivVideoCallBtn = itemView.findViewById(R.id.ivVideoCallBtn);

            ivCallBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            ivVideoCallBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });



        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvName.setText(people.get(position).getfName());
        holder.tvPhone.setText(people.get(position).getContactNumber());
        holder.ivDp.setImageResource(R.drawable.ic_person);


    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
