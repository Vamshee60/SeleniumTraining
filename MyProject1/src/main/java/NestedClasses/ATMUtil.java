package NestedClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ATMUtil {

	public List<String> getPin() {
		File db = new File(
				"C:\\Users\\Stallone\\Documents\\GitHub\\SeleniumTraining\\MyProject1\\src\\main\\java\\NestedClasses\\pin.db");
		List<String> listPins = new ArrayList<String>();
		db.exists();
		System.out.println(db.exists());
		try {
			BufferedReader br = new BufferedReader(new FileReader(db));
			String line = "";
			while (line != null) {
				line=br.readLine();
				listPins.add(line);
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		// listPins.add("1234");//bring data from pin.db
		// listPins.add("4563");
		// listPins.add("7854");
		return listPins;

	}

	public static void main(String[] args) {
		ATMUtil atmUtil = new ATMUtil();
		atmUtil.getPin();
	}
}
