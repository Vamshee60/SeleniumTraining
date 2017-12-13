package superCalculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

	@Test
	public void testDisplay() {
		Calculator ca = new Calculator();
		ca.keyPad.click(KeysEnum.One);
		ca.keyPad.click(KeysEnum.Plus);
		ca.keyPad.click(KeysEnum.Two);
		String expected = "1+2";
		String actual = ca.screen.betterdisplay();
		Assert.assertEquals(actual, expected);
	}

}
