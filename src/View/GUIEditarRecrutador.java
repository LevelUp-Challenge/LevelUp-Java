package View;

import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Controller.ContatoRecrutadorController;
import Controller.RecrutadorController;

public class GUIEditarRecrutador extends JPanel {

	private JLabel lbEmail, lbTelefone, lbDdd, lbDdi;
	private TextField tfEmail, tfTelefone, tfDdd, tfDdi;
	private JButton btPesquisa, btNovo, btAtualiiza, btApaga, btCancelar, btAdd;

	private JLabel lbNomeRecrutador, lbLogin, lbSenha, lbAreaRecrutamento;
	private TextField tfNomeRecrutador, tflogin, tfSenha, tfAreaRecrutamento;
	private JRadioButton rbTi, rbRh, rbInfra, rbBanco;
	private ButtonGroup buttonGroup;
	private ImageIcon imagem1;
	private JLabel lbImagem;

	public GUIEditarRecrutador() {
		inicializarComponentes();
		definirEventos();

	}

	public void inicializarComponentes() {
		setBounds(0, 0, 1000, 400);
		setLayout(null);

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
		lbEmail = new JLabel("Insira seu Email");
		lbTelefone = new JLabel("Insira seu Telefone");
		lbDdd = new JLabel("Insira seu DDD");
		lbDdi = new JLabel("Insira seu DDI");
		lbNomeRecrutador = new JLabel("Nome: *");
		lbLogin = new JLabel("Login: *");
		lbSenha = new JLabel("Senha: *");
		lbAreaRecrutamento = new JLabel("Area de recrutamento: *");
		tfNomeRecrutador = new TextField();
		tflogin = new TextField();
		tfSenha = new TextField();
		btPesquisa = new JButton(new ImageIcon(getClass().getResource("img/search_icon.png")));
		btNovo = new JButton(new ImageIcon(getClass().getResource("img/new_icon.png")));
		btAtualiiza = new JButton(new ImageIcon(getClass().getResource("img/update_icon.png")));
		btApaga = new JButton(new ImageIcon(getClass().getResource("img/delete_icon.png")));
		btCancelar = new JButton(new ImageIcon(getClass().getResource("img/exit_icon.png")));
		btAdd = new JButton("Adicionar contato");

		tfEmail = new TextField();
		tfTelefone = new TextField();
		tfDdd = new TextField();
		tfDdi = new TextField();

		add(lbEmail);
		add(lbTelefone);
		add(lbDdd);
		add(lbDdi);
		add(tfEmail);
		add(tfTelefone);
		add(tfDdd);
		add(tfDdi);
		add(btApaga);
		add(btAtualiiza);
		add(btCancelar);
		add(btNovo);
		add(btPesquisa);
		add(rbBanco);
		add(rbInfra);
		add(rbRh);
		add(rbTi);
		add(lbNomeRecrutador);
		add(lbLogin);
		add(lbSenha);
		add(lbAreaRecrutamento);
		add(tfNomeRecrutador);
		add(tflogin);
		add(lbImagem);
		add(tfSenha);
		add(btAdd);

		lbEmail.setBounds(50, 40, 200, 25);
		tfEmail.setBounds(50, 70, 300, 25);

		lbTelefone.setBounds(50, 110, 200, 25);
		tfTelefone.setBounds(50, 140, 200, 25);

		lbDdd.setBounds(50, 180, 200, 25);
		tfDdd.setBounds(50, 210, 150, 25);

		lbDdi.setBounds(50, 250, 200, 25);
		tfDdi.setBounds(50, 280, 130, 25);

		lbLogin.setBounds(400, 40, 60, 25);
		tflogin.setBounds(400, 70, 200, 25);

		lbSenha.setBounds(400, 110, 130, 25);
		tfSenha.setBounds(400, 140, 200, 25);

		lbAreaRecrutamento.setBounds(400, 180, 140, 25);
		rbBanco.setBounds(400, 210, 150, 25);
		rbInfra.setBounds(400, 240, 150, 25);
		rbRh.setBounds(400, 270, 150, 25);
		rbTi.setBounds(400, 300, 150, 25);
		lbImagem.setBounds(700, 100, 200, 200);

		btPesquisa.setBounds(400, 350, 60, 40);
		//btNovo.setBounds(470, 350, 60, 40);
		btAtualiiza.setBounds(470, 350, 60, 40);
		btApaga.setBounds(540, 350, 60, 40);
		btCancelar.setBounds(610, 350, 60, 40);
		btAdd.setBounds(50, 350, 170 , 40);

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
		rbRh.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				imagem1 = new ImageIcon(getClass().getResource("perfis/foto2.png"));
				lbImagem.setIcon(imagem1);
			}
		});
		btAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String tel = tfTelefone.getText();
				String ddd = tfDdd.getText();
				String ddi = tfDdd.getText();
				String email = tfEmail.getText();
				ContatoRecrutadorController crc = new ContatoRecrutadorController();
				int telF = Integer.parseInt(tel);
				int dddF = Integer.parseInt(ddd);
				int ddiF = Integer.parseInt(ddi);

				if (tel.equals("") || ddd.equals("") || ddi.equals("") ) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
					
				} else {
					JOptionPane.showMessageDialog(null, crc.cadastrarContatoRecrutador(1, email, telF, dddF, ddiF) );

				}
				
			}
		});
		btAtualiiza.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbImagem.setIcon(imagem1);
				String nome = tfNomeRecrutador.getText();
				String login = tflogin.getText();
				String senha = tfSenha.getText();
				String AreaRecrutamento = "";
				String email = tfEmail.getText();
				String tel = tfTelefone.getText();
				String ddd = tfDdd.getText();
				String ddi = tfDdd.getText();
				
				int telF = Integer.parseInt(tel);
				int dddF = Integer.parseInt(ddd);
				int ddiF = Integer.parseInt(ddi);



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
					String aux = JOptionPane.showInputDialog("Digite o id que deseja alterar");
					int id = Integer.parseInt(aux);
					JOptionPane.showMessageDialog(null, r.alterarRecrutador(id, nome, login, senha, areaRec));
					

				}

			}
		});


	}

}
