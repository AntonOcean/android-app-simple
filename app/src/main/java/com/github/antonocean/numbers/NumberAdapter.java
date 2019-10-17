package com.github.antonocean.numbers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberAdapter extends RecyclerView.Adapter<NumberViewHolder> {
    private OnNumberClickListener listener;
    private int maxNumber;

    NumberAdapter(int maxNumber, OnNumberClickListener listener) {
        this.listener = listener;
        this.maxNumber = maxNumber;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_number_button,
                viewGroup, false);
        return new NumberViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder numberViewHolder, int i) {
        numberViewHolder.bind(i);
    }

    void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
        notifyDataSetChanged();
    }

    int getMaxNumber() {
        return maxNumber;
    }

    @Override
    public int getItemCount() {
        return maxNumber;
    }
}
