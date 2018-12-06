package com.example.nasir.farmersfriend;

import android.content.Intent;
import android.os.Binder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        Button btnHome = (Button)findViewById(R.id.btnBack);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                startActivity(new Intent(AdminActivity.this,MainActivity.class));
            }
        });
    }
}
