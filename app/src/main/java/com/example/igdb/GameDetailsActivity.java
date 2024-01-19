package com.example.igdb;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GameDetailsActivity extends AppCompatActivity {

    private Button youtubeButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_details);

        youtubeButton = findViewById(R.id.youtubeButton);
        youtubeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoUrl = "https://www.youtube.com/watch?v=_LljNgGYY6w&t=96s";

                // Extract the video ID from the URL
                String videoId = extractVideoIdFromUrl(videoUrl);

                // Create an intent to open the YouTube app or a web browser
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=" + videoId));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");

                // Check if the YouTube app is installed
                PackageManager packageManager = getPackageManager();
                List<ResolveInfo> activities = packageManager.queryIntentActivities(intent, 0);
                boolean isIntentSafe = activities.size() > 0;

                if (isIntentSafe) {
                    // Open the YouTube app
                    startActivity(intent);
                } else {
                    // YouTube app is not installed, open the video in a web browser
                    intent.setPackage(null);
                    startActivity(intent);
                }
            }
        });
    }

    // Method to extract the video ID from a YouTube URL
    private String extractVideoIdFromUrl(String url) {
        String videoId = null;
        String regexPattern = "(?<=watch\\?v=|/videos/|embed\\/|youtu.be\\/|\\/v\\/|\\/e\\/|watch\\?v%3D|watch\\?feature=player_embedded&v=|%2Fvideos%2F|embed%\u200C\u200B2F|youtu.be%2F|%2Fv%2F)[^#\\&\\?\\n]*";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            videoId = matcher.group();
        }
        return videoId;
    }
}
