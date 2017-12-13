package FileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Play {
	public static void main(String[] args) {
//		Gamer g1=new Gamer();
//		Gamer g2=new Gamer();
//		g1.profileName="Pavan";
//		g1.numberOfcoins=20;
//		g1.completion=31.5;
//		
//		g2.profileName="Vamshee";
//		g2.numberOfcoins=30;
//		g2.completion=20.5;
//		String parentPath="C:\\Users\\..\\Users\\Stallone\\Documents\\GitHub\\SeleniumTraining\\MyProject1\\src\\main\\java\\FileIO\\";
//		//File saveg1=new File(parentPath+"saveg1.txt");
//				try {
//			//saveg1.createNewFile();
//			BufferedWriter bw=new BufferedWriter(new FileWriter(parentPath+"saveg1.txt"));
//		bw.write(String.valueOf(g1.profileName+"\n"));
//				bw.append(String.valueOf(g1.numberOfcoins+"\n"));
//				bw.append(String.valueOf(g1.completion));
//				bw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	GamerSerialisable g1=new GamerSerialisable();
	GamerSerialisable g2=new GamerSerialisable();
	g1.profileName="Pavan";
	g1.numberOfcoins=20;
	g1.completion=31.5;
	g1.bonusCoins=100;
	g2.profileName="Vamshee";
	g2.numberOfcoins=30;
	g2.completion=20.5;
	g2.bonusCoins=150;
	String parentPath="C:\\Users\\..\\Users\\Stallone\\Documents\\GitHub\\SeleniumTraining\\MyProject1\\src\\main\\java\\FileIO\\";
	//File saveg1=new File(parentPath+"saveg1.txt");
			try {FileOutputStream fileOut =
			         new FileOutputStream("saveg1.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(g1);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");
			} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			System.exit(0);
	}
}
