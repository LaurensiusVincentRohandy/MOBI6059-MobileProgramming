package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickDrinksButton(View view) {
        Intent intent = new Intent(this, DrinksActivity.class);
        startActivity(intent);
    }

    public void onClickSnacksButton(View view) {
        Intent intent = new Intent(this, SnacksActivity.class);
        startActivity(intent);
    }

    public void onClickFoodsButton(View view) {
        Intent intent = new Intent(this, FoodsActivity.class);
        startActivity(intent);
    }

    public void onClickTopUpButton(View view) {
        Intent intent = new Intent(this, TopUpActivity.class);
        startActivity(intent);
    }

    public void onClickMyOrder(View view) {
        Intent intent = new Intent(this, MyOrderActivity.class);
        startActivity(intent);
    }
}