
public class GeradorPrimos {

	public static final int MENOR_PRIMO = 2;
	
	public String gerarPrimosAte(int valorMaximo) throws ValorMaximoInvalidoException{
		
<<<<<<< HEAD
		if(valorMaximo < MENOR_PRIMO){
			throw new ValorMaximoInvalidoException();
		}
=======
>>>>>>> 958d4d4d3dbd91e34498732ad49618b1d6ccb652
		if(valorMaximo == MENOR_PRIMO){
			return "2";
		}else{
			return "2,3";
		}
	}

}
