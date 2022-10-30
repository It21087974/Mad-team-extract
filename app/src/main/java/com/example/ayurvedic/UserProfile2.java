package com.example.ayurvedic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserProfile2 extends AppCompatActivity {

    Button btnOpenThirdAct;
    Button btnOpenFifthAct;
    Button btnOpenSixthAct;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile2);

        btnOpenThirdAct=findViewById(R.id.Appbtn);
        btnOpenFifthAct=findViewById(R.id.Editbtn2);
        btnOpenSixthAct=findViewById(R.id.Back);


        btnOpenThirdAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(UserProfile2.this,Appointments.class);
                startActivity(intent);
            }

        });

        btnOpenFifthAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(UserProfile2.this,MainActivity2.class);
                startActivity(intent);
            }

        });
        btnOpenSixthAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(UserProfile2.this,MainActivity.class);
                startActivity(intent);
            }

        });


    }

}