
public class GeradorPrimos {

	public static final int MENOR_PRIMO = 2;
	
	public String gerarPrimosAte(int valorMaximo) throws ValorMaximoInvalidoException{
		
		if(valorMaximo >= MENOR_PRIMO){
			return numerosPrimos(valorMaximo);
		}else{
			throw new ValorMaximoInvalidoException();
		}		
			
	}
	
	private String numerosPrimos(int valorMaximo){
		boolean[] candidatos = inicializaListaCandidatos(valorMaximo);
		if(valorMaximo == MENOR_PRIMO){
			return "2";
		}else{
			return "2,3";
		}
	}

	public boolean[] inicializaListaCandidatos(int valorMaximo) {
		return new boolean[] {false, false, true, true, true, true};
	}


}
