package com.example.nasir.farmersfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnUser=(Button)findViewById(R.id.btn_user);
        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                startActivity(new Intent(MainActivity.this,LoginsActivity.class));
            }
        });

        Button btnAdmin=(Button)findViewById(R.id.btn_admin);
        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                startActivity(new Intent(MainActivity.this,LoginsActivity.class));
            }
        });

        Button btnAdvertiser = (Button)findViewById(R.id.btn_advertiser);
        btnAdvertiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                startActivity(new Intent(MainActivity.this,LoginsActivity.class));
            }
        });

        Button btnUs= (Button)findViewById(R.id.btnAbout);
        btnUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                startActivity(new Intent(MainActivity.this,AboutActivity.class));
            }
        });
    }
}
