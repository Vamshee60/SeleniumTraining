package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		File file = new File("Test.txt");
//writes to the file
		try {
			PrintWriter output = new PrintWriter(file);
			output.println("Vamshee");
			output.println(30);
			output.close();
		} catch (IOException ex) {
			System.out.printf("Error: %s\n", ex);
		}
		//write to the file
try{
	Scanner input=new Scanner(file);
	String name=input.nextLine();
	int age=input.nextInt();
	System.out.printf("Name: %s Age: %d\n" , name,age);
}
catch(FileNotFoundException ex){
	System.out.printf("Error: %s\n", ex);
}
	}

}
