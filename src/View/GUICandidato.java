package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.*;

import Controller.CandidatoController;

@SuppressWarnings("serial")
public class GUICandidato extends JPanel {
	
	//Form Label
	private JLabel lbNome;
	private JLabel lbSexo;
	private JLabel lbDtNasc;
	private JLabel lbEmail;
	private JLabel lbTelefone;
	private JLabel lbCpf;
	private JLabel lbDsPerfil;
	private JLabel lbDsBiografia;
	private JLabel lbInteresses;
	
	//textField 
	private TextField tfNome;
	private TextField tfSexo;
	private TextField tfDtNasc;
	private TextField tfEmail;
	private TextField tfTelefone;
	private TextField tfCpf;
	private TextField tfDsPerfil;
	private TextField tfDsBiografia;
	private TextField tfInteresses;
	
	//Buttom
	private JButton btnSalvar;
	private JButton btnLimparCampos;
	private JButton btnCancelar;
	private JRadioButton rbMasculino, rbFeminino, rbNaoInformar;
	private ButtonGroup buttonGroup;

	private JButton btPesquisa, btNovo, btAtualiiza, btApaga, btCancelar;;
	
	
	public GUICandidato() {
		inicializarComponentes();
		definirEventos();
	}
	
	
	public void inicializarComponentes() {
		setBounds(0, 0, 800, 1000);
		setLayout(null);
		
		//Instanciando Labels
		lbNome = new JLabel("Nome*:");
		lbSexo = new JLabel("Sexo*:");
		lbDtNasc = new JLabel("Data de Nascimento*:");
		lbEmail = new JLabel("Email*:");
		lbTelefone = new JLabel("Telefone*:");
		lbCpf = new JLabel("Cpf*:");
		lbDsPerfil = new JLabel("Descrição de perfil*: ");
		lbDsBiografia = new JLabel("Descrição Biografia:");
		lbInteresses = new JLabel("Descrição Interesses*:");
		
		btPesquisa = new JButton(new ImageIcon(getClass().getResource("img/search_icon.png")));
		btNovo = new JButton(new ImageIcon(getClass().getResource("img/new_icon.png")));
		btAtualiiza = new JButton(new ImageIcon(getClass().getResource("img/update_icon.png")));
		btApaga = new JButton(new ImageIcon(getClass().getResource("img/delete_icon.png")));
		btCancelar = new JButton(new ImageIcon(getClass().getResource("img/exit_icon.png")));
		
		//Instanciando textField
		tfNome = new TextField();
		tfSexo = new TextField();
		tfDtNasc = new TextField();
		tfEmail = new TextField();
		tfTelefone = new TextField();
		tfCpf = new TextField();
		tfDsPerfil = new TextField();
		tfDsBiografia = new TextField();
		tfInteresses= new TextField();
		
		//Instanciando botoes
		btnSalvar = new JButton("Salvar");
		btnLimparCampos = new JButton("Limpar Campos");
		btnCancelar = new JButton("Cancelar");
		
		
		rbMasculino = new JRadioButton("Concluido");
		rbFeminino = new JRadioButton("Cursando");
		rbNaoInformar = new JRadioButton("Incompleto");

		buttonGroup = new ButtonGroup();
		buttonGroup.add(rbMasculino);
		buttonGroup.add(rbFeminino);
		buttonGroup.add(rbNaoInformar);
		
		//Adicionando ao form
		add(lbNome);
		add(tfNome);
		
		add(lbSexo);
		add(tfSexo);
		
		add(lbDtNasc);
		add(tfDtNasc);
		
		add(lbCpf);
		add(tfCpf);
		
		add(lbEmail);
		add(tfEmail);
		
		add(lbTelefone);
		add(tfTelefone);
		
		add(lbDsPerfil);
		add(tfDsPerfil);
		
		add(lbDsBiografia);
		add(tfDsBiografia);
		
		add(lbInteresses);
		add(tfInteresses);
	
		add(btnCancelar);
		add(btnSalvar);
		add(btnLimparCampos);

	
		
		
		//Posicionando labels e textField
		lbNome.setBounds(230, 40, 60, 25);
		tfNome.setBounds(230, 70, 300, 25);
		
		lbCpf.setBounds(230, 110, 60, 25);
		tfCpf.setBounds(230, 140, 160, 25);
		
		lbDtNasc.setBounds(230, 180, 130, 25 );
		tfDtNasc.setBounds(230, 210, 140, 25);
		
		lbSexo.setBounds(390, 180, 130, 25 );
		tfSexo.setBounds(390, 210, 140, 25);
		
		lbEmail.setBounds(230, 250, 70, 25);
		tfEmail.setBounds(230, 280, 300, 25);
		
		lbTelefone.setBounds(230, 320, 70, 25);
		tfTelefone.setBounds(230, 350, 160, 25);
		
		lbDsPerfil.setBounds(230, 390, 130, 25);
		tfDsPerfil.setBounds(230, 420, 300, 80 );
		
		lbDsBiografia.setBounds(230, 520, 130, 25);
		tfDsBiografia.setBounds(230, 550, 320, 100 );
		
		lbInteresses.setBounds(230, 670, 130, 25);
		tfInteresses.setBounds(230, 700, 320, 100 );
		
		btnSalvar.setBounds(230, 830, 130, 30);
		btnCancelar.setBounds(390, 830, 130, 30);
		btnLimparCampos.setBounds(30, 20, 130, 20);

	}
	
		
		
			

	public void definirEventos() {
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CandidatoController cc = new CandidatoController();
				String nome = tfNome.getText();
				String sx = "M";
				String nasc = tfDtNasc.getText();
				String email = tfEmail.getText();
				String tel = tfTelefone.getText();
				String login = "jhonnyols";
				String cpf = tfCpf.getText();
				String staus = "A";
				String senha = "1234";
				String dsPerfil = tfDsPerfil.getText();
				String bio = tfDsBiografia.getText();
				String interesses = tfInteresses.getText();
				int id = 1234;
				
				//System.out.println(cc.cadastrarCandidato(nome, sx, email, dsPerfil, bio, interesses, nasc, tel, login, cpf, staus, senha, id));
				//System.exit(0);
			
			}});
		btnCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btnLimparCampos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	

	}
}

