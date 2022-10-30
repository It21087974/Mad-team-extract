package com.example.ayurvedic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Appointments extends AppCompatActivity {

    Button btnOpenFourthAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointments);

        btnOpenFourthAct=findViewById(R.id.Paybtn);
        btnOpenFourthAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Appointments.this,Payment2.class);
                startActivity(intent);
            }
        });
    }
}