package com.example.makar1227.egida.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.makar1227.egida.R;
import com.example.makar1227.egida.donation.BankActivity;

public class DonationActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout bank, easy_pay, salary, sms, mae_sens, erip, volunteer;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation);

        bank = (LinearLayout) findViewById(R.id.bank);
        easy_pay = (LinearLayout) findViewById(R.id.easy_pay);
        salary = (LinearLayout) findViewById(R.id.salary);
        sms = (LinearLayout) findViewById(R.id.sms);
        mae_sens = (LinearLayout) findViewById(R.id.mae_sens);
        erip = (LinearLayout) findViewById(R.id.erip);
        volunteer = (LinearLayout) findViewById(R.id.volunteer);

        bank.setOnClickListener(this);
        easy_pay.setOnClickListener(this);
        salary.setOnClickListener(this);
        sms.setOnClickListener(this);
        mae_sens.setOnClickListener(this);
        erip.setOnClickListener(this);
        volunteer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == bank) {
            intent = new Intent(DonationActivity.this, BankActivity.class);
            startActivity(intent);

        }

        if (v == easy_pay) {


        }
        if (v == salary) {


        }
        if (v == sms) {


        }
        if (v == mae_sens) {


        }
        if (v == erip) {


        }
        if (v == volunteer) {


        }


    }
}
