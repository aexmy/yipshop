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

    double omg;

    private TextView price;
    private TextView quantity;
    private TextView subtotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //cardview 1 add
        final Button button_increase = findViewById(R.id.add_button);
        button_increase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                //get the price, child 3
                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                //get the quantity, child 10
                TextView quantity = (TextView) temp.getChildAt(10);
                String q = quantity.getText().toString();
                int qq = Integer.parseInt(q);
                counter = counter + 1;
                display(counter);
                Log.d(LOG_TAGR, "*quantity*" + counter);

                //get the subtotal, child 11
                TextView subtotal = (TextView) temp.getChildAt(11);
                String s = subtotal.getText().toString();
                double ss = Double.parseDouble(s);
                double finalSubtotal = counter * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                ViewGroup dabigtemp = (ViewGroup) temp.getParent();
                TextView subtotal_amount = (TextView) dabigtemp.getChildAt(2);

                //get ALL of it
                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                omg = dd1+dd2+dd3;

                displaySubber(omg);

                Log.d(LOG_TAGR, "*checkout*" + (omg));

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

        //cardview 1 decrease
        final Button button_decrease = findViewById(R.id.minus_button);
        button_decrease.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                //get the price, child 3
                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                //display
                Log.d(LOG_TAGR, "*price*" + pp);

                //get the quantity, child 10
                TextView quantity = (TextView) temp.getChildAt(10);
                String q = quantity.getText().toString();
                int qq = Integer.parseInt(q);
                if (counter > 0) {
                    counter = counter - 1;
                }
                //display
                display(counter);
                Log.d(LOG_TAGR, "*quantity*" + qq);

                //get the subtotal, child 11
                TextView subtotal = (TextView) temp.getChildAt(11);
                String s = subtotal.getText().toString();
                double ss = Double.parseDouble(s);
                double finalSubtotal = counter * pp;
                //display
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                //get ALL of it
                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                omg = dd1+dd2+dd3;

                displaySubber(omg);

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

        //cardview 2 add
        final Button button_increase2 = findViewById(R.id.add_button2);
        button_increase2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                //get the price, child 3
                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                //get the quantity, child 10
                TextView quantity = (TextView) temp.getChildAt(10);
                String q = quantity.getText().toString();
                int qq = Integer.parseInt(q);
                counter2 = counter2 + 1;
                display(counter2);
                Log.d(LOG_TAGR, "*quantity*" + counter2);

                //get the subtotal, child 11
                TextView subtotal = (TextView) temp.getChildAt(11);
                String s = subtotal.getText().toString();
                double ss = Double.parseDouble(s);
                double finalSubtotal = counter2 * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                ViewGroup dabigtemp = (ViewGroup) temp.getParent();
                TextView subtotal_amount = (TextView) dabigtemp.getChildAt(2);
                //String a = subtotal_amount.getText().toString();
                //double aa = Double.parseDouble(a);
                //double finalCheckout = finalSubtotal;

                //get ALL of it
                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                omg = dd1+dd2+dd3;

                displaySubber(omg);

                Log.d(LOG_TAGR, "*checkout*" + (omg));

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

        //cardview 2 decrease
        final Button button_decrease2 = findViewById(R.id.minus_button2);
        button_decrease2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                //get the price, child 3
                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                //display
                Log.d(LOG_TAGR, "*price*" + pp);

                //get the quantity, child 10
                TextView quantity = (TextView) temp.getChildAt(10);
                String q = quantity.getText().toString();
                int qq = Integer.parseInt(q);
                if (counter2 > 0) {
                    counter2 = counter2 - 1;
                }
                //display
                display(counter2);
                Log.d(LOG_TAGR, "*quantity*" + qq);

                //get the subtotal, child 11
                TextView subtotal = (TextView) temp.getChildAt(11);
                String s = subtotal.getText().toString();
                double ss = Double.parseDouble(s);
                double finalSubtotal = counter2 * pp;
                //display
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                //get ALL of it
                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                omg = dd1+dd2+dd3;

                displaySubber(omg);

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

        //cardview 3 add
        final Button button_increase3 = findViewById(R.id.add_button3);
        button_increase3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                //get the price, child 3
                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                //get the quantity, child 10
                TextView quantity = (TextView) temp.getChildAt(10);
                String q = quantity.getText().toString();
                int qq = Integer.parseInt(q);
                counter3 = counter3 + 1;
                display(counter3);
                Log.d(LOG_TAGR, "*quantity*" + counter3);

                //get the subtotal, child 11
                TextView subtotal = (TextView) temp.getChildAt(11);
                String s = subtotal.getText().toString();
                double ss = Double.parseDouble(s);
                double finalSubtotal = counter3 * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                //get ALL of it
                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                omg = dd1+dd2+dd3;

                displaySubber(omg);


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

        //cardview 3 decrease
        final Button button_decrease3 = findViewById(R.id.minus_button3);
        button_decrease3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                //get the price, child 3
                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                //display
                Log.d(LOG_TAGR, "*price*" + pp);

                //get the quantity, child 10
                TextView quantity = (TextView) temp.getChildAt(10);
                String q = quantity.getText().toString();
                int qq = Integer.parseInt(q);
                if (counter3 > 0) {
                    counter3 = counter3 - 1;
                }
                //display
                display(counter3);
                Log.d(LOG_TAGR, "*quantity*" + qq);

                //get the subtotal, child 11
                TextView subtotal = (TextView) temp.getChildAt(11);
                String s = subtotal.getText().toString();
                double ss = Double.parseDouble(s);
                double finalSubtotal = counter3 * pp;
                //display
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                //get ALL of it
                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                omg = dd1+dd2+dd3;

                displaySubber(omg);

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

    public void launchCheckoutActivity(View view) {
        Intent intent = new Intent(this, CheckoutActivity.class);
        intent.putExtra("helpidkwhatimdoing", omg);
        startActivity(intent);

        Log.d(LOG_TAG, "Button clicked!");
        Log.d(LOG_TAG, "!" + omg);
    }
}

