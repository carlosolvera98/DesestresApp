package mx.edu.utng.apppass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewTips extends AppCompatActivity {

    private WebView miWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_tips);



        miWebView = findViewById(R.id.wb_main);
        miWebView.getSettings().setJavaScriptEnabled(true);
        miWebView.getSettings().setAllowContentAccess(true);
        miWebView.getSettings().setAppCacheEnabled(true);
        miWebView.getSettings().setDomStorageEnabled(true);
        miWebView.getSettings().setUseWideViewPort(true);

        miWebView.setWebViewClient(new WebViewClient());
        miWebView.loadUrl("https://www.mayoclinic.org/es-es/healthy-lifestyle/stress-management/in-depth/stress-relievers/art-20047257");


    }
}
