package com.androidatc.lesson08_e7_webview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set the WebView to have a transparent border
        MyWebView.setBackgroundColor(Color.TRANSPARENT)

        // To enable JavaScript for the web browser
        MyWebView.settings.javaScriptEnabled = true

        // To load images automatically
        MyWebView.settings.loadsImagesAutomatically = true

        // Enable Scrolling
        MyWebView.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY

        // To avoid WebView to launch the default browser
        MyWebView.setWebViewClient(WebViewClient())

        // Shows the URL
        MyWebView.loadUrl("http://www.androidatc.com")
    }
}
