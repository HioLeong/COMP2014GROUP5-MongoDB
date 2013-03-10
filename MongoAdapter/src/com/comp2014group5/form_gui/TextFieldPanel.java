package com.comp2014group5.form_gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JComboBox;

import com.comp2013group5.form.model.FormWidget;

public class TextFieldPanel extends FormBaseJPanel {

	private static final long serialVersionUID = -852635761038375420L;

	private JComboBox typeOptions;
	private TextField defaultText;

	public TextFieldPanel() {
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);

		id.setText("ID");
		name.setText("Name");
		typeOptions = new JComboBox(getTypeOptions());
		typeOptions.setPreferredSize(new Dimension(100, 29));
		defaultText = new TextField(12);
		defaultText.setText("Default Text");

		add(typeOptions);
		add(defaultText);
	}

	private String[] getTypeOptions() {
		String[] typeArray = new String[] { "Text", "Integers", "Email",
				"Phone Number" };
		return typeArray;
	}

	@Override
	public FormWidget getFormWidget() {

		// TODO: Sort out class conflict
		com.comp2013group5.form.model.TextField textField = new com.comp2013group5.form.model.TextField();
		textField.setId(id.getText());
		textField.setName(name.getText());
		switch (typeOptions.getSelectedIndex()) {
		case 0:
			textField.setInputType("text");
			break;
		case 1:
			textField.setInputType("number");
			break;
		case 2:
			textField.setInputType("email");
			break;
		case 3:
			textField.setInputType("phone");
			break;
		default:
			textField.setInputType("text");
			break;
		}
		textField.setDefaultText(defaultText.getText());

		return textField;
	}

}
