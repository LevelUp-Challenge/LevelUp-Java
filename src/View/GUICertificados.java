package View;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GUICertificados extends JPanel {

	private JLabel lbCertificados, lbCursos;
	private TextField tfCertificados, tfCursos;

	private JButton btnSalvar, btnCancelar;

	public GUICertificados() {
		inicializarComponentes();
		definirEventos();

	}

	public void inicializarComponentes() {

		setBounds(0, 0, 600, 300);
		setLayout(null);

		lbCertificados = new JLabel("Certificados");
		lbCursos = new JLabel("Cursos");

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

		lbCertificados.setBounds(230, 40, 60, 25);
		tfCertificados.setBounds(230, 70, 300, 25);

		lbCursos.setBounds(230, 110, 60, 25);
		tfCursos.setBounds(230, 140, 200, 25);

		btnSalvar.setBounds(230, 180, 130, 30);
		btnCancelar.setBounds(390, 180, 130, 30);

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
