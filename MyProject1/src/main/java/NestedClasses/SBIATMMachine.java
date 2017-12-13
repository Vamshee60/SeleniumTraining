package NestedClasses;

import java.util.Scanner;

public class SBIATMMachine implements IATMMachine {

	public void authentication(String strPin) {
		
		// validate pin
		ATMUtil atmUtil = new ATMUtil();
		if (atmUtil.getPin().contains(strPin)) {
			// Welcome
			System.out.println("Welcome AccountHolder");
		} else {
			// or Reject
			System.out.println("Invalid Pin, Please Retry");
		}

	}

	public void withdrawl(String strAmt) {
		// Convert string amount to integer amount
		int amount = 0;
		try {
			amount = Integer.parseInt(strAmt);
		} catch (NumberFormatException nfe) {
			System.out.println("Please Enter Valid Amount");
		}
		if (amount > 0) {
			System.out.println("withDrawl Successful");
		} else {
			System.out.println("Please Enter Valid Amount");
		}
	}

	public void balanceCheck() {
		// TODO Auto-generated method stub

	}

	public void exit() {
		// TODO Auto-generated method stub

	}
	/**
	 * Nesting class screen inside ATM class because it makes sense to ask machine first and then screen.
	 * @author Stallone
	 *
	 */
	public class SBIATMScreen {

		public void display(){
			SBIATMMachine m = new SBIATMMachine();
			// Ask for pin
			System.out.println("Enter pin: ");
			Scanner sc = new Scanner(System.in);
			String userPinInput = sc.nextLine();
			m.authentication(userPinInput);
			
			//ask for amount
			System.out.println("Enter Amount: ");
			String userAmtInput = sc.nextLine();
			m.withdrawl(userAmtInput);
			
			//exit
			m.exit();
		}

	}
	
	public static class WorkingStatus{
		
		public static boolean status(){
			return true;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
