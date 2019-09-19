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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        TextView subbie = (TextView)findViewById(R.id.subtotalsubtotal);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle!=null)
        {
            String j =(String) bundle.get("subtotal");
            theSubtotal = Double.parseDouble(j);
            subbie.setText("" + String.format("%.2f", theSubtotal));
            Log.d(LOG_TAG, "!subbie" + theSubtotal);
        }

        TextView tps = (TextView)findViewById(R.id.tpstps);
        theTps = theSubtotal * 0.05;
        tps.setText("" + String.format("%.2f", theTps));
        Log.d(LOG_TAG, "!tps" + theTps);

        TextView tvq = (TextView)findViewById(R.id.tvqtvq);
        theTvq = theSubtotal * 0.09975;
        tvq.setText("" + String.format("%.2f", theTvq));
        Log.d(LOG_TAG, "!tvq" + theTvq);

        TextView finalTotal = (TextView)findViewById(R.id.totaltotal);
        theTotal = theSubtotal + theTps + theTvq;
        finalTotal.setText("" + String.format("%.2f", theTotal));
        Log.d(LOG_TAG, "!total" + theTotal);
    }
}