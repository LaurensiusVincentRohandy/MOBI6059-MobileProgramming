package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TopUpActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";
    TopUp topUp = new TopUp();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up);
        String balance = Integer.toString(topUp.getBalance());
        TextView display = (TextView) findViewById(R.id.currBalance);
        display.setText(balance);
    }

    public void onClickTopUpButton(View view) {
        EditText topUpView = (EditText)findViewById(R.id.inputTopUp);
        String topUpTxt = topUpView.getText().toString();
        int amount = Integer.parseInt(topUpTxt);
        if (amount > 2000000) {
            Toast toast = Toast.makeText(this, "Amount too big", Toast.LENGTH_LONG);
            toast.show();
        } else {
            topUp.setBalance(amount);
        }
        Intent intent = new Intent(this, TopUpActivity.class);
        startActivity(intent);
    }

    public void onClickBackButton(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}