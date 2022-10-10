package ViewTestes;

import javax.swing.JOptionPane;

import Controller.ContatoRecrutadorController;
import Controller.RecrutadorController;

public class ViewContatoRecrutador {

	public static void main(String[] args) {
		ContatoRecrutadorController rc = new ContatoRecrutadorController();
		
		//JOptionPane.showMessageDialog(null, rc.cadastrarContatoRecrutador(1, "Jhonatas", 13456, 11, 55));
		
		//JOptionPane.showMessageDialog(null, rc.alteraContatoRecrutador(1, "luis", 13456, 11, 55));
		
		
		
		JOptionPane.showMessageDialog(null, rc.deletarContatoRecrutador(1));

	

	}

}
