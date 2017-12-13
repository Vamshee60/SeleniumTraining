package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputOutput {

	public static void main(String[] args) {
		File marksFile = new File(
				"C:\\Users\\..\\Users\\Stallone\\Documents\\GitHub\\SeleniumTraining\\MyProject1\\src\\main\\java\\FileIO\\Marks.txt");
		marksFile.exists();
		System.out.println(marksFile.exists());
		try {
			BufferedReader br=new BufferedReader(new FileReader(marksFile));
			String line=br.readLine();
			System.out.println(line);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}
