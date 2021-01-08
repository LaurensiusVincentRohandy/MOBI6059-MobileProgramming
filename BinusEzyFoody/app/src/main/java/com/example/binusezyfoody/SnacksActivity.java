package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class SnacksActivity extends AppCompatActivity {
    ArrayList<Snacks> snacksList = new ArrayList<>();
    Snacks snacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);
    }

    public void onClickBuyChips(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        snacks.setName("Chips");
        snacks.setPrice(15000);
        snacksList.add(snacks);
        startActivity(intent);
    }

    public void onClickBuyBeng(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        snacks.setName("Beng-beng");
        snacks.setPrice(2000);
        snacksList.add(snacks);
        startActivity(intent);
    }

    public void onClickBuyOreo(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        snacks.setName("Oreo");
        snacks.setPrice(10000);
        snacksList.add(snacks);
        startActivity(intent);
    }

    public void onClickBuyMomogi(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        snacks.setName("Momogi");
        snacks.setPrice(5000);
        snacksList.add(snacks);
        startActivity(intent);
    }

    public void onClickMyOrder(View view) {
        Intent intent = new Intent(this, MyOrderActivity.class);
        startActivity(intent);
    }
}