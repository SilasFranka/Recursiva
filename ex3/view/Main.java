package view;

import controller.Fatorial;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Fatorial f = new Fatorial();
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero ate 12"));
		
		int res = f.FatorialED(n);
		System.out.println(res);

	}

}
