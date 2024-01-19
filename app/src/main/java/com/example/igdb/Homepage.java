package com.example.igdb;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        setupButtons();
        setupCardViews();
        setupBottomNavigation();
    }

    private void setupButtons() {
        Button promotionButton = findViewById(R.id.button123);
        Button navigateButton = findViewById(R.id.button1234);


        promotionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the promotion activity
                Intent intent = new Intent(Homepage.this, ActivityAcceptDeclineService.class);
                startActivity(intent);
            }
        });

        navigateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this, adddeleteserviceprovider.class);
                startActivity(intent);
            }
        });
    }

    private void setupCardViews() {
        // Add your CardView setup code here
        CardView card1 = findViewById(R.id.cardView2);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle card1 click
            }
        });

        CardView card2 = findViewById(R.id.card_view4);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle card2 click
            }
        });

        // Add more CardViews as needed
    }

    private void setupBottomNavigation() {
        FloatingActionButton floatingActionButton = findViewById(R.id.cartbtn);
        LinearLayout homeBtn = findViewById(R.id.homebtn1);
        LinearLayout Profilebtn = findViewById(R.id.Profilebtn1);
        LinearLayout Payment = findViewById(R.id.Supportbtn);
        LinearLayout Contact_us = findViewById(R.id.Settingbtn1);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage.this, Chat.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage.this, MainActivity.class));
            }
        });

        Profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage.this, Edit_profile.class));
            }
        });

        Payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage.this, GameDetailsActivity.class));
            }
        });

        Contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage.this, settegs.class));
            }
        });
    }
}
