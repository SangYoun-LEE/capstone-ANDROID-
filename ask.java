package com.example.testeaxample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask);

        Button btn1 = (Button)findViewById(R.id.choi);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent myintent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-8855-8902"));
                startActivity(myintent);
            }
        });
         Button btn2 = (Button)findViewById(R.id.lee);
         btn2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-4149-6383"));
                 startActivity(intent);

            }
        });
    }
}
