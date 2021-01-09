package com.example.binusezyfoody;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DB_Name = "database";
    private static final int DB_Version = 1;

    public DatabaseHelper(Context context) {
        super(context, DB_Name, null, DB_Version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE DRINK (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "PRICE INTEGER, "
                + "STOCK INTEGER, "
                + "IMAGE_RESOURCE_ID INTEGER);");
        insertDrink(db, "Air Mineral", 2000, 48, R.drawable.air);
        insertDrink(db, "Jus Apel", 13000, 24, R.drawable.apel);
        insertDrink(db, "Jus Mangga", 6000, 10, R.drawable.gbr_mangga);
        insertDrink(db, "Jus Alpukat", 20000, 5, R.drawable.alpukat);

        db.execSQL("CREATE TABLE FOOD (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "PRICE INTEGER, "
                + "STOCK INTEGER, "
                + "IMAGE_RESOURCE_ID INTEGER);");
        insertFood(db, "Nasi Goreng", 15000, 15, R.drawable.gbr_nasgor);
        insertFood(db, "Mie Goreng", 5000, 40, R.drawable.gbr_mie);
        insertFood(db, "Kwetiau Goreng", 18000, 25, R.drawable.gbr_kwetiau);
        insertFood(db, "Bihun Goreng", 24000, 30, R.drawable.gbr_bihun);

        db.execSQL("CREATE TABLE SNACK (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "PRICE INTEGER, "
                + "STOCK INTEGER, "
                + "IMAGE_RESOURCE_ID INTEGER);");
        insertSnack(db, "Chips", 26000, 35, R.drawable.gbr_chips);
        insertSnack(db, "Beng-beng", 2000, 40, R.drawable.gbr_chips);
        insertSnack(db, "Oreo", 2000, 12, R.drawable.gbr_oreo);
        insertSnack(db, "Momogi", 8000, 20, R.drawable.gbr_momogi);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private static void insertDrink(SQLiteDatabase db, String name, int price, int stock, int resourceID) {
        ContentValues drinkValues = new ContentValues();
        drinkValues.put("NAME", name);
        drinkValues.put("PRICE", price);
        drinkValues.put("STOCK", stock);
        drinkValues.put("IMAGE_RESOURCE_ID", resourceID);
        db.insert("DRINK", null, drinkValues);
    }

    private static void insertFood(SQLiteDatabase db, String name, int price, int stock, int resourceID) {
        ContentValues foodValues = new ContentValues();
        foodValues.put("NAME", name);
        foodValues.put("PRICE", price);
        foodValues.put("STOCK", stock);
        foodValues.put("IMAGE_RESOURCE_ID", resourceID);
        db.insert("FOOD", null, foodValues);
    }

    private static void insertSnack(SQLiteDatabase db, String name, int price, int stock, int resourceID) {
        ContentValues snackValues = new ContentValues();
        snackValues.put("NAME", name);
        snackValues.put("PRICE", price);
        snackValues.put("STOCK", stock);
        snackValues.put("IMAGE_RESOURCE_ID", resourceID);
        db.insert("SNACK", null, snackValues);
    }
}
