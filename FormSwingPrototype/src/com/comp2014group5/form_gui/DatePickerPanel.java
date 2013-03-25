package com.comp2014group5.form_gui;

import java.awt.TextField;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.comp2013group5.form.model.FormWidget;

public class DatePickerPanel extends FormBaseJPanel {

	private static final long serialVersionUID = 6077339651583772202L;

	private TextField date;

	public DatePickerPanel() {
		date = new TextField(10);

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		date.setText(formatter.format(new Date()));

		add(date);
	}

	@Override
	public FormWidget getFormWidget() {
		return null;
	}

}
