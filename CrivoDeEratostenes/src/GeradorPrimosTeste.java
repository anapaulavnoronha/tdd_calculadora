import static org.junit.Assert.*;

import org.junit.Test;


public class GeradorPrimosTeste {

	@Test
	public void testeGeradorPrimosAteNumeroDois() {
		
		GeradorPrimos geradorPrimos = new GeradorPrimos();
		assertEquals("2", geradorPrimos.gerarPrimosAte(2));
	
	}
	
	@Test
	public void testeGeradorPrimosAteNumeroTres(){
		
		GeradorPrimos geradorPrimos = new GeradorPrimos();
		assertEquals("2,3", geradorPrimos.gerarPrimosAte(3));
	}

}
