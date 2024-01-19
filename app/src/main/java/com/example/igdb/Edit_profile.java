package com.example.igdb;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Edit_profile extends AppCompatActivity {

    private EditText editTextEmail, editTextAddress, editTextOldPassword, editTextNewPassword, editTextPhoneNumber;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextOldPassword = findViewById(R.id.editTextOldPassword);
        editTextNewPassword = findViewById(R.id.editTextNewPassword);
        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        buttonSave = findViewById(R.id.buttonSave);

        // Retrieve the user's current information
        String currentEmail = "johndoe@example.com"; // Replace with the actual email
        String currentAddress = "123 Main St"; // Replace with the actual address
        String currentPhoneNumber = "1234567890"; // Replace with the actual phone number

        // Set the current information in the EditText fields
        editTextEmail.setText(currentEmail);
        editTextAddress.setText(currentAddress);
        editTextPhoneNumber.setText(currentPhoneNumber);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the updated information
                String newEmail = editTextEmail.getText().toString().trim();
                String newAddress = editTextAddress.getText().toString().trim();
                String oldPassword = editTextOldPassword.getText().toString().trim();
                String newPassword = editTextNewPassword.getText().toString().trim();
                String newPhoneNumber = editTextPhoneNumber.getText().toString().trim();

                // Perform validation or any necessary checks on the updated information

                // Update the user's information in the database or any other appropriate actions

                // Display a toast message to indicate successful update
                Toast.makeText(Edit_profile.this, "Profile updated", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
