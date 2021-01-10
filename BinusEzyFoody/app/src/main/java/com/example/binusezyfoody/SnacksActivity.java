package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SnacksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);
    }

    public void onClickBuyChips(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String order = "Chips\n Rp25.000";
        intent.putExtra(OrderActivity.EXTRA_MESSAGE, order);
        startActivity(intent);
    }

    public void onClickBuyBeng(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String order = "Beng-beng\n Rp2.000";
        intent.putExtra(OrderActivity.EXTRA_MESSAGE, order);
        startActivity(intent);
    }

    public void onClickBuyOreo(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String order = "Oreo\n Rp9.000";
        intent.putExtra(OrderActivity.EXTRA_MESSAGE, order);
        startActivity(intent);
    }

    public void onClickBuyMomogi(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        String order = "Momogi\n Rp7.000";
        intent.putExtra(OrderActivity.EXTRA_MESSAGE, order);
        startActivity(intent);
    }

    public void onClickMyOrder(View view) {
        Intent intent = new Intent(this, MyOrderActivity.class);
        startActivity(intent);
    }
}