package MobileNestedClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MobUtil {
	
	public List<String> getPin()
	{
		List<String> listLogos=new ArrayList<String>(C:\\Users\\Stallone\\Documents\\GitHub\\SeleniumTraining\\MyProject1\\src\\main\\java\\MobileNestedClasses\\Logos);
		listLogos.exists();
		System.out.println(listLogos.exists());
		try {
			BufferedReader br=new BufferedReader(new FileReader(listLogos));
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
