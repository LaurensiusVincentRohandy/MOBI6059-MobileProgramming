package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cursoradapter.widget.SimpleCursorAdapter;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyOrderActivity extends AppCompatActivity {
    private SQLiteDatabase db;
    private Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        SQLiteOpenHelper databaseHelper = new DatabaseHelper(this);
        try {
            db = databaseHelper.getReadableDatabase();
            cursor = db.query("PESANAN",
                    new String[] {"_id", "NAME", "PRICE", "QUANTITY"},
                    null , null, null, null, null);

            SimpleCursorAdapter listAdapter = new SimpleCursorAdapter(this,
                    android.R.layout.simple_list_item_1,
                    cursor,
                    new String[] {"NAME", "PRICE", "QUANTITY"},
                    new int[] {android.R.id.text1},
                    0);
        } catch (SQLException e) {
            Toast toast = Toast.makeText(this, "Database Unavailable", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        cursor.close();
        db.close();
    }

    public void onClickDelete(View view){
    }

    public void onClickOrderComplete(View view) {
        Intent intent = new Intent(this, OrderCompleteActivity.class);
        startActivity(intent);
    }
}