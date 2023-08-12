package view4;

import javax.swing.JOptionPane;

import Controller4.Nunegativos;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {1 , 2 , -3,-5,-6,6,9,8,5,-6,-5,4};
		int n,negativos = 0;
		Nunegativos N = new Nunegativos();
		n = Integer.parseInt(JOptionPane.showInputDialog("informe o valor para n"));
		
		int res = N.Nnegativos(vetor, n, negativos);
		System.out.println(res);
	}

}
