package ViewTestes;

import javax.swing.JOptionPane;

import Controller.ProcessoSeletivoController;

public class ViewProcessoSeletivo {

	public static void main(String[] args) {
		ProcessoSeletivoController pc = new ProcessoSeletivoController();
		JOptionPane.showMessageDialog(null, pc.cadastroProcesso(1, "abc", "abc", "abc", 3, "abc", "abc", "abc", "abc", 1, "abc"));

	}

}
