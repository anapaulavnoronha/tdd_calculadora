import static org.junit.Assert.*;

import org.junit.Test;


public class GeradorPrimosTeste {

	@Test
	public void testeGeradorPrimosAteNumeroDois() {
		
		GeradorPrimos geradorPrimos = new GeradorPrimos();
		assertEquals("2", geradorPrimos.gerarPrimosAte(2));
	
	}

}
