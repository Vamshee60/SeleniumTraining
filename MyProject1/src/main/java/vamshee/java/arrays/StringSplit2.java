package vamshee.java.arrays;

public class StringSplit2 {

	public static void main(String[] args) {
	String Weekdays="mon,tue,wed,thu,fri,sat,sun";
    String[] Days=Weekdays.split(",");
    for(int i=0;i<Days.length;i++)
    System.out.println(Days[i]);
	}

}
