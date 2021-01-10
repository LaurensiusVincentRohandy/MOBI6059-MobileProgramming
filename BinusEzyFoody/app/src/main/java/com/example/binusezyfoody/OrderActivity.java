package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";
    public static final String EXTRA_ORDERID = "orderID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();
        String order = intent.getStringExtra(EXTRA_MESSAGE);
        TextView display = (TextView) findViewById(R.id.order);
        display.setText(order);
    }

    public void onClickMyOrder(View view) {
        EditText qtyView = (EditText) findViewById(R.id.qty);
        int qtyText = qtyView.getInputType();

        int orderID = (Integer)getIntent().getExtras().get(EXTRA_ORDERID);

        ContentValues orderValues = new ContentValues();
        orderValues.put("QUANTITY", qtyText);

        SQLiteOpenHelper databaseHelper = new DatabaseHelper(this);
        try {
            SQLiteDatabase db = databaseHelper.getReadableDatabase();
            db.update("PESANAN",
                    orderValues,
                    "_id = ?",
                    new String[]{Integer.toString(orderID)});
            db.close();
        } catch (SQLException e) {
            Toast toast = Toast.makeText(this, "Database Unavailable", Toast.LENGTH_LONG);
            toast.show();
        }

        Intent intent = new Intent(this, MyOrderActivity.class);
        startActivity(intent);
    }

    public void onClickOrderMore(View view) {
        EditText qtyView = (EditText) findViewById(R.id.qty);
        int qtyText = qtyView.getInputType();

        int orderID = (Integer)getIntent().getExtras().get(EXTRA_ORDERID);

        ContentValues orderValues = new ContentValues();
        orderValues.put("QUANTITY", qtyText);

        SQLiteOpenHelper databaseHelper = new DatabaseHelper(this);
        try {
            SQLiteDatabase db = databaseHelper.getReadableDatabase();
            db.update("PESANAN",
                    orderValues,
                    "_id = ?",
                    new String[]{Integer.toString(orderID)});
            db.close();
        } catch (SQLException e) {
            Toast toast = Toast.makeText(this, "Database Unavailable", Toast.LENGTH_LONG);
            toast.show();
        }

        Intent intent = new Intent(this, DrinksActivity.class);
        startActivity(intent);
    }
}