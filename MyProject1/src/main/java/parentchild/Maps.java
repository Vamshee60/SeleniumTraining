package parentchild;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
	//Create Map
		Map progressReport=new HashMap();
		progressReport.put("Maths", 50);
		progressReport.put("Science", 60);
		progressReport.put("Socials", 70);
		//System.out.println(progressReport.get("Maths"));
		//Get all keys from a map.
		Set keys=progressReport.keySet();
		//Maps have duplicate values but not keys.
		//Key can have null value only once.
		for(Object key:keys){
			System.out.println(progressReport.get(key));
		}
	}

}
