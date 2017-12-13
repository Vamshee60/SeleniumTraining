package Assignments;

import java.util.Arrays;

public class DuplicatesArray {

	public static void main(String[] args) {
		int[] numbers = { 1,2,3,4,4,5,1,6,2,3 };
		Arrays.sort(numbers);

		for(int i = 1; i < numbers.length; i++) {
		    if(numbers[i] == numbers[i - 1]) {
		        System.out.println("Duplicate: " + numbers[i]);

	}
            }}
	}

