package View;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class GUIMenuPrincipal extends JFrame {

	private Container contentPane;
	private JMenuBar menuBar;
	private JMenu mnArquivo, mnCandidato, mnRecrutador, mnSobre, mnAjuda;
	private JMenuItem miSair, miCadastroCandidato, miEditarInformaçõesCan, miCadastroRecrutador, miEditarInformaçõesRec,
			miVagas, miCadastroVagas, miEditarVagas;

	public GUIMenuPrincipal() {
		inicializarComponentes();
		definirEventos();

	}

	private void inicializarComponentes() {
		setTitle("Level-Up Experience System");
		setBounds(0, 0, 800, 600);
		contentPane = getContentPane();

		menuBar = new JMenuBar();
		mnArquivo = new JMenu("Arquivo");
		mnCandidato = new JMenu("Candidato");
		mnRecrutador = new JMenu("Recrutador");
		mnSobre = new JMenu("Sobre");
		mnAjuda = new JMenu("Ajuda");

		miSair = new JMenuItem("Sair");
		miCadastroCandidato = new JMenuItem("Cadastro Candidato");
		miEditarInformaçõesCan = new JMenuItem("Editar Informações");
		miCadastroRecrutador = new JMenuItem("Cadastro Recrutador");
		miVagas = new JMenuItem("Vagas");
		miCadastroVagas = new JMenuItem("Cadastro Vagas");
		miEditarVagas = new JMenuItem("Editar Vagas");
		miEditarInformaçõesRec = new JMenuItem("Editar Informações");

		setJMenuBar(menuBar);
		menuBar.add(mnArquivo);
		menuBar.add(mnCandidato);
		menuBar.add(mnRecrutador);
		menuBar.add(mnSobre);
		menuBar.add(mnAjuda);

		mnArquivo.add(miSair);
		mnCandidato.add(miCadastroCandidato);
		mnCandidato.add(miEditarInformaçõesCan);
		mnCandidato.add(miVagas);

		mnRecrutador.add(miCadastroRecrutador);
		mnRecrutador.add(miEditarInformaçõesRec);
		mnRecrutador.add(miCadastroVagas);
		mnRecrutador.add(miEditarVagas);
		mnRecrutador.add(miVagas);

	}

	private void definirEventos() {
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		miCadastroCandidato.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GUICandidato newCandidato = new GUICandidato();
				contentPane.removeAll();
				setBounds(0, 0, 800, 1000);
				contentPane.add(newCandidato);
				contentPane.validate();

			}
		});
		miCadastroRecrutador.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GUIRecrutador newRecrutador = new GUIRecrutador();
				contentPane.removeAll();
				setBounds(0, 0, 800, 600);
				contentPane.add(newRecrutador);
				contentPane.validate();				

			}
		});

	}

}
