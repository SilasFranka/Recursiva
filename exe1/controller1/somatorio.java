package controller1;

public class somatorio {

	public somatorio() {
		super();
	}
	
	public double nnaturais(int n,double[] vetor, double soma) {
			 
		if (n == 0) {
				
			return soma;
		} else {
			if(vetor[n-1]>=0) {
			soma = soma + vetor[n-1];	
		}
				
		return nnaturais(n-1,vetor, soma);
				}
	}	

}
