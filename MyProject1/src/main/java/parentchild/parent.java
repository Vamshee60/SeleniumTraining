package parentchild;

public class parent {

	public String name="Parent name";
	private String sex;
	protected String wealth;
	protected String lastname="Last name";
	
	public void m1(){
		System.out.println("From parent m1");
	}
	private void m2(){
		System.out.println("From parent m2");
	}
	protected void m3(){
		System.out.println("From parent m3");
	}
}
