package ViewTestes;

import javax.swing.JOptionPane;

import Controller.FormacaoController;

public class ViewFormacao {

	public static void main(String[] args) {
		FormacaoController fc = new FormacaoController();
		JOptionPane.showMessageDialog(null, fc.cadastrarFormacao(1, "abcde", "abcde", "abcde", "abcde", "abcde"));
	

	}

}
