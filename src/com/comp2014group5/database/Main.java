package com.comp2014group5.database;

import com.comp2014group5.generic_database.DBGuiTerminalMongoImpl;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DBGuiTerminalMongoImpl dbGui = new DBGuiTerminalMongoImpl();
		while (true) {
			dbGui.mainMenu();
		}
	}

}
