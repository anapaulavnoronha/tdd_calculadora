import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


public class GeradorPrimosTeste {

	GeradorPrimos geradorPrimos;
	
	@Before
	public void setUp() throws Exception{
		geradorPrimos = new GeradorPrimos();
	}
	
	@Test
	public void testeGeradorPrimosAteNumeroDois() throws ValorMaximoInvalidoException{
		assertEquals("2", geradorPrimos.gerarPrimosAte(2));
	}
	
	@Test
	public void testeGeradorPrimosAteNumeroTres() throws ValorMaximoInvalidoException{
		assertEquals("2,3", geradorPrimos.gerarPrimosAte(3));	
	}
	
	@Test
	public void testarGeradorPrimosAteNumeroQuatro() throws ValorMaximoInvalidoException{
		assertEquals("2,3", geradorPrimos.gerarPrimosAte(4));
	}
	
	@Test
	public void testaValorMaximoInvalido() throws Exception{
		try{
			geradorPrimos.gerarPrimosAte(1);
			fail("Deveria ter lancado ValorMaximoInvalidoException");
		}catch(ValorMaximoInvalidoException e){
			assertTrue(true);
		}
	}


}
