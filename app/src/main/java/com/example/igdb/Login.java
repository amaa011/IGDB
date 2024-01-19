package com.example.igdb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private EditText editTextEmail, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.btnLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(Login.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Perform login logic here
                    // You can add code to authenticate the user and navigate to the appropriate activity
                    Toast.makeText(Login.this, "Login successful", Toast.LENGTH_SHORT).show();
                    // Navigate to the next activity
                    Intent intent = new Intent(Login.this, Signup.class);
                    startActivity(intent);
                    finish(); // Optional: Close the login activity if you don't want the user to come back to it by pressing the back button
                }
            }
        });
    }
}
