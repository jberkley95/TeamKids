package org.teamkids.teamkids;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button missionButton, historyButton, whatWeDoButton, whyItMattersButton, eventsButton, mediaButton, donateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        missionButton = (Button) findViewById(R.id.missionButton);
        historyButton = (Button) findViewById(R.id.historyButton);
        whatWeDoButton = (Button) findViewById(R.id.whatWeDoButton);
        whyItMattersButton = (Button) findViewById(R.id.whyItMattersButton);
        eventsButton = (Button) findViewById(R.id.eventsButton);
        mediaButton = (Button) findViewById(R.id.mediaButton);
        donateButton = (Button) findViewById(R.id.donateButton);

        missionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent missionIntent = new Intent(getApplicationContext(), MissionActivity.class);
                startActivity(missionIntent);
            }
        });

        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent missionIntent = new Intent(getApplicationContext(), HistoryActivity.class);
                startActivity(missionIntent);
            }
        });

        whatWeDoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent missionIntent = new Intent(getApplicationContext(), WhatWeDoActivity.class);
                startActivity(missionIntent);
            }
        });

        whyItMattersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent missionIntent = new Intent(getApplicationContext(), WhyItMattersActivity.class);
                startActivity(missionIntent);
            }
        });

        eventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent missionIntent = new Intent(getApplicationContext(), EventsActivity.class);
                startActivity(missionIntent);
            }
        });

        mediaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent missionIntent = new Intent(getApplicationContext(), MediaActivity.class);
                startActivity(missionIntent);
            }
        });

        donateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.teamkids.org/donate-now");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
