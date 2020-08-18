package com.example.tiffin01;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class rewardFragment extends Fragment {

        TextView balance;
        LinearLayout redeem, earn;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

// Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.activity_reward, container, false);

            balance = view.findViewById(R.id.wallet_balance);
            redeem = view.findViewById(R.id.redeemMoney);
            earn = view.findViewById(R.id.earnMoney);
            redeem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getActivity(), MainActivity.class);
                    startActivity(i);
                }
            });
            earn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getActivity(), referFragment.class);
                    startActivity(i);
                }
            });

            return view;
        }
    }
