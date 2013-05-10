package com.hospital.androidui2;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends ListActivity implements OnClickListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		List<String> listValues = new ArrayList<String>();
		listValues.add("Online Forms");
		listValues.add("Offline Forms");
		listValues.add("Analysis");
		FormListArrayAdapter adapter = new FormListArrayAdapter(this, 0,
				listValues);
		setListAdapter(adapter);
	}

	public class FormListArrayAdapter extends ArrayAdapter<String> {

		private Context mContext;
		private List<String> mValues;

		public FormListArrayAdapter(Context context, int textViewResourceId,
				List<String> values) {
			super(context, textViewResourceId, values);
			mContext = context;
			mValues = values;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			String positionedValue = mValues.get(position);
			LayoutInflater inflater = (LayoutInflater) mContext
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

			View view = inflater.inflate(R.layout.form_list_row, parent, false);

			TextView textView = (TextView) view
					.findViewById(R.id.formlist_row_text);
			textView.setText(positionedValue);

			view.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					Intent intent = new Intent(MainActivity.this,
							FormListActivity.class);
					MainActivity.this.startActivity(intent);
				}

			});

			return view;
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.nfc, menu);
		getMenuInflater().inflate(R.menu.activity_main, menu);
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
		case R.id.nfc_scanner:
			Intent intent = new Intent(this, SecondActivity.class);
			intent.putExtra("DEMO", "DEMO");
			startActivity(intent);
			return true;
		default:
			return false;
		}
	}

	@Override
	public void onClick(View v) {

		if (v.getId() == R.id.buttonNFC) {
			Intent LaunchIntent = getPackageManager()
					.getLaunchIntentForPackage("nfc.tag");
			startActivity(LaunchIntent);
		}
		if (v.getId() == R.id.buttonBarcode) {
			Intent LaunchIntent = getPackageManager()
					.getLaunchIntentForPackage("com.simonmacdonald.scan");
			startActivity(LaunchIntent);
		}

	}
}
