package com.lux.imr.welcomeaboard.menuOptions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.lux.imr.welcomeaboard.R;

public class Email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        WebView webView=(WebView)findViewById(R.id.wvemail);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://owa.luxoft.com/owa/auth/logon.aspx?replaceCurrent=1&url=https%3a%2f%2fowa.luxoft.com%2fowa%2f");



    }
}
