package com.example.tiffin01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Random;

public class offersAdapter extends RecyclerView.Adapter<offersRecyclerViewHolder> {
    private Random random;

    public offersAdapter(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.offers_view;
    }

    @NonNull
    @Override
    public offersRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new offersRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull offersRecyclerViewHolder holder, int position) {
        holder.getView().setText(String.valueOf(random.nextInt()));
    }

    @Override
    public int getItemCount() {
        return 100;
    }
}