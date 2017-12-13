package Assignments;

public class ArraylistPrinter {
	 public void print(ArrayList al){
	        for(int i=0;i<al.size();i++)
	        System.out.println(al.get(i));
	    }
	    public void printUsingForEach(ArrayList al){
	       for(int value:al)
	        System.out.println(value);
	    
	    }
	   public void reverse(ArrayList al){
	        for(int i=al.size();i>=0;i--)
	        System.out.println(arr[i]);
	   }
	    
	    public static void main(String args[]){
	        ArrayListPrinter alp= new ArrayListPrinter();  
	ArrayList al=new ArrayList();

	al.add(1); // adds a new value to array list
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	a1.add(65);
	al.get(5);
	alp.print(al);
	}}


