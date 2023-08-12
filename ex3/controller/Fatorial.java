package controller;

public class Fatorial {

	public Fatorial() {
		super();
	}
	public int FatorialED(int numero) {
		if(numero==0) {
			return 1;			
		}
		
		return numero * FatorialED(numero-1);
	}
}
