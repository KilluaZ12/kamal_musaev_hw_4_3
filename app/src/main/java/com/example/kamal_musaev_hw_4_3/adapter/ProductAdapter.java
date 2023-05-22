package com.example.kamal_musaev_hw_4_3.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kamal_musaev_hw_4_3.OnItemClick;
import com.example.kamal_musaev_hw_4_3.Product;
import com.example.kamal_musaev_hw_4_3.R;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    ArrayList<Product> newArraylist;
    OnItemClick adapterOnItemClick;

    public ProductAdapter(ArrayList<Product> arrayList, OnItemClick onItemClick){
        newArraylist = arrayList;
        this.adapterOnItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_product, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.onBind(newArraylist.get(position));
        holder.itemView.setOnClickListener(v -> {
            adapterOnItemClick.onItemClick(newArraylist.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return newArraylist.size();
    }
}
