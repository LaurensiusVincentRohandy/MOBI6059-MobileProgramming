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
    }

    public void onClickBuyWater(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String order = "Air Mineral\n Rp2.000";
        intent.putExtra(OrderActivity.EXTRA_MESSAGE, order);
        startActivity(intent);
    }

    public void onClickBuyApel(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String order = "Jus Apel\n Rp4.000";
        intent.putExtra(OrderActivity.EXTRA_MESSAGE, order);
        startActivity(intent);
    }

    public void onClickBuyMango(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String order = "Jus Mangga\n Rp6.000";
        intent.putExtra(OrderActivity.EXTRA_MESSAGE, order);
        startActivity(intent);
    }

    public void onClickBuyAlpukat(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String order = "Jus Alpukat\n Rp10.000";
        intent.putExtra(OrderActivity.EXTRA_MESSAGE, order);
        startActivity(intent);
    }

    public void onClickMyOrder(View view) {
        Intent intent = new Intent(this, MyOrderActivity.class);
        startActivity(intent);
    }
}