package com.comp2014group5.results;

import java.util.logging.Level;
import java.util.logging.Logger;

import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioGroupResultHandler implements ResultHandler {

	private final static Logger LOGGER = Logger
			.getLogger(RadioGroupResultHandler.class.getName());

	private String key;
	private RadioGroup rg;

	public RadioGroupResultHandler(RadioGroup rg) {
		this("", rg);
	}

	public RadioGroupResultHandler(String key, RadioGroup rg) {
		this.key = key;
		this.rg = rg;
	}

	@Override
	public ResultEntry getResult() {

		int checkedId = rg.getCheckedRadioButtonId();
		RadioButton checkedRg = (RadioButton) rg.getChildAt(checkedId);

		ResultEntry result = new ResultEntry();
		result.setKey(key);

		if (checkedRg != null) {

			String label = checkedRg.getText().toString();
			if (!getScoreFromString(label).equals("null")) {
				result.setValue(getScoreFromString(checkedRg.getText()
						.toString()));
			} else {
				result.setValue(label);
			}

		} else {
			result.setValue("");
		}

		return result;

	}

	private String getScoreFromString(String label) {
		int start = label.indexOf("(");
		int end = label.indexOf(")");

		String score;

		if ((start != -1) && (end != -1)) {
			score = label.substring(start+1, end);
		} else {
			score = "null";
		}

		return score;
	}

}
