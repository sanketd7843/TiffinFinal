package com.example.tiffin01;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class offersRecyclerViewHolder extends RecyclerView.ViewHolder {

    private TextView view;
    public offersRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView.findViewById(R.id.offer_name);
    }
    public TextView getView(){
        return view;
    }
}