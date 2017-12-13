package parentchild;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		// Create an Arraylist
		ArrayList myList = new ArrayList();
		// add different types of objects/data types in this list
		myList.add(50);
		myList.add("Krishna");
		myList.add(true);

		Object obj = myList.get(2);
		boolean bool=(Boolean) obj;
		
		
		ArrayList<String> myList2 = new ArrayList<String>();
		// add different types of objects/data types in this list
		//myList2.add(50);
		myList2.add("Krishna");
		//myList2.add(true);

		String str = myList2.get(2);
	
	}

}
