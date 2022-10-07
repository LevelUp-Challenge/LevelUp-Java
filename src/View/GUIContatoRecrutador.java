package View;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GUIContatoRecrutador extends JPanel {

	private JLabel lbEmail, lbTelefone, lbDdd, lbDdi;
	private TextField tfEmail, tfTelefone, tfDdd, tfDdi;
	private JButton btnSalvar, btnCancelar;

	public GUIContatoRecrutador() {
		inicializarComponentes();
		definirEventos();

	}

	public void inicializarComponentes() {
		setBounds(0, 0, 600, 300);
		setLayout(null);

		lbEmail = new JLabel("Insira seu Email");
		lbTelefone = new JLabel("Insira seu Telefone");
		lbDdd = new JLabel("Insira seu DDD");
		lbDdi = new JLabel("Insira seu DDI");

		tfEmail = new TextField();
		tfTelefone = new TextField();
		tfDdd = new TextField();
		tfDdi = new TextField();

		btnSalvar = new JButton("Salvar");
		btnCancelar = new JButton("Cancelar");

		add(lbEmail);
		add(lbTelefone);
		add(lbDdd);
		add(lbDdi);

		add(tfEmail);
		add(tfTelefone);
		add(tfDdd);
		add(tfDdi);

		lbEmail.setBounds(230, 40, 60, 25);
		tfEmail.setBounds(230, 70, 300, 25);

		lbTelefone.setBounds(230, 110, 60, 25);
		tfTelefone.setBounds(230, 140, 200, 25);

		lbDdd.setBounds(230, 180, 130, 25);
		tfDdd.setBounds(230, 210, 150, 25);

		lbDdi.setBounds(390, 250, 130, 25);
		tfDdi.setBounds(390, 250, 130, 25);

		btnSalvar.setBounds(230, 320, 130, 30);
		btnCancelar.setBounds(390, 320, 130, 30);

	}

	public void definirEventos() {

		btnCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

	}

}
