package MobileNestedClasses;

import java.util.Scanner;

public class Samsung implements IAndroid {

	public void welcomeLogo(String strPin) {
		
		// validate pin
		MobUtil mobUtil = new MobUtil();
		if (mobUtil.getPin().contains(strPin)) {
			// Welcome
			System.out.println("Welcome User");
		} else {
			// or Reject
			System.out.println("Restart mobile");
		}

	}

	public void swtichOn(String strAmt) {

	}

	public void balanceCheck() {
		// TODO Auto-generated method stub

	}

	public void exit() {
		// TODO Auto-generated method stub

	}
	
	public class MobileScreen {

		public void display(){
			Samsung m = new Samsung();
			System.out.println("Welcome Logo: ");
			Scanner sc = new Scanner(System.in);
			String userPinInput = sc.nextLine();
			m.welcomeLogo(userPinInput);
			
		
			m.exit();
		}

	}
	
	public static class WorkingStatus{
		
		public static boolean status(){
			return true;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public void call() {
		// TODO Auto-generated method stub
		
	}

	public void switchOn() {
		// TODO Auto-generated method stub
		
	}

	public void switchOff() {
		// TODO Auto-generated method stub
		
	}

}
