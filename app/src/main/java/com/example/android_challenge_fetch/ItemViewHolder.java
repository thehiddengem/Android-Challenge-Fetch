package com.example.android_challenge_fetch;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    private TextView itemNameTextView;
    private TextView itemIdTextView;
    private TextView itemLisIdTextView;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        itemNameTextView = itemView.findViewById(R.id.itemNameTextView);
        itemIdTextView = itemView.findViewById(R.id.itemIdTextView);
        itemLisIdTextView = itemView.findViewById(R.id.itemListIdTextView);
    }

    public void bind(Item item) {
        itemIdTextView.setText(String.valueOf(item.getId()));
        itemLisIdTextView.setText(String.valueOf(item.getListId()));
        itemNameTextView.setText(item.getName());
    }
}
