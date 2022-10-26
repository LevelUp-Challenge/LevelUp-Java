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
	private JLabel lbLogin;
	private JLabel lbSenha;
	private JLabel lbTel;

	
	//textField 
	private TextField tfNome;
	private TextField tfSexo;
	private TextField tfDtNasc;
	private TextField tfLogin;
	private TextField tfSenha;
	private TextField tfTel;

	//Buttom
	private JButton btnSalvar;
	private JButton btnLimparCampos;
	private JButton btnCancelar;

	
	
	public GUICandidato() {
		inicializarComponentes();
		definirEventos();
	}
	
	
	public void inicializarComponentes() {
		setBounds(0, 0, 600, 600);
		setLayout(null);
		
		//Instanciando Labels
		lbNome = new JLabel("Nome*:");
		lbSexo = new JLabel("Sexo*:");
		lbDtNasc = new JLabel("Data de Nascimento*:");
		lbLogin = new JLabel("Email*:");
		lbSenha = new JLabel("Senha*:");
		lbTel = new JLabel("Telefone*: ");
	
		//Instanciando textField
		tfNome = new TextField();
		tfSexo = new TextField();
		tfDtNasc = new TextField();
		tfLogin = new TextField();
		tfSenha = new TextField();
		tfTel = new TextField();
			
		//Instanciando botoes
		btnSalvar = new JButton("Salvar");
		btnLimparCampos = new JButton("Limpar Campos");
		btnCancelar = new JButton("Cancelar");
		
		
		//Adicionando ao form
		add(lbNome);
		add(tfNome);
		
		add(lbSexo);
		add(tfSexo);
		
		add(lbDtNasc);
		add(tfDtNasc);
		
		
		add(lbLogin);
		add(tfLogin);
		
		add(lbSenha);
		add(tfSenha);
		
		add(lbTel);
		add(tfTel);
		
		add(btnCancelar);
		add(btnSalvar);
		add(btnLimparCampos);

	
		
		
		//Posicionando labels e textField
		lbNome.setBounds(230, 40, 60, 25);
		tfNome.setBounds(230, 70, 300, 25);
		

		
		lbDtNasc.setBounds(230, 110, 130, 25 );
		tfDtNasc.setBounds(230, 150, 140, 25);
		
		lbSexo.setBounds(390, 110, 130, 25 );
		tfSexo.setBounds(390, 150, 140, 25);
		
		lbLogin.setBounds(230, 190, 70, 25);
		tfLogin.setBounds(230, 230, 300, 25);
		
		lbSenha.setBounds(230, 270, 70, 25);
		tfSenha.setBounds(230, 310, 300, 25);
		
		lbTel.setBounds(230, 340, 130, 25);
		tfTel.setBounds(230, 390, 250, 25 );

		
		btnSalvar.setBounds(230, 450, 130, 30);
		btnCancelar.setBounds(390, 450, 130, 30);

	}
	
		
		
			

	public void definirEventos() {
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CandidatoController cc = new CandidatoController();
				String nome = tfNome.getText();
				String sx = tfSexo.getText();
				String nasc = tfDtNasc.getText();
				String login = tfLogin.getText();
				String tel = tfTel.getText();
				String senha = tfSenha.getText();
				
				JOptionPane.showMessageDialog(null, cc.cadastrarCandidato(nome, sx, nasc, tel, login, senha));
				
			
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

