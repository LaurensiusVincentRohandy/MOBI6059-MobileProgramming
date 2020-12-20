package com.example.bitsandpizzas;

public class Pasta {
    private String name;
    private int imageResourceID;

    public static final Pasta[] pastas = {
            new Pasta("Spaghetti Bolognese", R.drawable.spag_bol),
            new Pasta("Lasagne", R.drawable.lasagne)
    };

    private Pasta(String name, int imageResourceID){
        this.name = name;
        this.imageResourceID = imageResourceID;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceID(){
        return imageResourceID;
    }
}