package com.comp2014group5.generic_database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.comp2013group5.form.model.Form;
import com.comp2014.group5.form_database.FormAccessor;
import com.mongodb.MongoClient;

public class FormAccessorTerminal {

	private FormAccessor formAccessor;
	private Form form = new Form();

	public FormAccessorTerminal() {
		try {
			MongoClient mongoClient = new MongoClient("localhost");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	public void mainMenu() {
		Menu menu = new Menu();
		menu.addMenuItem("Add New Form", new InputListener() {

			@Override
			public void onInput() {
				newFormMenu();
			}

		});
		menu.addMenuItem("Get Existing Forms", new InputListener() {

			@Override
			public void onInput() {
				existingFormMenu();
			}

		});

		menu.displayMenu();
		try {
			menu.selectMenuItem(getOption());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void existingFormMenu() {

		Menu menu = new Menu();
		System.out.println("Existing Forms:");
		for (String formName : formAccessor.getFormNames()) {
			menu.addMenuItem(formName, null);
		}

		menu.displayMenu();
	}

	public void newFormMenu() {
		Menu menu = new Menu();
		menu.addMenuItem("New Widget", new InputListener() {

			@Override
			public void onInput() {
				newWidgetForm();
			}

		});
	}

	private void newWidgetForm() {
		Menu menu = new Menu();
		menu.addMenuItem("Text Field", new InputListener() {

			@Override
			public void onInput() {
				addTextFieldMenu();
				return;
			}

		});
	}

	private void addTextFieldMenu() {
		try {
			String id = getInput("ID");
			String name = getInput("Name");
			String defaultText = getInput("Default Text");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			newWidgetForm();
		}
	}

	public int getOption() throws IOException {

		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);

		System.out.print(">> ");
		int input = Integer.valueOf(in.readLine()).intValue() - 1;
		return input;
	}

	public String getInput(String message) throws IOException {

		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);

		System.out.print(message + ": ");
		return in.readLine();
	}

	private class Menu {

		private List<MenuItem> menuItems = new ArrayList<MenuItem>();

		public void addMenuItem(String name, InputListener action) {
			MenuItem menuItem = new MenuItem();
			menuItem.setName(name);
			menuItem.setAction(action);
			menuItems.add(menuItem);
		}

		public void selectMenuItem(int index) {
			try {
				MenuItem selectedItem = menuItems.get(index);
				selectedItem.getAction().onInput();
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Invalid option. Please try again.");
			}
		}

		public void displayMenu() {
			int index = 1;
			for (MenuItem menuItem : menuItems) {
				System.out.println(String.valueOf(index++) + ". "
						+ menuItem.getName());
			}
		}

	}

	public static interface InputListener {

		public abstract void onInput();

	}

	private class MenuItem {
		private String name;
		private InputListener inputListener;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public InputListener getAction() {
			return inputListener;
		}

		public void setAction(InputListener action) {
			this.inputListener = action;
		}

	}

}
