import static org.junit.Assert.*;

import org.junit.Test;


public class DinheiroMultiMoedaTeste {

	@Test
	public void testeMultiplicacao(){
		
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}
	
	@Test
	public void testeEquality(){
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}

}
