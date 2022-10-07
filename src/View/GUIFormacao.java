package View;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GUIFormacao extends JPanel {

	private JLabel lbGrauFormacao, lbNmFormacao, lbInstituicao, lbDataI, lbDataC, lbTipoFormacao, lbStatusFormacao;
	private TextField tfGrauFormacao, tfNmFormacao, tfInstituicao, tfDataI, tfDataC, tfTipoFormacao, tfStatusFormacao;

	private JButton btnSalvar, btnCancelar;

	public GUIFormacao() {
		inicializarComponentes();
		definirEventos();

	}

	public void inicializarComponentes() {
		setBounds(0, 0, 600, 300);
		setLayout(null);

		lbGrauFormacao = new JLabel("Grau de formação:");
		lbNmFormacao = new JLabel("Nome Formação:");
		lbInstituicao = new JLabel("Instituição:");
		lbDataI = new JLabel("Data de inicio");
		lbDataC = new JLabel("Data de termino");
		lbTipoFormacao = new JLabel("Tipo de formação");
		lbStatusFormacao = new JLabel("Status atual:");

		tfGrauFormacao = new TextField();
		tfNmFormacao = new TextField();
		tfInstituicao = new TextField();
		tfDataI = new TextField();
		tfDataC = new TextField();
		tfTipoFormacao = new TextField();
		tfStatusFormacao = new TextField();

		btnSalvar = new JButton("Salvar");
		btnCancelar = new JButton("Cancelar");

		add(lbGrauFormacao);
		add(lbNmFormacao);
		add(lbInstituicao);
		add(lbDataI);
		add(lbDataC);
		add(lbTipoFormacao);
		add(lbStatusFormacao);
		add(tfGrauFormacao);
		add(tfNmFormacao);
		add(tfInstituicao);
		add(tfDataI);
		add(tfDataC);
		add(tfTipoFormacao);
		add(tfStatusFormacao);

		lbNmFormacao.setBounds(230, 40, 130, 25);
		tfNmFormacao.setBounds(230, 70, 300, 25);

		lbGrauFormacao.setBounds(230, 110, 130, 25);
		tfGrauFormacao.setBounds(230, 140, 250, 25);

		lbInstituicao.setBounds(230, 180, 130, 25);
		tfInstituicao.setBounds(230, 210, 250, 25);

		lbDataI.setBounds(230, 250, 130, 25);
		tfDataI.setBounds(230, 280, 130, 25);

		lbDataC.setBounds(390, 250, 130, 25);
		tfDataC.setBounds(390, 280, 130, 25);

		lbInstituicao.setBounds(230, 290, 130, 25);
		tfInstituicao.setBounds(230, 320, 250, 25);

		lbTipoFormacao.setBounds(230, 360, 130, 25);
		tfTipoFormacao.setBounds(230, 390, 250, 25);

		lbStatusFormacao.setBounds(230, 430, 130, 25);
		tfStatusFormacao.setBounds(230, 460, 130, 25); // alterar posteriormente

		btnSalvar.setBounds(230, 400, 130, 30);
		btnCancelar.setBounds(390, 400, 130, 30);

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
