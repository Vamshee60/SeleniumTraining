package vamshee.java.arrays;

import java.util.Scanner;

public class IsPalindrome {
	public static void main(String[] args) {
	Scanner InputString=new Scanner(System.in);
	System.out.println("DAD");
	String str=InputString.next();
	InputString.close();
	String revString="";
	char[] ch=str.toCharArray();
	
	for(int i=ch.length-1;i>=0;i--){
		revString=revString+ch[i];
	}
	System.out.println(revString);
	if(str.equals(revString)){
		System.out.println(str+"is palindrome");
	}
	}
	
}
