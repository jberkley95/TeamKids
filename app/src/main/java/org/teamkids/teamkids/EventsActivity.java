package org.teamkids.teamkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class EventsActivity extends AppCompatActivity {
    Button mainMenu;
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_layout);

        mainMenu = (Button) findViewById(R.id.btn_mainMenu);
        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenuIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainMenuIntent);
                finish();
            }
        });

        webview=(WebView)findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        openURL();
    }

    private void openURL() {
        webview.loadUrl("https://www.teamkids.org/upcoming-events");
        webview.requestFocus();
    }
}
