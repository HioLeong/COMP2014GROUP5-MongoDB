package com.hospital.androidui2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FormListActivity extends ListActivity {

	private SharedPreferences sharedPref;
	private List<String> formList = new ArrayList<String>();
	private String baseUrl = null;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		formList.add("NST Form");
		formList.add("MUST form");
		formList.add("Feedback Form");
		

		FormListArrayAdapter adapter = new FormListArrayAdapter(this,
				R.layout.form_list_row, formList);
		setListAdapter(adapter);
	}

	private String downloadText(String URL) {
		int BUFFER_SIZE = 2000;
		InputStream in = null;
		try {
			in = openHttpConnection(URL);
		} catch (IOException e1) {
			e1.printStackTrace();
			return "";
		}

		InputStreamReader isr = new InputStreamReader(in);
		int charRead;
		String str = "";
		char[] inputBuffer = new char[BUFFER_SIZE];
		try {
			while ((charRead = isr.read(inputBuffer)) > 0) {
				String readString = String
						.copyValueOf(inputBuffer, 0, charRead);
				str += readString;
				inputBuffer = new char[BUFFER_SIZE];
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}

		return str;
	}

	private InputStream openHttpConnection(String urlString) throws IOException {
		InputStream in = null;
		int response = -1;

		URL url = new URL(urlString);
		URLConnection conn = url.openConnection();

		if (!(conn instanceof HttpURLConnection))
			throw new IOException("Not an HTTP connection");

		try {
			HttpURLConnection httpConn = (HttpURLConnection) conn;
			httpConn.setAllowUserInteraction(false);
			httpConn.setInstanceFollowRedirects(true);
			httpConn.setRequestMethod("GET");
			httpConn.connect();

			response = httpConn.getResponseCode();
			if (response == HttpURLConnection.HTTP_OK) {
				in = httpConn.getInputStream();
			}
		} catch (Exception ex) {
			throw new IOException("Error connecting");
		}
		return in;
	}

	public void onClick() {

	}

	private List<String> parse(String s) {
		List<String> list = new ArrayList<String>();
		Toast.makeText(this, s, Toast.LENGTH_LONG).show();
		String listString = s.substring(1, s.length()-1);
		listString = listString.replace(", ", ",");
		StringTokenizer stringTokenizer = new StringTokenizer(listString, ",");
		while (stringTokenizer.hasMoreTokens()) {
			list.add(stringTokenizer.nextToken());
		}
		return list;
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		String selectedValue = (String) getListAdapter().getItem(position);
		Intent intent = new Intent(this, SecondActivity.class);
		intent.putExtra("URLKEY", baseUrl + selectedValue);
		startActivity(intent);

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

			return view;
		}

	}
}
