package controller5;

public class soma {

	public soma() {
		super();
	}
	public double SomaDouble(double n) {
		
		if (n==0) {
			return 0;
		}
		
		return  (SomaDouble(n-1)+ (1/(n)));
	}

}
