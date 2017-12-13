package annotations;

import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
@Target(METHOD)
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

	public String reservationCategory();
	public String discription();
	public int maxAge();
	public int minAge();
	public boolean isGenderSpecific();
	public String[]owners();
	public boolean isPregnant()default false;

}
