package tech.japan.news.deletebadmessage.activity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * Created by lei.wang on 3/6/2017.
 */

public class WebViewContents extends Activity {

    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(tech.japan.news.deletebadmessage.R.layout.progressbar);

        String url = getIntent().getStringExtra("ArticleURL");

        if(url == null){
            super.onBackPressed();
        }

        //webView = (WebView) findViewById(R.id.webView);
        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.clearCache(true);
        webView.clearHistory();

        //webView.loadData(url, "text/html", "utf-8");
        webView.loadUrl(url);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                setContentView(webView);
            }

        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        webView.destroy();
    }


}
