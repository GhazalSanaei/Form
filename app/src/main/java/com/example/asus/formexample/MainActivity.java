package com.example.asus.formexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final  EditText editTextName = findViewById(R.id.edtName);
        final  EditText editTextFamily = findViewById(R.id.edtFamily);
        final  EditText editTextAge = findViewById(R.id.edtAge);
        final  EditText editTextPhone = findViewById(R.id.edtPhone);
        final  EditText editTextEmail = findViewById(R.id.edtEmail);

        Button button = findViewById(R.id.btnSignUp);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SecondActivity.class);


                intent.putExtra("name_key",editTextName.getText().toString());
                intent.putExtra("family_key",editTextFamily.getText().toString());
                intent.putExtra("age_key",editTextAge.getText().toString());
                intent.putExtra("phone_key",editTextPhone.getText().toString());
                 intent.putExtra("email_key", editTextEmail.getText().toString());

                startActivity(intent);
            }
        });

    }
}
