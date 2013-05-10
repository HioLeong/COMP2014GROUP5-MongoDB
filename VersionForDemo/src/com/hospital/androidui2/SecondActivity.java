package com.hospital.androidui2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.comp2014group5.results.CheckGroupResultHandler;
import com.comp2014group5.results.EditTextResultHandler;
import com.comp2014group5.results.RadioGroupResultHandler;
import com.comp2014group5.results.ResultEntry;
import com.comp2014group5.results.ResultHandler;

public class SecondActivity extends Activity {

	private final static Logger LOGGER = Logger.getLogger(SecondActivity.class
			.getName());

	private String URL;
	private JSONArray form;
	private String JSONTEXT;
	private JSONObject jObj = null;
	private JSONObject element = null;
	private List<ResultHandler> resultHandlers = new ArrayList<ResultHandler>();
	private Map<String, String> values = new HashMap<String, String>();

	private static final String TAG_FORMNAME = "name";
	private static final String TAG_FORM = "form";
	private static final String TAG_TXTFIELD = "text-field";
	private static final String TAG_CHECK = "check-box";
	private static final String TAG_RADIO = "radio-group";
	private static final String TAG_DROPLIST = "drop-down-list";
	private static final String TAG_TIME = "time-picker";
	private static final String TAG_DATE = "date-picker";
	private static final String TAG_CALENDAR = "calendar-date-picker";
	private static final String TAG_ID = "id";
	private static final String TAG_NAME = "name";
	private static final String TAG_TYPE = "input-type";
	private static final String TAG_DEFTEXT = "default-text";
	private static final String TAG_OPTIONS = "options";
	private static final String TAG_DEFCHOICE = "default-choice";

	private boolean isDemo = false;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);

		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.second, null);

		ScrollView sv = (ScrollView) v.findViewById(R.id.scrForm);

		LinearLayout ll = new LinearLayout(this);
		ll.setOrientation(LinearLayout.VERTICAL);
		Bundle extras = getIntent().getExtras();

		if (extras != null) {
			URL = extras.getString("URLKEY");
			if (extras.getString("DEMO") != null) {
				if (extras.getString("DEMO").equals("DEMO")) {
					isDemo = true;
				}
			}
		}

		String str;
		try {
			Resources res = getResources();

			InputStream in_s;

			if (isDemo) {
				in_s = res.openRawResource(R.raw.nst_form_demo);
			} else {
				in_s = res.openRawResource(R.raw.nst_form);
			}
			byte[] b = new byte[in_s.available()];
			in_s.read(b);
			str = new String(b);
		} catch (Exception e) {
			str = "";
		}

		JSONTEXT = str;

		try {
			jObj = new JSONObject(JSONTEXT);
		} catch (JSONException e1) {
			e1.printStackTrace();
		}

		try {
			// getting array of elements
			form = jObj.getJSONArray(TAG_FORM);
			String formName = jObj.getString(TAG_FORMNAME);

			setTitle(formName);

			for (int i = 0; i < form.length(); i++) {
				JSONObject c = form.getJSONObject(i);

				if (c.has(TAG_TXTFIELD)) {
					element = c.getJSONObject(TAG_TXTFIELD);
					String id = element.getString(TAG_ID);
					String name = element.getString(TAG_NAME);
					String type = element.getString(TAG_TYPE);
					String defText = element.getString(TAG_DEFTEXT);

					TextView tv = new TextView(this);
					tv.setText(name);
					EditText et = new EditText(this);
					et.setText(defText);
					ll.addView(tv);
					ll.addView(et);

					EditTextResultHandler handler = new EditTextResultHandler(
							id, et);
					resultHandlers.add(handler);

				}

				if (c.has(TAG_CHECK)) {
					element = c.getJSONObject(TAG_CHECK);
					String id = element.getString(TAG_ID);
					String name = element.getString(TAG_NAME);
					JSONArray options = element.getJSONArray(TAG_OPTIONS);

					TextView tv = new TextView(this);
					tv.setText(name);
					ll.addView(tv);

					List<CheckBox> cbs = new ArrayList<CheckBox>();

					for (int j = 0; j < options.length(); j++) {
						CheckBox cb = new CheckBox(this);
						cbs.add(cb);
						cb.setText(options.getString(j));
						ll.addView(cb);
					}

					CheckGroupResultHandler handler = new CheckGroupResultHandler(
							id, cbs);
					resultHandlers.add(handler);

				}

				if (c.has(TAG_RADIO)) {
					element = c.getJSONObject(TAG_RADIO);
					String id = element.getString(TAG_ID);
					String name = element.getString(TAG_NAME);
					JSONArray options = element.getJSONArray(TAG_OPTIONS);

					TextView tv = new TextView(this);
					tv.setText(name);
					ll.addView(tv);
					RadioGroup rg = new RadioGroup(this);

					LOGGER.setLevel(Level.INFO);
					LOGGER.info(id);

					for (int j = 0; j < options.length(); j++) {
						RadioButton rb = new RadioButton(this);
						rb.setId(j);
						rb.setText(options.getString(j));

						LOGGER.info(options.getString(j));

						rg.addView(rb);

					}

					RadioGroupResultHandler handler = new RadioGroupResultHandler(
							id, rg);
					resultHandlers.add(handler);

					ll.addView(rg);
				}
				if (c.has(TAG_DROPLIST)) {

				}
				if (c.has(TAG_TIME)) {

				}
				if (c.has(TAG_DATE)) {

				}
				if (c.has(TAG_CALENDAR)) {

				}

			}

		} catch (JSONException e) {
			e.printStackTrace();
		}

		sv.addView(ll);

		Button submitButton = new Button(this);
		submitButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				JSONObject result;
				try {
					result = SecondActivity.this.getResults();
					SharedPreferences sharedPref = PreferenceManager
							.getDefaultSharedPreferences(SecondActivity.this);
					String rootAddr = sharedPref.getString("root_address", "/");
					URL url = new URL(rootAddr + "patients");
					HttpClient client = new DefaultHttpClient();
					HttpPut putClient = new HttpPut(url.toURI());
					putClient.setEntity(new StringEntity(result.toString()));
					HttpResponse response = client.execute(putClient);

				} catch (JSONException e) {
					LOGGER.setLevel(Level.SEVERE);
					LOGGER.warning("JSON error");
					result = null;
				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (URISyntaxException e) {
					e.printStackTrace();
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				} catch (ClientProtocolException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		submitButton.setText("Submit");
		ll.addView(submitButton);

		setContentView(v);

	}

	private String DownloadText(String URL) {
		int BUFFER_SIZE = 2000;
		InputStream in = null;
		try {
			in = OpenHttpConnection(URL);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return "";
		}

		InputStreamReader isr = new InputStreamReader(in);
		int charRead;
		String str = "";
		char[] inputBuffer = new char[BUFFER_SIZE];
		try {
			while ((charRead = isr.read(inputBuffer)) > 0) {
				// ---convert the chars to a String---
				String readString = String
						.copyValueOf(inputBuffer, 0, charRead);
				str += readString;
				inputBuffer = new char[BUFFER_SIZE];
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
		return str;
	}

	private InputStream OpenHttpConnection(String urlString) throws IOException {
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

	private JSONObject getResults() throws JSONException {
		JSONObject jsonObject = new JSONObject();

		for (ResultHandler handler : resultHandlers) {
			ResultEntry resultEntry = handler.getResult();
			jsonObject.put(resultEntry.getKey(), resultEntry.getValue());
		}

		Toast.makeText(this, jsonObject.toString(), Toast.LENGTH_LONG).show();

		return jsonObject;
	}

}