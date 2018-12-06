package com.example.nasir.farmersfriend;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginsActivity extends AppCompatActivity {

    Button btnLog;
    EditText usernameET,passwordET;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logins);
        usernameET =(EditText)findViewById(R.id.edtUsers);
        passwordET=(EditText)findViewById(R.id.edtPass);

        btnLog=(Button)findViewById(R.id.btnLogin);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                usernameET =(EditText)findViewById(R.id.edtUsers);
                String user=usernameET.getText().toString();
                passwordET=(EditText)findViewById(R.id.edtPass);
                String password=passwordET.getText().toString();

                if (user.equals("admin") && password.equals("admin"))
                {
                    startActivity(new Intent(LoginsActivity.this,AdminActivity.class));
                }
                else if (user.equals("farmer") && password.equals("farmer"))
                {
                    startActivity(new Intent(LoginsActivity.this,FarmersActivity.class));
                }
                else if (user.equals("advertiser") && password.equals("advertiser"))
                {
                    startActivity(new Intent(LoginsActivity.this,AdvertiserActivity.class));
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"UserID and Password is Required ",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
