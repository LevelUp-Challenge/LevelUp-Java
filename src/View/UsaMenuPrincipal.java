package View;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class UsaMenuPrincipal {

	public static void main(String[] args) {
		GUIMenuPrincipal frame = new GUIMenuPrincipal();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width)/2, 
				(tela.height - frame.getSize().height)/2);
		frame.setVisible(true);

	}

}
