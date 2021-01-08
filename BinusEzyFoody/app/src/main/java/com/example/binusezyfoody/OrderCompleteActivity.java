package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderCompleteActivity extends AppCompatActivity {
    ArrayList<Drinks> drinksList = new ArrayList<>();
    Drinks drinks;
    String name;
    int price;
    int totalPrice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_complete);
        TextView display = (TextView) findViewById(R.id.checkOut);
        Intent intent = getIntent();
        for(Drinks drink : drinksList) {
            name = drink.getName();
            price = drink.getQty() * drink.getPrice();
            totalPrice += price;
            display.setText(name);
            display.setText(price);
        }
        display.setText(totalPrice);
    }

    public void onClickMainMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}