package sjec.tiara2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Registration extends AppCompatActivity {
    WebView vw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        vw=(WebView)findViewById(R.id.regweb);
        vw.getSettings().setJavaScriptEnabled(true);
        vw.loadUrl("https://www.google.com");
        vw.setWebViewClient(new WebViewClient());


}

}
