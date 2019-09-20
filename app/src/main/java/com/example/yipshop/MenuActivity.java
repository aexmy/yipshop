package com.example.yipshop;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
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
    int counter2 = 0;
    int counter3 = 0;

    double transfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //To read the user's interaction with our FIRST item's add button, enable an onClickListener.
        final Button button_increase = findViewById(R.id.add_button1);
        button_increase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Firstly, we get the parent of the first CardView, which returns the ConstraintLayout
                ViewGroup temp = (ViewGroup) v.getParent();

                //Next, navigate the tree to get the price of the first item
                TextView price = (TextView) temp.getChildAt(3);
                //Now, we parse it to a double value
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                //Next, we set a counter that counts the amount of times the user clicks the button
                counter = counter + 1;
                //Now, we display the amount of clicks in the "Quantity" view
                display(counter);
                Log.d(LOG_TAGR, "*quantity*" + counter);

                //Next, we perform the calculation of the subtotal by multiplying the counter (amount of clicks) by the price.
                double finalSubtotal = counter * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                //The following steps are to get the total subtotal of all 3 items.
                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                //Add the subtotal of all 3 items
                transfer = dd1+dd2+dd3;

                //Display it on the upper right corner
                displaySubber(transfer);

                Log.d(LOG_TAGR, "*checkout*" + (transfer));
            }

            //Display method for the quantity
            private void display(int number) {
                TextView displayInteger = (TextView) findViewById(R.id.integer);
                displayInteger.setText("" + number);
            }

            //Display method for the subtotal for item number 1
            private void displaySub(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

            //Display method for the subtotal all 3 items
            private void displaySubber(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal_amount);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }
        });

        //Repeat all the steps, but this time to decrease the quantity of the FIRST item
        final Button button_decrease = findViewById(R.id.minus_button1);
        button_decrease.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                TextView quantity = (TextView) temp.getChildAt(10);
                String q = quantity.getText().toString();
                int qq = Integer.parseInt(q);
                if (counter > 0) {
                    counter = counter - 1;
                }
                display(counter);
                Log.d(LOG_TAGR, "*quantity*" + qq);

                TextView subtotal = (TextView) temp.getChildAt(11);
                double finalSubtotal = counter * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                transfer = dd1 + dd2 + dd3;

                displaySubber(transfer);
            }

            private void display(int number) {
                TextView displayInteger = (TextView) findViewById(R.id.integer);
                displayInteger.setText("" + number);
            }

            private void displaySub(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

            private void displaySubber(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal_amount);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

        });

        //Repeat all the steps, but this time to increase the quantity of the SECOND item
        final Button button_increase2 = findViewById(R.id.add_button2);
        button_increase2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                counter2 = counter2 + 1;
                display(counter2);
                Log.d(LOG_TAGR, "*quantity*" + counter2);

                double finalSubtotal = counter2 * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                transfer = dd1 + dd2 + dd3;

                displaySubber(transfer);

                Log.d(LOG_TAGR, "*checkout*" + (transfer));
            }

            private void display(int number) {
                TextView displayInteger = (TextView) findViewById(R.id.integer2);
                displayInteger.setText("" + number);
            }

            private void displaySub(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal2);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

            private void displaySubber(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal_amount);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }
        });

        //Repeat all the steps, but this time to decrease the quantity of the SECOND item
        final Button button_decrease2 = findViewById(R.id.minus_button2);
        button_decrease2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                TextView quantity = (TextView) temp.getChildAt(10);
                String q = quantity.getText().toString();
                int qq = Integer.parseInt(q);
                if (counter2 > 0) {
                    counter2 = counter2 - 1;
                }
                display(counter2);
                Log.d(LOG_TAGR, "*quantity*" + qq);

                double finalSubtotal = counter2 * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                transfer = dd1 + dd2 + dd3;

                displaySubber(transfer);
            }

            private void display(int number) {
                TextView displayInteger = (TextView) findViewById(R.id.integer2);
                displayInteger.setText("" + number);
            }

            private void displaySub(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal2);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

            private void displaySubber(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal_amount);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }
        });

        //Repeat all the steps, but this time to increase the quantity of the 3rd item
        final Button button_increase3 = findViewById(R.id.add_button3);
        button_increase3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                counter3 = counter3 + 1;
                display(counter3);
                Log.d(LOG_TAGR, "*quantity*" + counter3);

                double finalSubtotal = counter3 * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                transfer = dd1 + dd2 + dd3;

                displaySubber(transfer);
            }

            private void display(int number) {
                TextView displayInteger = (TextView) findViewById(R.id.integer3);
                displayInteger.setText("" + number);
            }

            private void displaySub(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal3);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

            private void displaySubber(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal_amount);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }
        });

        //Repeat all the steps, but this time to decrease the quantity of the 3rd item
        final Button button_decrease3 = findViewById(R.id.minus_button3);
        button_decrease3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                TextView quantity = (TextView) temp.getChildAt(10);
                String q = quantity.getText().toString();
                int qq = Integer.parseInt(q);
                if (counter3 > 0) {
                    counter3 = counter3 - 1;
                }
                display(counter3);
                Log.d(LOG_TAGR, "*quantity*" + qq);

                double finalSubtotal = counter3 * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                transfer = dd1 + dd2 + dd3;

                displaySubber(transfer);
            }

            private void display(int number) {
                TextView displayInteger = (TextView) findViewById(R.id.integer3);
                displayInteger.setText("" + number);
            }

            private void displaySub(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal3);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

            private void displaySubber(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal_amount);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }
        });
    }

    //This launches the CheckoutActivity.java, the screen that enables the user to see the subtotal, the TPS, the TVQ and the total amount to be paid
    public void launchCheckoutActivity(View view) {
        Intent intent = new Intent(this, CheckoutActivity.class);

        //This transfers the value of the subtotal from the MenuActivity.java to the CheckoutActivity.java screen
        ViewGroup layout_view = (ViewGroup) view.getParent();
        TextView checkout_view = (TextView) layout_view.getChildAt(2);
        String message = checkout_view.getText().toString();
        intent.putExtra("subtotal", message);
        startActivity(intent);

        Log.d(LOG_TAG, "Button clicked!");
        Log.d(LOG_TAG, "!" + message);
    }
}