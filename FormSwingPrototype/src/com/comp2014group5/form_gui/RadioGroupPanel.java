package com.comp2014group5.form_gui;

import java.awt.TextField;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.comp2013group5.form.model.FormWidget;
import com.comp2013group5.form.model.RadioGroup;

public class RadioGroupPanel extends FormBaseJPanel {

	private static final long serialVersionUID = -7470410263752517374L;

	private TextField options;

	public RadioGroupPanel() {
		options = new TextField(20);

		add(options);
	}

	@Override
	public FormWidget getFormWidget() {

		RadioGroup radioGroup = new RadioGroup();
		radioGroup.setId(id.getText());
		radioGroup.setName(name.getText());

		List<String> tokens = new ArrayList<String>();
		StringTokenizer tokenizer = new StringTokenizer(options.getText(), ",");
		while (tokenizer.hasMoreTokens()) {
			tokens.add(tokenizer.nextToken());
		}
		radioGroup.setOptions(tokens);

		return radioGroup;
	}

}
