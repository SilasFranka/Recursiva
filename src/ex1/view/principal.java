package view;
import javax.swing.JOptionPane;
import controller.somatorio;

public class principal {

	public static void main(String[] args) {
		double vetor[] = {-2,5,2,7,-9,-8};
		int n;
		double soma =0 ;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe at� quantos n�emros ( at� 6"));
		somatorio c = new somatorio();
		
		double res = c.nnaturais(n, vetor,soma);
		System.out.println(res);
		
		
	}

}
