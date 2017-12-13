package vamshee.java.arrays;

import java.util.Scanner;

public class Calculations {
int sum=0;int subtract=0;int division=0;
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
	Calculations ab=new Calculations();
	ab.add(x,y,z,a);
	ab.add(x, y, z);
	ab.add(x,y);}
	
	public  void add(int x, int y,int z,int a){
		sum=x+y+z+a;	
		System.out.println("Total sum of number: "+sum);
	}
	public void add(int x,int y,int z){
		subtract=(x+y)-z;
		System.out.println("Sum of two minus one varilable: "+subtract);
	}
	public void add(int x,int y){
		division=x/y;
		System.out.println("Division of two variables: "+division);
	}
	
	}


