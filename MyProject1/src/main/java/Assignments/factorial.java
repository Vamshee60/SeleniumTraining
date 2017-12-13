package Assignments;

public class factorial {

	public static int calculate(int n){
		
		if (n == 1) return 1; 
	    return n * calculate(n-1); 
		
	}
	public static void main(String[]args){
		factorial fac=new factorial();
		System.out.println("Factorial of " + 5 + " is " +fac.calculate(5));
	}

}
