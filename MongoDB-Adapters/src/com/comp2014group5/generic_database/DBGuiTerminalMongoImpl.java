package com.comp2014group5.generic_database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.MongoClient;

public class DBGuiTerminalMongoImpl {

	private MongoClient mongoClient;

	public DBGuiTerminalMongoImpl() {
		try {
			mongoClient = new MongoClient("localhost");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	public void mainMenu() {
		Menu menu = new Menu();
		menu.addMenuItem("Select Existing Database", new InputListener() {

			@Override
			public void onInput() {
				existingDatabaseMenu();
			}

		});

		menu.displayMenu();
		try {
			menu.selectMenuItem(getOption());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void existingDatabaseMenu() {

		Menu menu = new Menu();

		System.out.println("------Existing Database------");
		try {
			List<String> names = mongoClient.getDatabaseNames();
			for (final String name : names) {
				menu.addMenuItem(name, new InputListener() {

					@Override
					public void onInput() {
						System.out.println("Selected " + name);
					}

				});
			}
		} catch (NullPointerException e) {
			System.out.println("No database exists");
		}

		menu.displayMenu();
		try {
			menu.selectMenuItem(getOption());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public int getOption() throws IOException {

		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);

		System.out.print(">> ");
		int input = Integer.valueOf(in.readLine()).intValue() - 1;
		return input;
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
