package com.comp2014group5.form_gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

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
