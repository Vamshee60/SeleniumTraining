package FileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PlayBack {

	public static void main(String[] args) {
		//Getting data from existing object file: DeSerialistion
		 try {
	         FileInputStream fileIn = new FileInputStream("saveg1.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         GamerSerialisable  g3 = (GamerSerialisable) in.readObject();
	         in.close();
	         fileIn.close();
	         System.out.println(g3.bonusCoins);
	         System.out.println(g3.completion);
	         System.out.println(g3.numberOfcoins);
	         System.out.println(g3.profileName);
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         System.out.println("Gamer class not found");
	         c.printStackTrace();
	         return;
	      }


	}

}
