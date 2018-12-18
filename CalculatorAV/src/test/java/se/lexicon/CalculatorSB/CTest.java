package se.lexicon.CalculatorSB;
import org.junit.Assert;
import org.junit.Test;
public class CTest {
	@Test
	public void count_Addition() {
		double n1=4,n2=5.1,expected=9.1;
		
		//"+"
		int op=1;
		
		double actual=App.count(op, n1, n2);
				
		Assert.assertEquals(expected, actual, 0.1);
	}
	@Test
	public void count_Division() {
		double n1=2.5,n2=0,expected=0;
		
		//"/"
		int op=4;
		
		double actual=App.count(op, n1, n2);
				
		Assert.assertEquals(expected, actual, 0.1);
	}
}
