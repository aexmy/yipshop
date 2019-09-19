package com.example.yipshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CheckoutActivity extends AppCompatActivity {

    private static final String LOG_TAG = CheckoutActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

    }

    private void getSubbie(double number){
        Intent intent = getIntent();

        String subtotal = intent.getStringExtra("helpidkwhatimdoing");
        double s = Double.parseDouble(subtotal);

        Log.d(LOG_TAG, "!" + subtotal);
    }
}
