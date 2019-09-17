package com.example.yipshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    private static final String LOG_TAG = CheckoutActivity.class.getSimpleName();
    private static final String LOG_TAGR = MenuActivity.class.getSimpleName();
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        /**
        final Button button = findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                //get the parent view which is the constraint layout
                ViewGroup temp = (ViewGroup)v.getParent();

                //get the price, child 3
                View price = temp.getChildAt(3);
                Log.d(LOG_TAGR, "*price*"+price);//*how do i convert view to double?*

                //get the quantity, child 10
                View quantity = temp.getChildAt(10);
                Log.d(LOG_TAGR, "*quantity*"+quantity);//*how do i convert view to int?*
            }
        });
         **/
    }

    public void launchCheckoutActivity(View view) {
        Intent intent = new Intent(this, CheckoutActivity.class);
        startActivity(intent);

        Log.d(LOG_TAG, "Button clicked!");
    }

    public void buy(View view){
        //get the parent view which is the constraint layout
        ViewGroup temp = (ViewGroup)view.getParent();

        View v = getPriceFromButton(view);
        Log.d(LOG_TAGR, "*33price*"+v);

        //get the price, child 3
        View price = temp.getChildAt(3);
        Log.d(LOG_TAGR, "*price*"+price);//*how do i convert view to double?*

        //get the quantity, child 10
        View quantity = temp.getChildAt(10);
        Log.d(LOG_TAGR, "*quantity*"+quantity);//*how do i convert view to int?*
    }


    private TextView getPriceFromButton(View view){
        ViewGroup temp = (ViewGroup)view.getParent();
        return (TextView)temp.getChildAt(3);
    }

    private TextView getSubtotalFromButton(View view){
        ViewGroup temp = (ViewGroup)view.getParent();
        return (TextView)temp.getChildAt(11);
    }

    private TextView getQuantityFromButton(View view){
        ViewGroup temp = (ViewGroup)view.getParent();
        return (TextView)temp.getChildAt(10);

    }

}
