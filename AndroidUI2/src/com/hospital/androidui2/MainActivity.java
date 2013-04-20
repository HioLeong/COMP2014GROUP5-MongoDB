package com.hospital.androidui2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {

	String URL;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		View formBtn = findViewById(R.id.buttonForm);
		formBtn.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    getMenuInflater().inflate(R.menu.activity_main, menu);
		getMenuInflater().inflate(R.menu.nfc, menu);
		
		getMenuInflater().inflate(R.menu.barcode, menu);
		return true;
	}
	
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_settings:
			Intent settingsIntent = new Intent(this, SettingsActivity.class);
			startActivity(settingsIntent);
			return true;
		case R.id.help:
			return true;
		case R.id.barcode_scanner:
		    Intent LaunchIntent = getPackageManager()
			.getLaunchIntentForPackage("com.simonmacdonald.scan");
		    startActivity(LaunchIntent);
		    return true;
		case R.id.nfc_scanner:
		    Intent LaunchIntent2 = getPackageManager()
			.getLaunchIntentForPackage("nfc.tag");
		    startActivity(LaunchIntent2);
		    return true;
		default:
			return false;
		}
	}
	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		//URL = et.getText().toString();
		if (v.getId() == R.id.buttonForm) {
			// define a new Intent for the second Activity

			Intent intent = new Intent(this, FormListActivity.class);
			//intent.putExtra("URLKEY", URL);

			// start the second Activity
			this.startActivity(intent);
		}
		

	}

}
