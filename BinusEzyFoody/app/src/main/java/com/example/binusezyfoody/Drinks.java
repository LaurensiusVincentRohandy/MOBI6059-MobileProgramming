package com.example.binusezyfoody;

public class Drinks {
    private String name;
    private int price, qty, stock, imageResourceID;

    public static final Drinks[] drinks = {
            new Drinks("Air Mineral", 4000, 24, R.drawable.air),
            new Drinks("Jus Apel", 13000, 25, R.drawable.apel),
            new Drinks("Jus Mangga", 6000, 10, R.drawable.gbr_mangga),
            new Drinks("Jus Alpukat", 20000, 5, R.drawable.alpukat),
    };

    private Drinks(String name, int price, int stock, int imageResourceID) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.imageResourceID = imageResourceID;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
