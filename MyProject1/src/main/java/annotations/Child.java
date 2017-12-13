package annotations;

import java.lang.reflect.Method;

import enums.Key;

public class Child extends Parent {
	@Override
	public void wealth() {

	}

	@MyAnnotation(reservationCategory = "Senr", discription = "ancsv", isGenderSpecific = true, maxAge = 50, minAge = 15, owners = {
			"me", "Pavan" })
	public void age() {

	}

	@MyAnnotation(reservationCategory = "Senr", discription = "asdsa", isGenderSpecific = false, maxAge = 15, minAge = 50, owners = {
			"me", "Pavan" }, isPregnant = false)
	public void ageForFlightTravel() {

	}

	public static void main(String[] args) {
		// find what class to be targeted, list out all the methods, find out
		// what annotation to be targeted, find out how many methods has this
		// annotation
		Method[] m = Child.class.getMethods();
		for (int i = 0; i < m.length; i++) {
						MyAnnotation a = null;
			try {
				a = m[i].getAnnotation(MyAnnotation.class);
			} catch (Exception e) {

			}

			if(a!=null){System.out.println(m[i].getName());
				System.out.println(a.discription());
			}
		}

	}
}
