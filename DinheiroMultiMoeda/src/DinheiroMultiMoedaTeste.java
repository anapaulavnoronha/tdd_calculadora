import static org.junit.Assert.*;

import org.junit.Test;


public class DinheiroMultiMoedaTeste {

	@Test
	public void testeDollarMultiplicacao(){
		
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}
	
	@Test
	public void testeFrancMultiplicacao(){
		
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}

	
	@Test
	public void testeEquality(){
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(6).equals(Money.franc(6)));
		
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}

}
