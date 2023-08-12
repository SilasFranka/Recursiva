package view;

import controller.MenorVetor;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {1,45,96,65,20,50,3,2};
		int tamanho = vetor.length;
		int menor=0;
		
		MenorVetor m = new MenorVetor();
		int res = m.verificaVetor(vetor, tamanho,menor);
		System.out.println(res);
	}

}
