package com.example.a510.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnHospital, btnPharmacy, btnMsgSend, btnSearch;
    ImageButton btnEmergency;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEmergency = (ImageButton) findViewById(R.id.btnEmergency);
        btnEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:119"));
                startActivity(cIntent);
            }
        });


        btnMsgSend = (Button) findViewById(R.id.btnMsgSend);
        btnMsgSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:01045665180"));
                mIntent.putExtra("sms_body", "위급상황 입니다.");
                startActivity(mIntent);

            }
        });


        btnHospital = (Button) findViewById(R.id.btnHospital);
        btnHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hospital.class);
                startActivity(intent);
            }
        });


        btnPharmacy = (Button) findViewById(R.id.btnPharmacy);
        btnPharmacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pharmacy.class);
                startActivity(intent);

            }
        });

        btnSearch= (Button) findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/@-1.8938242,98.4227832,5346906m/data=!3m1!1e3?hl=ko"));
                startActivity(intent);

            }
        });
    }
}