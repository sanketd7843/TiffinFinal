package com.example.tiffin01.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tiffin01.R;
import com.example.tiffin01.subscriptionTwoDay;

public class SubscriptionFragment extends Fragment {

    TextView name, email, dob, number;
    LinearLayout two, fifteen, thirty;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_subscription, container, false);
        two = view.findViewById(R.id.subscriptionTwoDayPackage);
        fifteen = view.findViewById(R.id.subscriptionFifteenDayPackage);
        thirty = view.findViewById(R.id.subscriptionThirtyDayPackage);

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), subscriptionTwoDay.class);
                startActivity(i);
            }
        });




        return view;
    }
}

