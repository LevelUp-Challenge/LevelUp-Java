package ViewTestes;

import javax.swing.JOptionPane;

import Controller.CertificadosController;

public class ViewCertificados {

	public static void main(String[] args) {
		
		CertificadosController cc = new CertificadosController();
		
		JOptionPane.showMessageDialog(null, cc.cadastrarCertificados(13, "logica programacao", "fiap"));

	}

}
