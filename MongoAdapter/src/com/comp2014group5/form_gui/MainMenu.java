package com.comp2014group5.form_gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.comp2014.group5.form_database.FormAccessor;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class MainMenu {

	private final static Dimension DEFAULT_BUTTON_DIMENSION = new Dimension(
			131, 29);

	private JFrame frmFormEditor;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormEditor = new JFrame();
		frmFormEditor.setTitle("Form Editor");
		frmFormEditor.setBounds(100, 100, 321, 300);
		frmFormEditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormEditor.getContentPane().setLayout(
				new FormLayout(new ColumnSpec[] { ColumnSpec.decode("103px"),
						ColumnSpec.decode("120px"),
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						ColumnSpec.decode("131px"), }, new RowSpec[] {
						FormFactory.RELATED_GAP_ROWSPEC,
						RowSpec.decode("29px"),
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC, }));

		JButton btnNewForm = new JButton("New Form");
		btnNewForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new NewFormMenu();
			}
		});
		frmFormEditor.getContentPane().add(btnNewForm, "2, 4, left, top");

		JButton btnExistingForm = new JButton("Existing Form");
		btnExistingForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmFormEditor.getContentPane().add(btnExistingForm, "2, 6, left, top");

		btnNewForm.setPreferredSize(DEFAULT_BUTTON_DIMENSION);
		btnExistingForm.setPreferredSize(DEFAULT_BUTTON_DIMENSION);

	}

}
