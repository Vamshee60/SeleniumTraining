package vamshee.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import vamshee.calculator.Add;

public class TestAdd {
  @Test
  public void testAddTwoPositiveIntegers() {
	  int x=10;
	  int y=5;
	  int zExpected=x+y;
	  Add a=new Add();
	  int z=a.addInt(x, y);
	  Assert.assertEquals(z, zExpected);
	  
  }
  @Test
  public void testAddTwoZeros() {
	  int x=0;
	  int y=0;
	  int zExpected=x+y;
	  Add a=new Add();
	  int z=a.addInt(x, y);
	  Assert.assertEquals(z, zExpected);
  }
  @Test
  public void testAddTwoNegatives() {
	  int x=-10;
	  int y=-5;
	  int zExpected=x+y;
	  Add a=new Add();
	  int z=a.addInt(x, y);
	  Assert.assertEquals(z, zExpected);
  }
  @Test
  public void testAddOnePositiveOneNegative() {
	  int x=10;
	  int y=-5;
	  int zExpected=x+y;
	  Add a=new Add();
	  int z=a.addInt(x, y);
	  Assert.assertEquals(z, zExpected);
 
 }
  @Test(enabled=false)
  public void test() {
	  int x=10;
	  int y=-5;
	  int zExpected=x+y;
	  Add a=new Add();
	  int z=a.addInt(x, y);
	  Assert.assertEquals(z, zExpected);
 
 }
}
