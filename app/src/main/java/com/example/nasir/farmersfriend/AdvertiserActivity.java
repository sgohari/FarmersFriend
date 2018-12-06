package com.example.nasir.farmersfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdvertiserActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertiser);

        Button btnBack = (Button)findViewById(R.id.btnHome);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                startActivity(new Intent(AdvertiserActivity.this,MainActivity.class));
            }
        });
    }
}
