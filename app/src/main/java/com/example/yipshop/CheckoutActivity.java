package com.example.yipshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity {

    private static final String LOG_TAG = CheckoutActivity.class.getSimpleName();
    private double theSubtotal;
    private double theTps;
    private double theTvq;
    private double theTotal;

    // The following generates the CheckoutActivity.java screen.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        //In order to transfer the subtotal value to the subtotal view, get the subtotal view
        TextView subbie = (TextView)findViewById(R.id.subtotalsubtotal);

        //Create an intent in order to get the value we passed through getExtra()
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        //If the value is not null, get the value and parse it to a double value. Then, display it.
        if(bundle!=null)
        {
            String j =(String) bundle.get("subtotal");
            theSubtotal = Double.parseDouble(j);
            subbie.setText("" + String.format("%.2f", theSubtotal));
            Log.d(LOG_TAG, "!subtotal" + theSubtotal);
        }

        //In order to display the correct TPS (5%) tax value, get the TPS view. Then, set the TPS value to theSubtotal * 0.05
        TextView tps = (TextView)findViewById(R.id.tpstps);
        theTps = theSubtotal * 0.05;
        tps.setText("" + String.format("%.2f", theTps));
        Log.d(LOG_TAG, "!tps" + theTps);

        //In order to display the correct TVQ (9.975%) tax value, get the TVQ view. Then, set the TVQ value to theSubtotal * 0.09975
        TextView tvq = (TextView)findViewById(R.id.tvqtvq);
        theTvq = theSubtotal * 0.09975;
        tvq.setText("" + String.format("%.2f", theTvq));
        Log.d(LOG_TAG, "!tvq" + theTvq);

        //Finally, in order to display the correct total amount to be paid, add up theSubtotal, theTPS, theTVQ and display the value in the "TOTAL" view.
        TextView finalTotal = (TextView)findViewById(R.id.totaltotal);
        theTotal = theSubtotal + theTps + theTvq;
        finalTotal.setText("" + String.format("%.2f", theTotal));
        Log.d(LOG_TAG, "!total" + theTotal);
    }
}