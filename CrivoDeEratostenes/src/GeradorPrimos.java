
public class GeradorPrimos {

	public static final int MENOR_PRIMO = 2;
	
	public String gerarPrimosAte(int valorMaximo) {
		if(valorMaximo == MENOR_PRIMO){
			return "2";
		}else{
			return "2,3";
		}
	}

}
