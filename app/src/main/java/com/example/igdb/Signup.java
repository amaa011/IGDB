package com.example.igdb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {

    private EditText editTextName, editTextEmail, editTextPassword;
    private Button buttonSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonSignup = findViewById(R.id.buttonSignup);

        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(Signup.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Perform signup logic here
                    // You can add code to store user information in a database or perform any other necessary actions
                    Toast.makeText(Signup.this, "Signup successful", Toast.LENGTH_SHORT).show();
                    // Navigate to the next activity
                    Intent intent = new Intent(Signup.this, Login.class);
                    startActivity(intent);
                    finish(); // Optional: Close the signup activity if you don't want the user to come back to it by pressing the back button
                }
            }
        });
    }
}
