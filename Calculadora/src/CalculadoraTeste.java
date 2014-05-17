import static org.junit.Assert.*;

import org.junit.Test;


public class CalculadoraTeste {

	@Test
	public void testeSoma(){
		
		Calculadora calculadora = new Calculadora();
		
		int num1 = 2;
		int num2 = 4;
		
		assertEquals(6, calculadora.soma(num1, num2));
	}

}
