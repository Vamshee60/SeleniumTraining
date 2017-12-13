package parentchild;

public class Child extends parent {

	public String name="Child name";
	private String sex;
	protected String wealth;
	public String hobbies;

	public void m1() {
		System.out.println("From child m1");
	}

	private void m2() {
		System.out.println("From child m2");
	}

	protected void m3() {
		System.out.println("From child m3");

	}

	public void m4() {
		System.out.println("From child m4");
	}
}
