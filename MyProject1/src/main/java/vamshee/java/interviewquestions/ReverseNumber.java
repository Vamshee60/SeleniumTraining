package vamshee.java.interviewquestions;

public class ReverseNumber {
public static int getReminder(int dividend, int divisor){
	int reminder= dividend%divisor;
	return reminder;
}
	public static void main(String[] args) {
		
		
		System.out.println("reminder is \n"+ ReverseNumber.getReminder(10, 3));
//get reminder using % modulus operator 
//iput, output revrse logic.
	}

}
