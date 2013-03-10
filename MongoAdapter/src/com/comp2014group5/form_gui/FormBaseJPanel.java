package com.comp2014group5.form_gui;

import java.awt.TextField;

import javax.swing.JPanel;

public abstract class FormBaseJPanel extends JPanel implements FormPanel {

	private static final long serialVersionUID = -7010492914462781756L;

	protected TextField id;
	protected TextField name;

	public FormBaseJPanel() {
		id = new TextField(8);
		id.setText("ID");
		name = new TextField(12);
		name.setText("Label Names");

		add(id);
		add(name);
	}

}
