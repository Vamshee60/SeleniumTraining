package vamshee.java.interviewquestions;


	public class ReverseString1 {
		 
	    public int reverseNumber(int number){
	         
	        int reverse = 0;
	        while(number != 0){
	            reverse = (reverse*10)+(number%10);
	            number = number/10;
	        } 
	        return reverse;
	    }
	public static void main(String[] args) {
		ReverseString1 nr = new ReverseString1();
        System.out.println("Output: "+nr.reverseNumber(2012));
		}
	}


