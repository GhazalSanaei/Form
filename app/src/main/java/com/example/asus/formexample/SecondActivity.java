package com.example.asus.formexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);




        Intent intent = getIntent();


        TextView textViewName = findViewById(R.id.txtName);
        TextView textViewFamily = findViewById(R.id.txtFamily);
        TextView textViewAge = findViewById(R.id.txtAge);
        TextView textViewPhone = findViewById(R.id.txtPhone);
        TextView textViewEmail = findViewById(R.id.txtEmail);


        textViewName.setText(intent.getStringExtra("name_key"));
        textViewFamily.setText(intent.getStringExtra("family_key"));
        textViewAge.setText(intent.getStringExtra("age_key"));
        textViewPhone.setText(String.valueOf(intent.getStringExtra("phone_key")));
        textViewEmail.setText(intent.getStringExtra("email_key"));





    }
}
