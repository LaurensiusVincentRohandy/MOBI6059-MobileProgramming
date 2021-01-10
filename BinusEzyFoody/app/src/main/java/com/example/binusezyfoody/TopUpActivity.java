package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TopUpActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";
    TopUp topUp = new TopUp();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up);
        String balance = topUp.getBalance();
        TextView display = (TextView) findViewById(R.id.currBalance);
        display.setText(balance);
    }

    public void onClickBackButton(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}