package View;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GUIRecrutador extends JPanel {

	private JLabel lbNomeRecrutador, lbLogin, lbSenha, lbAreaRecrutamento;
	private TextField tfNomeRecrutador, tflogin, tfSenha, tfAreaRecrutamento;

	private JButton btnSalvar, btnCancelar;

	public GUIRecrutador() {
		inicializarComponentes();
		definirEventos();
	}

	public void inicializarComponentes() {
		setBounds(0, 0, 600, 300);
		setLayout(null);

		lbNomeRecrutador = new JLabel("Nome: *");
		lbLogin = new JLabel("Login: *");
		lbSenha = new JLabel("Senha: *");
		lbAreaRecrutamento = new JLabel("Area de recrutamento: *");

		tfNomeRecrutador = new TextField();
		tflogin = new TextField();
		tfSenha = new TextField();
		tfAreaRecrutamento = new TextField();

		btnSalvar = new JButton("Salvar");
		btnCancelar = new JButton("Cancelar");

		add(lbNomeRecrutador);
		add(lbLogin);
		add(lbSenha);
		add(lbAreaRecrutamento);
		add(tfNomeRecrutador);
		add(tflogin);
		add(tfSenha);
		add(tfAreaRecrutamento);
		add(btnSalvar);
		add(btnCancelar);

		lbNomeRecrutador.setBounds(230, 40, 60, 25);
		tfNomeRecrutador.setBounds(230, 70, 300, 25);

		lbLogin.setBounds(230, 110, 60, 25);
		tflogin.setBounds(230, 140, 200, 25);

		lbSenha.setBounds(230, 180, 130, 25);
		tfSenha.setBounds(230, 210, 200, 25);

		lbAreaRecrutamento.setBounds(230, 250, 140, 25);
		tfAreaRecrutamento.setBounds(230, 280, 300, 25);

		btnSalvar.setBounds(230, 320, 130, 30);
		btnCancelar.setBounds(390, 320, 130, 30);

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
