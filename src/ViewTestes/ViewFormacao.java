package ViewTestes;

import javax.swing.JOptionPane;

import Controller.FormacaoController;

public class ViewFormacao {

	public static void main(String[] args) {
		FormacaoController fc = new FormacaoController();
		
		//JOptionPane.showMessageDialog(null, fc.cadastrarFormacao(2, "abcde", "abcde", "abcde", "abcde", "abcde"));
		
		//JOptionPane.showMessageDialog(null, fc.alterarFormacao(1, "AAAA", "abcde", "abcde", "abcde", "abcde"));
		
		
		//REVISAR DELETAR N FUNCIONA
		JOptionPane.showMessageDialog(null, fc.deletarFormacao(1));

		
		

	

	}

}
