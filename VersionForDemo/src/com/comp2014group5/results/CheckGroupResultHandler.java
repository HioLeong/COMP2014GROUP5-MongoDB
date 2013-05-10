package com.comp2014group5.results;

import java.util.List;

import android.widget.CheckBox;

public class CheckGroupResultHandler implements ResultHandler {

	private String key;
	private List<CheckBox> cg;

	public CheckGroupResultHandler(List<CheckBox> cg) {
		this("", cg);
	}

	public CheckGroupResultHandler(String key, List<CheckBox> cg) {
		this.key = key;
		this.cg = cg;
	}

	@Override
	public ResultEntry getResult() {

		StringBuilder resultBuilder = new StringBuilder();

		for (CheckBox c : cg) {
			resultBuilder.append(c.getText().toString());
			resultBuilder.append(",");
		}

		resultBuilder
				.delete(resultBuilder.length() - 1, resultBuilder.length());

		ResultEntry result = new ResultEntry();
		result.setKey(key);
		result.setValue(resultBuilder.toString());

		return result;
	}

}
