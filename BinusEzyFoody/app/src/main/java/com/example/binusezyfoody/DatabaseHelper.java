package com.example.binusezyfoody;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "database";
    private static final int DB_VERSION = 1;

    DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE PESANAN (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "PRICE INTEGER, "
                + "QUANTITY INTEGER);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    private static void insertOrder(SQLiteDatabase db, String name, int price, int qty) {
        ContentValues orderValues = new ContentValues();
        orderValues.put("NAME", name);
        orderValues.put("PRICE", price);
        orderValues.put("QUANTITY", qty);
        db.insert("PESANAN", null, orderValues);
    }
}
