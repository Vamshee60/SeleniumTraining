package vamshee.java.arrays;

public class StringReverse1 {
	public void usingForLoopInIfElse(String input)

	{System.out.println("inside method \"usingForLoopInIfElse\"\n");
		if (input == null) {
			// If input is null then printout the value as null.
		} else {

			for (int i = input.length() - 1; i >= 0; i--) {
				System.out.print(input.charAt(i));

			}
			System.out.println("\n");
		}
		// below using try catch block


	}
public void usingForLoopInTryCatch(String input) throws Exception
{
	System.out.println("inside method \"usingForLoopInTryCatch\"\n");
	try {
		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}System.out.println("\n");
	} catch (NullPointerException npe) {
		System.out.println("NullPointerException");
		//throw npe;
		//throw new MyException();
		throw new MyException(npe);
	}
}
	public static void main(String[] args) {
		StringReverse1 SR = new StringReverse1();sdasd
		SR.usingForLoopInTryCatch(null);
		SR.usingForLoopInIfElse(args[1]);
	}
}
