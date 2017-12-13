package superCalculator;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import enums.Key;

public class Calculator {

	public KeyPad keyPad = new KeyPad();
	public Screen screen = new Screen();
	public static final String brandName = "Casio";
	public final long barcode=0;
	public final String model="A1245789";
	
	public static void main(String[] args) {
		Method[]m= Key.class.getMethods();
		for(int i=0;i<m.length;i++)
System.out.println(m[i].getName());
	}

	
	public class KeyPad implements Math {
		int sum = 0;
		int subtract = 0;
		int division = 0;
		int Multi = 0;
		double Percent = 0;

		public int Add(int x, int y) {
			sum = x + y;
			System.out.println("Total sum of number: " + sum);
			return sum;
		}

		public int Minus(int x, int y) {
			subtract = x - y;
			System.out.println("Sum of two minus one varilable: " + subtract);
			return subtract;
		}

		public int Multiply(int x, int y) {
			Multi = x * y;
			System.out.println("Multiplicity of two variable: " + Multi);
			return Multi;
		}

		public double Divide(int x, int y) {
			if(y==0){
				
			}
			division = x / y;
			System.out.println("Division of two variables: " + division);
			return division;
		}

		public double Percentage(double x, double y) {
			return Percent = (float) (x * 100) / y;
		}

		public void click(KeysEnum key) {
			screen.list.add(key.getSymbol());
            
		}

	}

	public class Screen {
		List list = new ArrayList();

		/**
		 * {@link #betterdisplay()}
		 * 
		 * @return
		 */
		@Deprecated
		public String display() {
			String value = "";
			for (int i = 0; i < list.size(); i++) {
				list.get(i);
				value += list.get(i);
			}
			return value;
		}

		public String betterdisplay() {
			StringBuilder value = new StringBuilder();
			for (int i = 0; i < list.size(); i++) {
				list.get(i);
				value.append(list.get(i));
			}
			return value.toString();
		}
	}

}
