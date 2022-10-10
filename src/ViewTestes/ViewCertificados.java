package ViewTestes;

import javax.swing.JOptionPane;

import Controller.CertificadosController;

public class ViewCertificados {

	public static void main(String[] args) {
		
		CertificadosController cc = new CertificadosController();
		
		JOptionPane.showMessageDialog(null, cc.cadastrarCertificados(3, "logica programacao", "fiap"));
		
		//JOptionPane.showMessageDialog(null, cc.alterarCertificados(13, "logica algoritmo", "fiap"));
		
		//JOptionPane.showMessageDialog(null, cc.deletarCertificados(1));


	}

}
