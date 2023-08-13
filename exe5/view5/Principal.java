package view5;

import javax.swing.JOptionPane;

import controller5.soma;

public class Principal {

	public static void main(String[] args) {
		double n = 0;
		
		soma s = new soma();
		
		n = Integer.parseInt(JOptionPane.showInputDialog("informe um número"));
		
		double res = s.SomaDouble(n);
		
		System.out.println(res);

	}

}
