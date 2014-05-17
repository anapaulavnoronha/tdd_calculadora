import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GeradorPrimosTeste {

	GeradorPrimos geradorPrimos;
	
	@Before
	public void setUp() throws Exception{
		geradorPrimos = new GeradorPrimos();
	}
	
	@Test
	public void testeGeradorPrimosAteNumeroDois() {
		
		assertEquals("2", geradorPrimos.gerarPrimosAte(2));
	}
	
	@Test
	public void testeGeradorPrimosAteNumeroTres(){
		
		assertEquals("2,3", geradorPrimos.gerarPrimosAte(3));
	}

}
