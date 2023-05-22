package com.example.kamal_musaev_hw_4_3.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kamal_musaev_hw_4_3.Product;
import com.example.kamal_musaev_hw_4_3.R;

public class ProductViewHolder extends RecyclerView.ViewHolder {
    TextView textViewTitle, textViewDescription, textViewColor, textViewSum;
    ImageView icon;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(Product product){
        textViewTitle = itemView.findViewById(R.id.text_view_title);
        textViewDescription = itemView.findViewById(R.id.text_view_description);
        textViewColor = itemView.findViewById(R.id.text_view_color);
        textViewSum = itemView.findViewById(R.id.text_view_sum);
        icon = itemView.findViewById(R.id.image_view);

        textViewTitle.setText(product.getTitle());
        textViewDescription.setText(product.getDescription());
        textViewSum.setText(product.getSum());
        textViewColor.setBackgroundResource(product.getColor());
        icon.setImageResource(product.getImage());

    }
}
