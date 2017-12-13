package MobileNestedClasses;


public class TestCalling {

	public static void main(String Args[]) {
		
		if(Samsung.WorkingStatus.status()){
			//create IAndroid object 
			Samsung m = new Samsung();
		//Then use the above object to create the MobileScreen
			TestCalling screen=m.new TestCalling();
		}	
		
	}

}
