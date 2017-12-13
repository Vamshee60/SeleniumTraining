package Assessment1;

public class child extends parent {
	String firstName="Krishna";
	public static void main(String[] args) {
		child c=new child();
		System.out.println(c.lastName);
		System.out.println(c.wealth);
	c.Job();
			}
	public void Job(){
		super.Job();
		System.out.println("Job1 method");
	}
	

}
