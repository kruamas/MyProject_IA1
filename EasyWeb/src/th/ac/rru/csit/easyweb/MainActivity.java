package th.ac.rru.csit.easyweb;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView webView1=(WebView)findViewById(R.id.webView1);
		WebSettings webSetting=webView1.getSettings();
		webSetting.setJavaScriptEnabled(true);
		webView1.setWebViewClient(new WebViewClient());
		webView1.loadUrl("http://www.google.com");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
