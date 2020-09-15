package com.example.tiffin01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tiffin01.adapters.CardViewDataAdapter;
import com.example.tiffin01.models.Student;

import java.util.ArrayList;
import java.util.List;

public class subscriptionTwoDay extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<Student> studentList;

    private Toolbar toolbar;

    private Button btnSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription_two_day);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        btnSelection = (Button) findViewById(R.id.btnDateSubmit);

        studentList = new ArrayList<Student>();

        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("Android Students");

        }

        for (int i = 1; i <= 2; i++) {
            Student st = new Student("1" + i+"/09/2020", "androidstudent" + i
                    + "@gmail.com", false, false);

            studentList.add(st);
        }

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // create an Object for Adapter
        mAdapter = new CardViewDataAdapter(studentList);

        // set the adapter object to the Recyclerview
        mRecyclerView.setAdapter(mAdapter);

        btnSelection.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String data = "";
                String data1 = "";
                List<Student> stList = ((CardViewDataAdapter) mAdapter)
                        .getStudentist();

                for (int i = 0; i < stList.size(); i++) {
                    Student singleStudent = stList.get(i);
                    if (singleStudent.isSelected() == true) {

                        data = data + "\n" + 1;

                    }
                    if (singleStudent.isSelected() == false) {

                        data = data + "\n" + 0;

                    }

                    if (singleStudent.isSelected1() == true) {

                        data1 = data1 + "\n" + 1;

                    }
                    if (singleStudent.isSelected1() == false) {

                        data1 = data1 + "\n" + 0;

                    }

                }

                Toast.makeText(subscriptionTwoDay.this, "Lunch " + data + "\n Dinner" + data1, Toast.LENGTH_LONG)
                        .show();
            }
        });

    }

}
