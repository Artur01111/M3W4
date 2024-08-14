package com.example.m3w4;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.m3w4.databinding.ItemMenuBinding;

public class MenuViewHolder extends RecyclerView.ViewHolder {
    ItemMenuBinding binding;

    public MenuViewHolder(@NonNull ItemMenuBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(Model item){
        binding.txt1.setText(item.txt);
        Glide.with(binding.img1).load(item.img).into(binding.img1);
    }
}
