
package com.example.tiffin01;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class ThirtyDaysPack extends AppCompatActivity implements
        View.OnClickListener {

    Button btnStartDatePicker, btnEndDatePicker,btnDateSubmit;
    EditText txtDate, txtTime;
    private int mYear, mMonth, mDay, mHour, mMinute;
    LinearLayout description,dates;
    ImageButton descriptionUp,descriptionDown,dateDown,dateUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_days_pack);

        btnStartDatePicker = (Button) findViewById(R.id.btn_date);
        btnDateSubmit = findViewById(R.id.btnDateSubmit);
        btnEndDatePicker = (Button) findViewById(R.id.btn_time);
        txtDate = (EditText) findViewById(R.id.in_date);
        txtTime = (EditText) findViewById(R.id.in_time);


        dateDown = findViewById(R.id.bt_toggle_dateDown);
        dateUp = findViewById(R.id.bt_toggle_dateUp);
        dates = findViewById(R.id.lyt_expand_date);


        descriptionUp = findViewById(R.id.bt_toggle_descriptionUp);
        descriptionDown = findViewById(R.id.bt_toggle_descriptionDown);
        description = findViewById(R.id.lyt_expand_description);


        btnStartDatePicker.setOnClickListener(this);
        btnEndDatePicker.setOnClickListener(this);

        descriptionDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                description.setVisibility(View.VISIBLE);
                descriptionDown.setVisibility(View.GONE);
                descriptionUp.setVisibility(View.VISIBLE);
            }
        });

        descriptionUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                description.setVisibility(View.GONE);
                descriptionDown.setVisibility(View.VISIBLE);
                descriptionUp.setVisibility(View.GONE);
            }
        });

        dateDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dates.setVisibility(View.VISIBLE);
                dateDown.setVisibility(View.GONE);
                dateUp.setVisibility(View.VISIBLE);
            }
        });

        dateUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dates.setVisibility(View.GONE);
                dateDown.setVisibility(View.VISIBLE);
                dateUp.setVisibility(View.GONE);
            }
        });

    }

    @Override
    public void onClick(View v) {

        if (v == btnStartDatePicker) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }

        if (v == btnEndDatePicker) {
            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txtTime.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }

    btnDateSubmit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(ThirtyDaysPack.this, MainActivity.class);
            startActivity(i);
            finish();
        }
    });


    }

}
