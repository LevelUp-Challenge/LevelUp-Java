package View;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GUICertificados extends JPanel {

	private JLabel lbCertificados, lbCursos;
	private TextField tfCertificados, tfCursos;
	private JButton btnSalvar, btnCancelar;
	private JButton btPesquisa, btNovo, btAtualiiza, btApaga, btCancelar, btContatos;

	public GUICertificados() {
		inicializarComponentes();
		definirEventos();

	}

	public void inicializarComponentes() {

		setBounds(0, 0, 120, 200);
		setLayout(null);
		
		btPesquisa = new JButton(new ImageIcon(getClass().getResource("img/search_icon.png")));
		btNovo = new JButton(new ImageIcon(getClass().getResource("img/new_icon.png")));
		btAtualiiza = new JButton(new ImageIcon(getClass().getResource("img/update_icon.png")));
		btApaga = new JButton(new ImageIcon(getClass().getResource("img/delete_icon.png")));
		btCancelar = new JButton(new ImageIcon(getClass().getResource("img/exit_icon.png")));

		lbCertificados = new JLabel("Insira o certificado");
		lbCursos = new JLabel("Insira um curso extra-curricular");

		tfCertificados = new TextField();
		tfCursos = new TextField();

		btnSalvar = new JButton("Salvar");
		btnCancelar = new JButton("Cancelar");

		add(btnCancelar);
		add(btnSalvar);
		add(lbCertificados);
		add(tfCertificados);
		add(lbCursos);
		add(tfCursos);
		
		add(btApaga);
		add(btAtualiiza);
		add(btCancelar);
		add(btNovo);
		add(btPesquisa);


		lbCertificados.setBounds(50, 40, 120, 25);
		tfCertificados.setBounds(50, 70, 300, 25);

		lbCursos.setBounds(50, 110, 200, 25);
		tfCursos.setBounds(50, 140, 200, 25);
		
		btPesquisa.setBounds(50, 200, 60, 40);
		btNovo.setBounds(120, 200, 60, 40);
		btAtualiiza.setBounds(200, 200, 60, 40);
		btApaga.setBounds(270, 200, 60, 40);
		btCancelar.setBounds(340, 200, 60, 40);
		

		//btnSalvar.setBounds(80, 180, 130, 30);
		//btnCancelar.setBounds(80, 180, 130, 30);

	}

	public void definirEventos() {

		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		btnCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

	}

}
