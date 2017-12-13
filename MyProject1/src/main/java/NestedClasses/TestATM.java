package NestedClasses;

import NestedClasses.SBIATMMachine.SBIATMScreen;

public class TestATM {

	public static void main(String Args[]) {
		
		if(SBIATMMachine.WorkingStatus.status()){
			//create ATMMachine object 
		SBIATMMachine m = new SBIATMMachine();
		//Then use the above object to create the ATMScreen
		SBIATMScreen screen=m.new SBIATMScreen();
		}	
		
	}

}
