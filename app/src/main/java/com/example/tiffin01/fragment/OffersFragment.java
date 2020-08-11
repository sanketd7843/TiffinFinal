package com.example.tiffin01.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tiffin01.R;
import com.example.tiffin01.offersAdapter;

public class OffersFragment extends Fragment {


    private RecyclerView recyclerView;

    CardView cardView;

    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_offers, container, false);

        // Add the following lines to create RecyclerView
        recyclerView = view.findViewById(R.id.offersRv);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new offersAdapter(1234));

        return view;
    }
}