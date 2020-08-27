
package com.example.tiffin01;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FifteenDaysPack extends AppCompatActivity implements
        View.OnClickListener {

    Button btnStartDatePicker, btnEndDatePicker,btnDateSubmit;
    TextView txtDate, txtTime;
    private int mYear, mMonth, mDay, mHour, mMinute;
    LinearLayout description,dates;
    ImageButton descriptionUp,descriptionDown,dateDown,dateUp;
    String startDate = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen_days_pack);

        btnStartDatePicker = (Button) findViewById(R.id.btn_date);
        btnDateSubmit = findViewById(R.id.btnDateSubmit);
        btnEndDatePicker = (Button) findViewById(R.id.btn_time);
        txtDate = (TextView) findViewById(R.id.in_date);
        txtTime = (TextView) findViewById(R.id.in_time);


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
                            startDate = txtDate.getText().toString();

                            SimpleDateFormat sDate = new SimpleDateFormat("dd-MM-yyyy");
                            Calendar D = Calendar.getInstance();
                            try {
                                D.setTime(sDate.parse(startDate));
                                Log.e("err try", D.getTime().toString());
                            }
                            catch(ParseException e){
                                e.printStackTrace();
                                Log.e("err", e.toString());
                            }


                            //new code

                            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                            Calendar cd = Calendar.getInstance();
                            try {
                                cd.setTime(sdf.parse(startDate));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            cd.add(Calendar.DATE, 15);
                            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
                            String output = sdf1.format(cd.getTime());
                            Log.e("parsed", output);
                            txtTime.setText(output);
                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }

    btnDateSubmit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(FifteenDaysPack.this, MainActivity.class);
            startActivity(i);
            finish();
        }
    });


    }

}
