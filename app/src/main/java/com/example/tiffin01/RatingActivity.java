package com.example.tiffin01;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class RatingActivity extends Fragment {
    private RatingBar ratingBar;
    private Button submitFeedback;
    private TextView tvRateCount, tvRateMessage;
    private float ratedValue;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_rating, container, false);

        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar);

        tvRateCount = (TextView) view.findViewById(R.id.tvRateCount);

        tvRateMessage = (TextView) view.findViewById(R.id.tvRateMessage);

        submitFeedback = view.findViewById(R.id.submitFeedback);


        submitFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override

            public void onRatingChanged(RatingBar ratingBar, float rating,

                                        boolean fromUser) {

                ratedValue = ratingBar.getRating();

                tvRateCount.setText("Your Rating : " + ratedValue + "/5.");

                if (ratedValue < 1) {

                    tvRateMessage.setText("ohh ho...");

                } else if (ratedValue < 2) {

                    tvRateMessage.setText("Ok.");

                } else if (ratedValue < 3) {

                    tvRateMessage.setText("Not bad.");

                } else if (ratedValue < 4) {

                    tvRateMessage.setText("Nice");

                } else if (ratedValue < 5) {

                    tvRateMessage.setText("Very Nice");

                } else if (ratedValue == 5) {

                    tvRateMessage.setText("Excellent");

                }

            }

        });
        return view;
    }

}

