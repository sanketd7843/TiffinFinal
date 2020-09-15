package com.example.tiffin01.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.example.tiffin01.R;
import com.example.tiffin01.models.Student;

import java.util.List;

public class CardViewDataAdapter extends
        RecyclerView.Adapter<CardViewDataAdapter.ViewHolder> {

    private List<Student> stList;

    public CardViewDataAdapter(List<Student> students) {
        this.stList = students;

    }

    // Create new views
    @Override
    public CardViewDataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.cardview_row, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        final int pos = position;

        viewHolder.tvName.setText(stList.get(position).getName());

        viewHolder.tvEmailId.setText(stList.get(position).getEmailId());

        viewHolder.chkSelected.setChecked(stList.get(position).isSelected());

        viewHolder.chkSelected.setTag(stList.get(position));

        viewHolder.chkSelected1.setChecked(stList.get(position).isSelected());

       viewHolder.chkSelected1.setTag(stList.get(position));


		viewHolder.chkSelected.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				CheckBox cb1 = (CheckBox) v;
				Student contact = (Student) cb1.getTag();

				contact.setSelected(cb1.isChecked());
				stList.get(pos).setSelected(cb1.isChecked());


			}
		});

		viewHolder.chkSelected1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				CheckBox cb = (CheckBox) v;
				Student contact = (Student) cb.getTag();

				contact.setSelected1(cb.isChecked());
				stList.get(pos).setSelected1(cb.isChecked());


			}
		});

    }

    // Return the size arraylist
    @Override
    public int getItemCount() {
        return stList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvName;
        public TextView tvEmailId;

        public CheckBox chkSelected;
        public CheckBox chkSelected1;

        public Student singlestudent;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);

            tvName = (TextView) itemLayoutView.findViewById(R.id.tvName);

            tvEmailId = (TextView) itemLayoutView.findViewById(R.id.tvEmailId);
            chkSelected = (CheckBox) itemLayoutView.findViewById(R.id.chkSelected);
            chkSelected1 = (CheckBox) itemLayoutView.findViewById(R.id.chkSelected1);

        }

    }

    // method to access in activity after updating selection
    public List<Student> getStudentist() {
        return stList;
    }

}
