package ViewTestes;

import javax.swing.JOptionPane;

import Controller.EnderecoController;

public class ViewEndereco {

	public static void main(String[] args) {
		EnderecoController ec = new EnderecoController();
		
		JOptionPane.showMessageDialog(null, ec.cadastroEndereco(1, "abc", "abc", "abc", 3, "abc", "abc", "abc", 2, "abc"));

	}

}
