package com.example.igdb;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class forgetpassword extends AppCompatActivity {

    private EditText emailEditText;
    private Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);

        emailEditText = findViewById(R.id.emailEditText);
        resetButton = findViewById(R.id.resetButton);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();

                if (email.equals("example@gmail.com")) {
                    // TODO: Implement password reset logic here
                    // You can use your preferred method to send a password reset email to the user's email address

                    // Display a toast message to indicate that the password reset email has been sent
                    Toast.makeText(forgetpassword.this, "Password reset email sent to " + email, Toast.LENGTH_SHORT).show();
                } else {
                    // Display a toast message indicating that only users with a specific email address can reset their password
                    Toast.makeText(forgetpassword.this, "Only users with example@gmail.com can reset their password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
