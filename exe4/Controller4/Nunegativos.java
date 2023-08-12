package Controller4;

public class Nunegativos {

	public Nunegativos() {
		super();
	}
	public int Nnegativos(int[]vetor, int n, int negativos) {
	
		if(n==0) {
			return negativos;
		}else {
			if(vetor[n-1]<0) {
				negativos = negativos+1;
			}
		}
	return Nnegativos(vetor,n-1,negativos);
}}
