package View;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import Controller.ProcessoSeletivoController;
import Model.ProcessoSeletivoDAO;

public class GUIListaVagas extends JPanel{
	private JLabel lbTittle, lbVaga, lbdesc, lbarea, lbSalario, lbBeneficios, lbModalidade, lbPcd, lbDesafio, lbInscritos, lbMedia;
	private JButton btFiltrar;
	private String idVaga, nmVaga;
	private JTextPane txtArea;
	
	public GUIListaVagas() {
		inicializarComponentes();
		//definirEventos();
	}
	public void inicializarComponentes() {
		setBounds(0, 0, 800, 800);
		setLayout(null);
		ProcessoSeletivoController psc = new ProcessoSeletivoController();
		String listaVagas = psc.listaTodosArray();
		lbTittle = new JLabel("LISTA DE VAGAS EM DESTAQUE: ");
		btFiltrar = new JButton("Filtros de Vaga");
		JOptionPane.showMessageDialog(null, listaVagas);
		
		
		
//		idVaga = "Id da vaga: " + listaVagas.get(0);
//		nmVaga = "Nome da vaga: "+ listaVagas.get(1);
		//vagas += "Nome da vaga:" + listaVagas.get(1) + "\n";
//		lbdesc.setText(listaVagas.get(2));
//		lbarea.setText(listaVagas.get(3));
//		lbSalario.setText(listaVagas.get(5));
//		lbBeneficios.setText(listaVagas.get(6));
//		lbModalidade.setText(listaVagas.get(7));
//		lbPcd.setText(listaVagas.get(8));
//		lbDesafio.setText(listaVagas.get(9));
//		lbInscritos.setText(listaVagas.get(10));
//		lbMedia.setText(listaVagas.get(11));
		
		
		
//		lbVaga = new JLabel(idVaga);
//		add(btFiltrar);
//		add(lbTittle);
//		add(lbVaga);
//		
//		lbTittle.setBounds(30, 50, 200, 25);
//		btFiltrar.setBounds(30, 90, 150, 25);
//		lbVaga.setBounds(30, 130, 100, 25);
//		lbdesc.setBounds(30, 160, 100, 25);
//		lbarea.setBounds(30, 210, 500, 25); 
//		lbVaga.setBounds(30, 160, 500, 100);
//		lbVaga.setBounds(30, 170, 500, 100);
//		lbVaga.setBounds(30, 180, 500, 100);
//		lbVaga.setBounds(30, 200, 500, 100);
//		lbVaga.setBounds(30, 210, 500, 100);
//		lbVaga.setBounds(30, 220, 500, 100);
//		lbVaga.setBounds(30, 230, 500, 100);
//		lbVaga.setBounds(30, 240, 500, 100);
		
	}
	
	

}
