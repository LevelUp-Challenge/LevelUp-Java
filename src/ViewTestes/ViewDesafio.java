package ViewTestes;

import javax.swing.JOptionPane;

import Controller.DesafioController;

public class ViewDesafio {

	public static void main(String[] args) {
		DesafioController dc = new DesafioController();
		JOptionPane.showMessageDialog(null, dc.cadastroDesafio(1, "abc", 3, "abc", "abc") );

	}

}
