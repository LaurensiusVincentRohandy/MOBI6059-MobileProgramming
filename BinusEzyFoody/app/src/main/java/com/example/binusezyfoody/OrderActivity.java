package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    ArrayList<Drinks> drinksList = new ArrayList<>();
    Drinks drinks;
    String name;
    int price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        TextView display = (TextView) findViewById(R.id.order);
        Intent intent = getIntent();
        for(Drinks drink : drinksList) {
            name = drink.getName();
            price = drink.getPrice();
            display.setText(name);
            display.setText(price);
        }
    }

    public void onClickMyOrder(View view) {
        EditText qtyView = (EditText) findViewById(R.id.qty);
        int qtyText = qtyView.getInputType();
        Intent intent = new Intent(this, MyOrderActivity.class);
        drinks.setQty(qtyText);
        drinksList.add(drinks);
        startActivity(intent);
    }

    public void onClickOrderMore(View view) {
        EditText qtyView = (EditText) findViewById(R.id.qty);
        int qtyText = qtyView.getInputType();
        Intent intent = new Intent(this, DrinksActivity.class);
        drinks.setQty(qtyText);
        drinksList.add(drinks);
        startActivity(intent);
    }
}