package com.example.kamal_musaev_hw_4_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.kamal_musaev_hw_4_3.adapter.ProductAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick{
    ArrayList<Product> products = new ArrayList<>();

    ProductAdapter adapter;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createArrayList();
        adapter = new ProductAdapter(products, this);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
    }

    private void createArrayList() {
        products.clear();
        products.add(new Product("Cucumber",
                "Cucumbers are commonly mistaken for vegetables. But in fact they are fruits, specifically berries.",
                R.drawable.cucumber, "150", R.color.green));
        products.add(new Product("Watermelon",
                "It has an oval or spherical shape and a dark green and smooth rind, sometimes showing irregular areas of a pale green colour. ",
                R.drawable.watermelon, "200", R.color.green));
        products.add(new Product("Tomato",
                "They are usually red, scarlet, or yellow, though green and purple varieties do exist, and they vary in shape from almost spherical to oval and elongate to pear-shaped.",
                R.drawable.tomato, "120", R.color.red));
        products.add(new Product("Strawberry",
                "A strawberry is both a low-growing, flowering plant and also the name of the fruit that it produces. ",
                R.drawable.strawberry, "350", R.color.red));
        products.add(new Product("Orange",
                "Orange trees have dark green shiny leaves and small white flowers with five petals. The flowers smell very sweet which attracts many bees.",
                R.drawable.orange, "180", R.color.orange));
        products.add(new Product("Carrot",
                "Carrot is a biennial, belonging to the family Apiaceae, and is an important vegetable for its fleshy edible, colorful roots.",
                R.drawable.carrot, "45", R.color.orange));

    }

    @Override
    public void onItemClick(Product product) {
        Intent intent = new Intent(this, DescriptionActivity.class);
        intent.putExtra("product", product);
        startActivity(intent);
    }
}