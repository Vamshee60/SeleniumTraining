package vamshee.java.arrays;

public class Array {

	public void fillArrayUsingWhile(int[] inputArray) {
		int last = inputArray.length;
		int myposition = 0;
		while (myposition < last) {
			inputArray[myposition] = myposition;
			myposition++;
			System.out.println(myposition);
		}
	}

	public static void main(String[] args) {

		int[] array = new int[5];
		int[] arrayWithValues = { 1, 2 };

		// Fillup array with its index values.
		int k = 0;
		while (k < 5) {
			array[k] = k;
			k++;
/*// PRINT OUT THE VALUES OF AN INTEGER ARRAY
			WRITE SAME METHOD USING FOR LOOP
			FORM STRING ARRAY AND JOIN ALL THE STRINGS AND PRINT OUT
			ARRAY Inte*/
	}
	}}
