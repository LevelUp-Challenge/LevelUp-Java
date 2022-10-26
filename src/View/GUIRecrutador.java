package View;

import java.awt.ScrollPane;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Controller.RecrutadorController;

@SuppressWarnings("serial")
public class GUIRecrutador extends JPanel {

	private JLabel lbNomeRecrutador, lbLogin, lbSenha, lbAreaRecrutamento;
	private TextField tfNomeRecrutador, tflogin, tfSenha, tfAreaRecrutamento;
	private JRadioButton rbTi, rbRh, rbInfra, rbBanco;
	private ButtonGroup buttonGroup;
	private ImageIcon imagem1;
	private JLabel lbImagem;



	private JButton btnSalvar, btnCancelar;

	public GUIRecrutador() {
		inicializarComponentes();
		definirEventos();
	}

	public void inicializarComponentes() {
		setBounds(0, 0, 600, 300);
		setLayout(null);
		String[] fotos =  new String[4];
		for (int i = 0; i < fotos.length; i++) {
			fotos[i] = "foto" + (i+1);
			
		}

		
		lbImagem = new JLabel(imagem1);
		imagem1 = new ImageIcon();
		rbBanco = new JRadioButton("Banco de dados");
		rbInfra = new JRadioButton("Infra-Estrutura");
		rbRh = new JRadioButton("Departamento Rh");
		rbTi = new JRadioButton("Tecnologia");
		
		buttonGroup = new ButtonGroup();
		buttonGroup.add(rbBanco);
		buttonGroup.add(rbInfra);
		buttonGroup.add(rbRh);
		buttonGroup.add(rbTi);
		
		add(rbBanco);
		add(rbInfra);
		add(rbRh);
		add(rbTi);

		
		

		lbNomeRecrutador = new JLabel("Nome: *");
		lbLogin = new JLabel("Login: *");
		lbSenha = new JLabel("Senha: *");
		lbAreaRecrutamento = new JLabel("Area de recrutamento: *");

		tfNomeRecrutador = new TextField();
		tflogin = new TextField();
		tfSenha = new TextField();

		btnSalvar = new JButton("Salvar");
		btnCancelar = new JButton("Cancelar");

		add(lbNomeRecrutador);
		add(lbLogin);
		add(lbSenha);
		add(lbAreaRecrutamento);
		add(tfNomeRecrutador);
		add(tflogin);
		add(tfSenha);
		add(btnSalvar);
		add(btnCancelar);
		add(lbImagem);

		lbNomeRecrutador.setBounds(50, 40, 60, 25);
		tfNomeRecrutador.setBounds(50, 70, 300, 25);

		lbLogin.setBounds(50, 110, 60, 25);
		tflogin.setBounds(50, 140, 200, 25);

		lbSenha.setBounds(50, 180, 130, 25);
		tfSenha.setBounds(50, 210, 200, 25);

		lbAreaRecrutamento.setBounds(50, 250, 140, 25);
		rbBanco.setBounds(50, 270, 150, 25);
		rbInfra.setBounds(50, 300, 150, 25  );
		rbRh.setBounds(50, 330, 150, 25);
		rbTi.setBounds(50, 360, 150, 25);
		lbImagem.setBounds(450, 100, 200, 200);

		btnSalvar.setBounds(50, 420, 130, 30);
		btnCancelar.setBounds(250, 420, 130, 30);

	}

	public void definirEventos() {
		rbTi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				imagem1 = new ImageIcon(getClass().getResource("perfis/foto1.png"));
				lbImagem.setIcon(imagem1);
				
				
			}
		});
		rbBanco.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				imagem1 = new ImageIcon(getClass().getResource("perfis/foto4.png"));
				lbImagem.setIcon(imagem1);
				
			}
		});
		rbInfra.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				imagem1 = new ImageIcon(getClass().getResource("perfis/foto3.png"));
				lbImagem.setIcon(imagem1);
				
			}
		});
		rbTi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				imagem1 = new ImageIcon(getClass().getResource("perfis/foto2.png"));
				lbImagem.setIcon(imagem1);				
			}
		});
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lbImagem.setIcon(imagem1);
				String nome = tfNomeRecrutador.getText();
				String login = tflogin.getText();
				String senha = tfSenha.getText();
				String AreaRecrutamento = "";

				if (rbBanco.isSelected()) {

					AreaRecrutamento = "Gestor banco de dados";
					
					
				} else if (rbInfra.isSelected()) {

					AreaRecrutamento = "Chefe de Infra-Estrutura";


				} else if (rbTi.isSelected()) {
					AreaRecrutamento = "Tecnologia da informacao";
				} else {
					AreaRecrutamento = "Chefe de RH";

				}
				String areaRec = AreaRecrutamento;
					
				
				
				if (nome.equals("") || login.equals("") || senha.equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
					
				} else {
					RecrutadorController r = new RecrutadorController();
					JOptionPane.showMessageDialog(null, r.cadastrarRecrutador(nome, login, senha, areaRec));

				}
						
					
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
