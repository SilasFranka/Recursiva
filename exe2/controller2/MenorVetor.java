package controller2;

public class MenorVetor {

	public MenorVetor() {
		super();
	}
public int verificaVetor(int[]vetor, int tamanho, int menor ) {
		
		// para quando tamanho chega a zero
		if(tamanho==0) {
			return menor;
		} else if (tamanho == vetor.length) {
			menor=vetor[tamanho-1];
			return verificaVetor(vetor, tamanho-1, menor);
		}else {
			if (vetor[tamanho-1]<menor) {
				menor = vetor[tamanho-1];
			}
			// verifica se o vetor está no 1 para uma excessao e depois verifica o menor
			return  verificaVetor( vetor, tamanho-1,menor);
		}
		
		
	}}


