package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class DrinksActivity extends AppCompatActivity {
    ArrayList<Drinks> drinksList = new ArrayList<>();
    Drinks drinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
    }

    public void onClickBuyWater(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        drinks.setName("Air Mineral");
        drinks.setPrice(37500);
        drinksList.add(drinks);
        startActivity(intent);
    }

    public void onClickBuyApel(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        drinks.setName("Jus Apel");
        drinks.setPrice(50000);
        drinksList.add(drinks);
        startActivity(intent);
    }

    public void onClickBuyMango(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        drinks.setName("Jus Mangga");
        drinks.setPrice(15000);
        drinksList.add(drinks);
        startActivity(intent);
    }

    public void onClickBuyAlpukat(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        drinks.setName("Jus Alpukat");
        drinks.setPrice(10000);
        drinksList.add(drinks);
        startActivity(intent);
    }

    public void onClickMyOrder(View view) {
        Intent intent = new Intent(this, MyOrderActivity.class);
        startActivity(intent);
    }
}