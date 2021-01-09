package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class DrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        String[] drinkNames = new String[Drinks.drinks.length];
        for (int i = 0; i < drinkNames.length; i++){
            drinkNames[i] = Drinks.drinks[i].getName();
        }

        int[] drinkPrices = new int[Drinks.drinks.length];
        for (int i = 0; i < drinkPrices.length; i++){
            drinkPrices[i] = Drinks.drinks[i].getPrice();
        }

        int[] drinkStocks = new int[Drinks.drinks.length];
        for (int i = 0; i < drinkStocks.length; i++){
            drinkStocks[i] = Drinks.drinks[i].getStock();
        }

        int[] drinkImages = new int[Drinks.drinks.length];
        for (int i = 0; i < drinkPrices.length; i++){
            drinkPrices[i] = Drinks.drinks[i].getPrice();
        }
    }

    public void onClickBuyWater(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);
    }

    public void onClickBuyApel(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);
    }

    public void onClickBuyMango(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);
    }

    public void onClickBuyAlpukat(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);
    }

    public void onClickMyOrder(View view) {
        Intent intent = new Intent(this, MyOrderActivity.class);
        startActivity(intent);
    }
}