package controller1;

public class somatorio {

	public somatorio() {
		super();
	}
	
	public double nnaturais(int n,double[] vetor, double soma) {
			 // para quando n chega a zero
		if (n == 0) {
				
			return soma;
		} else {
			if(vetor[n-1]>=0) {
			soma = soma + vetor[n-1];	
		}
			// faz apenas os calculos dos numeros acima de 0 e retorna soma 	
		return nnaturais(n-1,vetor, soma);
				}
	}	

}
