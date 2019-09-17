package com.example.yipshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MenuActivity extends AppCompatActivity {

    private static final String LOG_TAG = CheckoutActivity.class.getSimpleName();
    private static final String LOG_TAGR = MenuActivity.class.getSimpleName();
    int counter = 0;
    private TextView price;
    private TextView quantity;
    private TextView subtotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final Button button = findViewById(R.id.add_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                ViewGroup temp = (ViewGroup) v.getParent();

                //get the price, child 3
                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                price.setText("" + pp);
                Log.d(LOG_TAGR, "*price*" + pp);//*how do i convert view to double?*

                //get the quantity, child 10
                TextView quantity = (TextView) temp.getChildAt(10);
                String q = quantity.getText().toString();
                int qq = Integer.parseInt(q);
                quantity.setText("" + qq);
                counter = counter + 1;
                display(counter);
                Log.d(LOG_TAGR, "*quantity*" + qq);//*how do i convert view to int?*

                //get the subtotal, child 11
                TextView subtotal = (TextView) temp.getChildAt(11);
                String s = subtotal.getText().toString();
                double ss = Double.parseDouble(s);
                subtotal.setText("" + ss);
                displaySub(counter*pp);
                Log.d(LOG_TAGR, "*subtotal*" + ss);

                //public void increase(){}

            }
            /**
            public void increase(View view){
                @Override
                public void onClick(View v){

                }
            }
**/
            private TextView getPriceFromButton(View view){
                ViewGroup temp = (ViewGroup)view.getParent();
                TextView price = (TextView)temp.getChildAt(3);
                price.setText(""+price.toString());
                Log.d(LOG_TAGR, "*getprice*"+price);
                return price;

            }

            private TextView getSubtotalFromButton(View view){
                ViewGroup temp = (ViewGroup)view.getParent();
                TextView subtotal = (TextView)temp.getChildAt(11);
                subtotal.setText(""+subtotal.toString());
                Log.d(LOG_TAGR, "*getsubtotal*"+subtotal);
                return subtotal;
            }

            private TextView getQuantityFromButton(View view){
                ViewGroup temp = (ViewGroup)view.getParent();
                TextView quantity = (TextView)temp.getChildAt(10);
                quantity.setText(""+quantity.toString());
                Log.d(LOG_TAGR, "*getquantity*"+quantity);
                return quantity;
            }

        });

    }
/**
    public void increase(View view){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter + 1;
                display(counter);
            }
        });
    }
 **/
    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(R.id.integer);
        displayInteger.setText("" + number);
    }

    private void displaySub(double number){
        TextView displaySubtotal = (TextView) findViewById(R.id.subtotal);
        displaySubtotal.setText("" + number);
    }

    public void launchCheckoutActivity(View view) {
        Intent intent = new Intent(this, CheckoutActivity.class);
        startActivity(intent);

        Log.d(LOG_TAG, "Button clicked!");
    }
/**
    public void button_id(View view){
        //get the parent view which is the constraint layout
        ViewGroup temp = (ViewGroup)view.getParent();

        //get the price, child 3, which is a textview
        this.price = (TextView)temp.getChildAt(3);
        Log.d(LOG_TAGR, "*price*"+price);//*how do i convert view to double?*

        //get the quantity, child 10
        this.quantity = (TextView)temp.getChildAt(10);
        Log.d(LOG_TAGR, "*quantity*"+quantity);//*how do i convert view to int?*

        //get the subtotal, child 11
        this.subtotal = (TextView)temp.getChildAt(11);
        Log.d(LOG_TAGR, "*subtotal*"+subtotal);
    }

    private TextView getPriceFromButton(View view){
        ViewGroup temp = (ViewGroup)view.getParent();
        this.price = (TextView)temp.getChildAt(3);
        this.price.setText(""+price.toString());
        Log.d(LOG_TAGR, "*getprice*"+price);
        return price;

    }

    private TextView getSubtotalFromButton(View view){
        ViewGroup temp = (ViewGroup)view.getParent();
        this.subtotal = (TextView)temp.getChildAt(11);
        this.subtotal.setText(""+subtotal.toString());
        Log.d(LOG_TAGR, "*getsubtotal*"+subtotal);
        return subtotal;
    }

    private TextView getQuantityFromButton(View view){
        ViewGroup temp = (ViewGroup)view.getParent();
        this.quantity = (TextView)temp.getChildAt(10);

        this.quantity.setText(""+quantity.toString());
        Log.d(LOG_TAGR, "*getquantity*"+quantity);
        return quantity;
    }
**/
}
