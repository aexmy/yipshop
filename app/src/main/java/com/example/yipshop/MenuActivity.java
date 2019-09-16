package com.example.yipshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    //int minteger;
    private static final String LOG_TAG = CheckoutActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void launchCheckoutActivity(View view) {
        Intent intent = new Intent(this, CheckoutActivity.class);
        startActivity(intent);

        Log.d(LOG_TAG, "Button clicked!");
    }

    /**
    private void buy(View view){
        ViewGroup viewer = (ViewGroup)view.getParent();
        viewer.getChildAt(3);
        Log.d(LOG_TAG, "Increased! Decreased!");
    }

    public void increase(View view){
        minteger = minteger + 1;
        display(minteger);
    }

    public void decrease(View view){
        if(minteger > 0)
            minteger = minteger - 1;
        display(minteger);
    }

    private void display(int number){
        TextView displayInteger = (TextView)findViewById(R.id.integer);
        displayInteger.setText("" + number);
    }

    private double getPrice(){
        TextView displayPrice = (TextView)findViewById(R.id.price);
        double desiredPrice = Integer.valueOf(displayPrice.getText().toString());
        return desiredPrice;
    }

    private int getQuantity(){
        TextView displayQuantity = (TextView)findViewById(R.id.quantity);
        int desiredQuantity = Integer.valueOf(displayQuantity.getText().toString());
        return desiredQuantity;
    }

    private void displaySubtotal(int subtotal){
        TextView textView = (TextView)findViewById(R.id.subtotal);
        double displaySubtotal = getPrice()*getQuantity();
        textView.setText(String.valueOf(displaySubtotal));
        textView.setText(""+displaySubtotal);
    }
     **/
}
