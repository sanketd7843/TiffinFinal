package com.example.tiffin01.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tiffin01.R;

public class AccountFragment extends Fragment {

    TextView name, email, dob, number;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_account, container, false);

        name = view.findViewById(R.id.profileName);
        email = view.findViewById(R.id.profileEmail);
        dob = view.findViewById(R.id.profileDob);
        number = view.findViewById(R.id.profileMobNo);

        return view;
    }
}

