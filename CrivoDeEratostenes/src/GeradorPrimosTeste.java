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
	public void testarGeradorPrimosAteNumeroCinco() throws ValorMaximoInvalidoException{
		assertEquals("2,3,5", geradorPrimos.gerarPrimosAte(5));
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
	
	@Test
	public void testeInicializacaoListaDeCandidatos(){
		int valorMaximo = 5;
		boolean[] candidatos = geradorPrimos.inicializaListaCandidatos(valorMaximo);
		assertFalse(candidatos[0]);
		assertFalse(candidatos[1]);
		for(int i = geradorPrimos.MENOR_PRIMO; i <= valorMaximo; i++){
			assertTrue(candidatos[i]);
		}
	}


}
















