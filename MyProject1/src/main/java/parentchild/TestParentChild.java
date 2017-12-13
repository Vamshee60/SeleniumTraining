package parentchild;

public class TestParentChild {

	public static void main(String[] args) {
	//Child reference=child object
		Child c=new Child();
//Only one object created with the combination of public, protected members of child.Class, parent.Class and Object.Class
	System.out.println(c.name);	
	//System.out.println(c.super().name);
	
	
	//Parent reference=Parent object
	//Parent reference=child object
	parent p=new Child();
	//p.m4(); //though obj created is child we are assigning it to parent reference, hence parent-child  common methods(m1,m3) visible, child's m4 will be hidden temporaryly.where as parent private m2 method is never created.
	//p.m2();
	//Child reference=Parent object this condition never possible
	Child c1=(Child) new parent();
	//Exception in thread "main" java.lang.ClassCastException: parentchild.parent cannot be cast to parentchild.Child
	//at parentchild.TestParentChild.main(TestParentChild.java:19) Above line throws exception because obj created is parent but we are asking a child to hold parent by downcasting parent to child
	
	
	Child c2=new Child();
	parent p1=(parent)c2;
    Child c3=(Child)p1;
	}

}
