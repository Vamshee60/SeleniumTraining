package Assessment1;

import java.util.Scanner;

import vamshee.java.arrays.Calculations;

public class Calling {
	int sum=0;int subtract=0;int multiple=0;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("First nmber: ");
		int x=in.nextInt();
		System.out.print("Second nmber: ");
		int y=in.nextInt();
		System.out.print("Third nmber: ");
		int z=in.nextInt();
		System.out.print("Fourth nmber: ");
		int a=in.nextInt();
		Addition add=new Addition();
		Subtraction sub=new Subtraction();
		Multiplication mul=new Multiplication();
		add.add(x,y,z,a);
		sub.add(x, y, z);
		mul.add(x,y);
		in.close();}

	}


