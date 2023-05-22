package com.example.kamal_musaev_hw_4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    ImageView icon;
    TextView textViewTitle, textViewDescription, textViewColor, textViewSum;;

    Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        product = (Product) getIntent().getSerializableExtra("product");

        findViews();

        setContentView();
    }

    private void findViews() {
        icon = findViewById(R.id.image_view);
        textViewTitle = findViewById(R.id.text_view_title);
        textViewDescription = findViewById(R.id.text_view_description);
        textViewColor = findViewById(R.id.text_view_color);
        textViewSum = findViewById(R.id.text_view_sum);
    }

    private void setContentView() {
        icon.setImageResource(product.getImage());
        textViewTitle.setText(product.getTitle());
        textViewDescription.setText(product.getDescription());
        textViewColor.setBackgroundResource(product.getColor());
        textViewSum.setText(product.getSum());
    }
}