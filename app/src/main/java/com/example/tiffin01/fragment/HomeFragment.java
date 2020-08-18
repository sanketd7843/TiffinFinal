package com.example.tiffin01.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.tiffin01.R;
import com.example.tiffin01.ThirtyDaysPack;

public class HomeFragment extends Fragment {

    LinearLayout twoday, fifteenday, thirtyday;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        twoday = view.findViewById(R.id.twoDayPackageCard);
        fifteenday = view.findViewById(R.id.fiftyDayPackageCard);
        thirtyday = view.findViewById(R.id.thirtyDayPackageCard);

        twoday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ThirtyDaysPack.class);
                startActivity(i);
            }
        });
        
        fifteenday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ThirtyDaysPack.class);
                startActivity(i);
            }
        });

        thirtyday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ThirtyDaysPack.class);
                startActivity(i);
            }
        });

        return view;
    }
}