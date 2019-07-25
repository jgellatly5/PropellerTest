package com.example.propellortest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MedicineListAdapter extends RecyclerView.Adapter<MedicineListAdapter.MedicineViewHolder> {
    private String[] mDataset;

    public class MedicineViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public MedicineViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.textView);
        }
    }

    public MedicineListAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @NonNull
    @Override
    public MedicineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MedicineViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MedicineViewHolder holder, int position) {
        holder.textView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
