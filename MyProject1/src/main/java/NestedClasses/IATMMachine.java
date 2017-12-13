package NestedClasses;

public interface IATMMachine {
/**
 * This should be the first method before any operation. 	
 * @param strPin
 */
public void authentication(String strPin);
public void withdrawl(String strAmt);
public void balanceCheck();
public void exit();
}
