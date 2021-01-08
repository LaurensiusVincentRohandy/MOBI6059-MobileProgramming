package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MyOrderActivity extends AppCompatActivity {
    ArrayList<Drinks> drinksList = new ArrayList<>();
    Drinks drinks;
    String name;
    int price;
    int totalPrice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);
        TextView display = (TextView) findViewById(R.id.cart);
        Intent intent = getIntent();
        for(Drinks drink : drinksList) {
            name = drink.getName();
            price = drink.getQty() * drink.getPrice();
            totalPrice += price;
            display.setText(name);
            display.setText(price);
            Button delBtn = (Button) findViewById(R.id.delete);
        }
        display.setText(totalPrice);
    }

    public void onClickDelete(View view){
        drinksList.remove(drinks);
    }

    public void onClickOrderComplete(View view) {
        Intent intent = new Intent(this, OrderCompleteActivity.class);
        startActivity(intent);
    }
}