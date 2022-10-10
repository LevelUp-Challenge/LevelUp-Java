package View;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class GUIMenuPrincipal extends JFrame {

	private Container contentPane;
	private JMenuBar menuBar;
	private JMenu mnArquivo, mnCandidato, mnRecrutador, mnSobre, mnAjuda;
	private JMenuItem miSair, miCadastroCandidato, miEditarInformaçõesCan, miCadastroRecrutador, miEditarInformaçõesRec,
			miVagas, miCadastroVagas, miEditarVagas, miCertificados, miEndereco;
	


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
		miCertificados = new JMenuItem("Certificados");
		miEndereco = new JMenuItem("Endereco Candidato");

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
		mnCandidato.add(miCertificados);
		mnCandidato.add(miEndereco);

		mnRecrutador.add(miCadastroRecrutador);
		mnRecrutador.add(miEditarInformaçõesRec);
		mnRecrutador.add(miCadastroVagas);
		mnRecrutador.add(miEditarVagas);
		mnRecrutador.add(miVagas);
		
		


	}

	private void definirEventos() {
		miCertificados.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GUICertificados gc = new GUICertificados();
				contentPane.removeAll();
				setBounds(0, 0, 650, 550);
				contentPane.add(gc);
				contentPane.validate();
				
				
			}
		});
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
		miEditarInformaçõesCan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GUIFormacao formacao = new GUIFormacao();
				contentPane.removeAll();
				setBounds(0, 0, 800, 700);
				contentPane.add(formacao);

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
		miEditarInformaçõesRec.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GUIEditarRecrutador er = new GUIEditarRecrutador();
				contentPane.removeAll();
				setBounds(0, 0, 1200, 500);
				contentPane.add(er);
				contentPane.validate();

			}
		});
		miEndereco.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GUIEndereco ge = new GUIEndereco();contentPane.removeAll();
				setBounds(0, 0, 500, 700);
				contentPane.add(ge);
				contentPane.validate();
				
			}
		});

	}

	public static void main(String[] args) {
		GUIMenuPrincipal frame = new GUIMenuPrincipal();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
		frame.setVisible(true);

	}

}
