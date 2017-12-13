package Assignments;

public class ForLoopRecursion {
	public int calculateWitOutRecursion(int number){
		int fac = 0;
		for (fac = number*(number - 1); number>1; number--)
		{
		System.out.println(fac);}
		return fac;
	}

	public static void main(String args[]) {
		ForLoopRecursion facHelper = new ForLoopRecursion();
		int result = facHelper.calculateWitOutRecursion(5);
		System.out.println("Factorial of " + 5 + " is " + result); 
		

	}

}

