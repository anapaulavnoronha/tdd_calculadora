import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculadoraTeste {

	private Calculadora calculadora;
	
	@Before
	public void setUp() throws Exception {
		calculadora = new Calculadora();
	}
	
	@Test
	public void testeSoma(){
		
		int num1 = 2;
		int num2 = 4;
		
		assertEquals(6, calculadora.soma(num1, num2));
	}
	
	@Test
	public void testSubtracao(){

		int num1 = 6;
		int num2 = 4;
		
		assertEquals(2, calculadora.subtracao(num1, num2));
	}

}
