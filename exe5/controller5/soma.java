package controller5;

public class soma {

	public soma() {
		super();
	}
	public double SomaDouble(double n) {
		// para quando n chega a zero
		if (n==0) {
			return 0;
		}
		//quando retorna divide 1 por n retornando
		return  (SomaDouble(n-1)+ (1/(n)));
	}

}
