package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity2 extends AppCompatActivity {
    Button btnCheck, btnCheckTT;
    SessionManagement session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnCheck = findViewById(R.id.check);
        btnCheckTT = findViewById(R.id.checksesion);
        session = new SessionManagement(this);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();
            }
        });
        btnCheckTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                session.checkLogin();

                // get user data from session
                HashMap<String, String> user = session.getUserDetails();

                // name
                String name = user.get(session.KEY_NAME);

                // email
                String email = user.get(session.KEY_EMAIL);
                Toast.makeText(getApplicationContext(), name+""+email, Toast.LENGTH_LONG).show();
            }
        });
    }
}