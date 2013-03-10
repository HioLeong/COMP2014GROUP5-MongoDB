package com.comp2014group5.form_gui;

import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.json.JSONException;

import com.comp2013group5.form.model.Form;
import com.comp2013group5.form.model.FormWidget;

public class NewFormMenu {

	private JFrame frame;
	private TextField formNameTextField;

	private List<FormRow> formRows = new LinkedList<FormRow>();

	public NewFormMenu() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		JPanel formNamePanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) formNamePanel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		JPanel contentPanel = new JPanel();
		JPanel submitPanel = new JPanel();

		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(formNamePanel);
		frame.getContentPane().add(contentPanel);
		frame.getContentPane().add(submitPanel);
		frame.setBounds(100, 100, 800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		formNamePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		formNamePanel.add(new JLabel("Form Name: "));
		formNameTextField = new TextField(12);
		formNamePanel.add(formNameTextField);

		contentPanel.setPreferredSize(new Dimension(800, 530));
		contentPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPanel.setLayout(new GridLayout((500 / 35), 0, 0, 0));
		contentPanel.add(getNewRow());

		submitPanel.setPreferredSize(new Dimension(800, 35));
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {

				Form form = new Form();
				for (FormRow panel : formRows) {
					FormWidget formWidget = panel.getFormWidget();
					if (formWidget != null) {
						form.setName(formNameTextField.getText());
						form.addFormWidget(formWidget);
					}
				}
				try {
					submitToDatabase(form);
				} catch (Exception e) {
					System.out.println("Problem submitting to database");
				}

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// Not Implemented
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// Not Implemented
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// Not Implemented
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// Not Implemented
			}

		});

		submitPanel.add(btnSubmit);

	}

	private void submitToDatabase(Form form) {

		form.setName("form");
		try {
			System.out.println(form.toJSONObject().toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private JPanel getNewRow() {
		FormRow formRow = new FormRow();
		formRows.add(formRow);

		System.out.println("Number of rows:" + formRows.size());
		return formRow;
	}

	public class FormRow extends JPanel implements ActionListener {

		private static final long serialVersionUID = 2295818049062212354L;

		private final static String TEXT_FIELD = "Text Field";
		private final static String DATE_PICKER = "Date Picker";
		private final static String RADIO_GROUP = "Radio Group";
		private final static String CHECK_GROUP = "Check Group";

		private FormPanel formPanel = null;

		public FormRow() {

			JComboBox comboBox = getFormWidgetOptionComboBox();
			add(comboBox);

			EditPanel editPanel = new EditPanel();
			add(editPanel);

			TextFieldPanel panel = new TextFieldPanel();
			add(panel);
			formPanel = panel;

			revalidate();

		}

		private JComboBox getFormWidgetOptionComboBox() {

			setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

			FlowLayout flowLayout = (FlowLayout) getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);

			JComboBox comboBox = new JComboBox();
			comboBox.setPreferredSize(new Dimension(120, 29));
			comboBox.addItem(TEXT_FIELD);
			comboBox.addItem(DATE_PICKER);
			comboBox.addItem(RADIO_GROUP);
			comboBox.addItem(CHECK_GROUP);
			comboBox.addActionListener(this);

			return comboBox;
		}

		public FormWidget getFormWidget() {

			if (formPanel != null) {
				return formPanel.getFormWidget();
			} else {
				return null;
			}

		}

		@Override
		public void actionPerformed(ActionEvent action) {



			JComboBox cb = (JComboBox) action.getSource();
			String selected = (String) cb.getSelectedItem();
			System.out.println("Selected "+selected);
			initialisePanel(selected);

		}

		private void initialisePanel(String selected) {
			
			if (formPanel != null) {
				this.remove((JPanel) formPanel);
				formPanel = null;
			}
			
			if (selected.equals(TEXT_FIELD)) {
				TextFieldPanel panel = new TextFieldPanel();
				formPanel = panel;
				add(panel);
			}
			if (selected.equals(DATE_PICKER)) {
				DatePickerPanel panel = new DatePickerPanel();
				formPanel = panel;
				add(panel);
			}
			if (selected.equals(RADIO_GROUP)) {
				RadioGroupPanel panel = new RadioGroupPanel();
				formPanel = panel;
				add(panel);
			}
			if (selected.equals(CHECK_GROUP)) {
				CheckGroupPanel panel = new CheckGroupPanel();
				formPanel = panel;
				add(panel);
			}
			revalidate();
		}

	}

	/**
	 * Panel for Adding and Removing FormRows
	 */
	public class EditPanel extends JPanel implements ActionListener {

		private static final long serialVersionUID = -7720310703604576895L;

		private JButton btnAddWidget;
		private JButton btnRemoveWidget;

		public EditPanel() {

			btnAddWidget = new JButton("Add");
			btnAddWidget.addActionListener(this);

			btnRemoveWidget = new JButton("Remove");
			btnRemoveWidget.addActionListener(this);

			add(btnAddWidget);
			add(btnRemoveWidget);
			revalidate();

		}

		@Override
		public void actionPerformed(ActionEvent action) {
			if (action.getSource() == btnAddWidget) {
				getParent().getParent().add(getNewRow());
				revalidate();
			}

			if (action.getSource() == btnRemoveWidget) {
				Container frame = getParent().getParent();
				Container parent = getParent();
				frame.remove(parent);
				formRows.remove(parent);
				revalidate();
			}

		}

	}

}
