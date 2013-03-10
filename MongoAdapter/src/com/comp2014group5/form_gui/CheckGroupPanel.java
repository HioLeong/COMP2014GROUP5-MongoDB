package com.comp2014group5.form_gui;

import java.awt.TextField;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.comp2013group5.form.model.CheckGroup;
import com.comp2013group5.form.model.FormWidget;

public class CheckGroupPanel extends FormBaseJPanel {

	private static final long serialVersionUID = 562182969239062369L;

	private TextField options;

	public CheckGroupPanel() {
		options = new TextField(20);
		add(options);
	}

	@Override
	public FormWidget getFormWidget() {
		CheckGroup cg = new CheckGroup();
		cg.setId(id.getText());
		cg.setName(name.getText());

		List<String> tokens = new ArrayList<String>();
		StringTokenizer tokenizer = new StringTokenizer(options.getText(), ",");
		while (tokenizer.hasMoreTokens()) {
			tokens.add(tokenizer.nextToken());
		}
		cg.setOptions(tokens);
		return cg;
	}

}
