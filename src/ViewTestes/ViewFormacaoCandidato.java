package ViewTestes;

import javax.swing.JOptionPane;

import Controller.FormacaoCandidatoController;

public class ViewFormacaoCandidato {

	public static void main(String[] args) {
		FormacaoCandidatoController fcc = new FormacaoCandidatoController();
		JOptionPane.showMessageDialog(null, fcc.cadastrarFormacaoCandidato(1, "abc", "abc"));
		
		
		

	}

}
