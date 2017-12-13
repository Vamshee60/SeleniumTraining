package Assignments;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReverseDate {

	public static void main(String[] args) {
		Date myDate = new Date();
		System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(myDate));
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(myDate));
	}

}
