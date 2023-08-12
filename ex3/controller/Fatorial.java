package controller;

public class Fatorial {

	public Fatorial() {
		super();
	}
	public int FatorialED(int numero) {
		// ponto de parada e quando o numero chegar igual a zero
		if(numero==0) {
			return 1;			
		}
		
		return numero * FatorialED(numero-1);
		// todo retorno multiplica ele vezes ele
	}
}
