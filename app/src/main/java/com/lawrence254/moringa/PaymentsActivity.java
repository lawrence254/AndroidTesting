package com.lawrence254.moringa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PaymentsActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.payment) Button btnPayment;
    @BindView(R.id.paymentId) Button btnPaymentId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);
        ButterKnife.bind(this);

        btnPayment.setOnClickListener(this);
        btnPaymentId.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==btnPayment){
            Intent intent = new Intent(this, mpesaPaymentActivity.class);
            startActivity(intent);
        }
        else if (v==btnPaymentId){
            Intent intent = new Intent(this, PaymentConfirmationActivity.class);
            startActivity(intent);
        }
    }
}
