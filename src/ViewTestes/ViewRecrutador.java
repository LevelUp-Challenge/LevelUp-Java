package ViewTestes;

import javax.swing.JOptionPane;

import Controller.RecrutadorController;

//funcionando
public class ViewRecrutador {

	public static void main(String[] args) {
		RecrutadorController rc = new RecrutadorController();
		JOptionPane.showMessageDialog(null, rc.cadastrarRecrutador(1, "jhon", "abc", "abc", "abc"));


	}

}
