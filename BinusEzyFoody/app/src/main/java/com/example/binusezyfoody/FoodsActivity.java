package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class FoodsActivity extends AppCompatActivity {
    ArrayList<Foods> foodsList = new ArrayList<>();
    Foods foods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }

    public void onClickBuyNasi(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        foods.setName("Nasi Goreng");
        foods.setPrice(15000);
        foodsList.add(foods);
        startActivity(intent);
    }

    public void onClickBuyMie(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        foods.setName("Mie Goreng");
        foods.setPrice(20000);
        foodsList.add(foods);
        startActivity(intent);
    }

    public void onClickBuyKwetiau(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        foods.setName("Kwetiau Goreng");
        foods.setPrice(25000);
        foodsList.add(foods);
        startActivity(intent);
    }

    public void onClickBuyBihun(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        foods.setName("Bihun Goreng");
        foods.setPrice(10000);
        foodsList.add(foods);
        startActivity(intent);
    }

    public void onClickMyOrder(View view) {
        Intent intent = new Intent(this, MyOrderActivity.class);
        startActivity(intent);
    }
}