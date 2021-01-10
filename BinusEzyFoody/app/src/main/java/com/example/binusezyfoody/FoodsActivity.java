package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FoodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);
    }

    public void onClickBuyNasGor(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String order = "Nasi Goreng\n Rp15.000";
        intent.putExtra(OrderActivity.EXTRA_MESSAGE, order);
        startActivity(intent);
    }

    public void onClickBuyMie(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String order = "Mie Goreng\n Rp18.000";
        intent.putExtra(OrderActivity.EXTRA_MESSAGE, order);
        startActivity(intent);
    }

    public void onClickBuyKwetiau(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String order = "Kwetiau Goreng\n Rp20.000";
        intent.putExtra(OrderActivity.EXTRA_MESSAGE, order);
        startActivity(intent);
    }

    public void onClickBuyBihun(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String order = "Bihun Goreng\n Rp25.000";
        intent.putExtra(OrderActivity.EXTRA_MESSAGE, order);
        startActivity(intent);
    }

    public void onClickMyOrder(View view) {
        Intent intent = new Intent(this, MyOrderActivity.class);
        startActivity(intent);
    }
}