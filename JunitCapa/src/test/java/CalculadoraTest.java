import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalculadoraTest {

	@Test
	public void test() {
		Calculadora cal = new Calculadora();
		assertEquals(3, cal.sumar(2,4));
	}
	
	@Test
	public void test1() {
		Calculadora cal = new Calculadora();
		assertEquals(9, cal.mul(3, 3));
	}

}
