package Assignments;

public class factorial1 {

	public int calcuate(int n) {
			
		if (n == 0) {
			return 1;
		} else {
			return n * calcuate(n - 1);
		}
	}
	
		
	}


