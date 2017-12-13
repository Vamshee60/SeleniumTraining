package FileIO;

import java.io.Serializable;

public class GamerSerialisable implements Serializable {
	
	String profileName;
	int numberOfcoins;
	double completion;
	transient int bonusCoins;
	

}
