package controller;

public class MenorVetor {

	public MenorVetor() {
		super();
	}
	
	public int verificaVetor(int[]vetor, int tamanho, int menor ) {
		
		
		if(tamanho==0) {
			return menor;
		} else if (tamanho == vetor.length) {
			menor=vetor[tamanho-1];
			return verificaVetor(vetor, tamanho-1, menor);
		}else {
			if (vetor[tamanho-1]<menor) {
				menor = vetor[tamanho-1];
			}
			
			return  verificaVetor( vetor, tamanho-1,menor);
		}
		
		
	}}


