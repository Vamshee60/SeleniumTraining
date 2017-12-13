package vamshee.java.interviewquestions;

public class RotatableTriangle {
	final char vertex1='a';
	final char vertex2='b';
	final char vertex3='c';
	char top='a';
	char left='b';
	char right='c';
	 
	public RotatableTriangle(char top, char left, char right) {
		super();
		this.top = top;
		this.left = left;
		this.right = right;

	}
	public RotatableTriangle() {
		// TODO Auto-generated constructor stub
	}
	public void print()
	{
		System.out.println(top);
		System.out.print(left);
		System.out.println(right);
			}
	public void print1(){
		System.out.println(left);
		System.out.print(right);
		System.out.println(top);
	}
	public void print2(){
		System.out.println(right);
		System.out.print(top);
		System.out.println(left);
	}
	public static void main (String [] vamshee)
	{
		RotatableTriangle rt= new RotatableTriangle();
		rt.print();
		rt.print1();
		rt.print2();
	}
}
