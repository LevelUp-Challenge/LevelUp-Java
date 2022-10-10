package View;

//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GUIProcessoSeletivo extends JPanel{
	
	private JLabel lbEmail, lbNumero, lbPais, lbCurriculo, lbIdiomas, lbDescricao;
	private JTextField tfEmail, tfNumero, tfPais, tfCurriculo, tfIdiomas, tfDescricao;
	private JCheckBox ckIdiomas;
	private JTextArea taDescricao;
	
	private JButton btnSalvar, btnCancelar;
	
	public GUIProcessoSeletivo() {
		inicializarComponentes();
		definirEventos();

	}
	
	public void inicializarComponentes() {
		setBounds(0, 0, 600, 750);
		setLayout(null);
		
		
		lbEmail = new JLabel("Email");
		lbNumero = new JLabel("Número de telefone");
		lbPais = new JLabel("País");
		lbCurriculo = new JLabel("Currículo");
		lbIdiomas = new JLabel("Idiomas");
		lbDescricao = new JLabel("Descrição");
		
		tfEmail = new JTextField();
		tfNumero = new JTextField();
		tfPais = new JTextField();
		tfCurriculo = new JTextField();
		tfIdiomas = new JTextField();
		tfDescricao = new JTextField();
		
		ckIdiomas = new JCheckBox("Idiomas");
		
		taDescricao = new JTextArea("Descrição");
		
		lbEmail.setBounds(30, 40, 60, 25);
		tfEmail.setBounds(30, 70, 200, 25);
		
		lbNumero.setBounds(30, 110, 60, 25);
		tfNumero.setBounds(30, 140, 60, 25);
		
		lbPais.setBounds(30, 170, 60, 25);
		tfPais.setBounds(30, 210, 60, 25);
		
		lbCurriculo.setBounds(30, 260, 60, 25);
		tfCurriculo.setBounds(30, 300, 60, 25);
		
		lbIdiomas.setBounds(30, 340, 60, 25);
		tfIdiomas.setBounds(30, 390, 60, 25);
		ckIdiomas.setBounds(55, 60, 60, 25);
		
		lbDescricao.setBounds(30, 430, 60, 25);
		tfDescricao.setBounds(30, 470, 200, 25);
		
		btnSalvar.setBounds(130, 760, 130, 30);
		btnCancelar.setBounds(290, 760, 130, 30);

		add(lbEmail);
		add(tfEmail);
		add(lbNumero);
		add(tfNumero);
		add(lbPais);
		add(tfPais);
		add(lbCurriculo);
		add(tfCurriculo);
		add(lbIdiomas);
		add(tfIdiomas);
		add(ckIdiomas);
		add(tfDescricao);
		add(taDescricao);
		add(btnSalvar);
		add(btnCancelar);
		
		
	}
	
	public void definirEventos() {
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		
	}
}
