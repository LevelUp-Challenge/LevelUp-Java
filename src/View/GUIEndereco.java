package View;

import java.awt.*;
import javax.swing.*;

import Controller.EnderecoController;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class GUIEndereco extends JPanel {

	private JLabel lbRua, lbNumero, lbBairro, lbCidade, lbCep, lbPontoRef, lbEstado, lbComplemento, lbSgEstado;
	private JTextField tfRua, tfNumero, tfBairro, tfCidade, tfCep, tfPontoRef, tfEstado, tfComplemento, tfSgEstado;
	private JButton btPesquisa, btNovo, btAtualiiza, btApaga, btCancelar;

	public GUIEndereco() {
		inicializarComponentes();
		definirEventos();

	}

	public void inicializarComponentes() {
		setBounds(0, 0, 400, 880);
		setLayout(null);

		lbRua = new JLabel("Endereco completo: *");
		lbNumero = new JLabel("Número");
		lbBairro = new JLabel("Bairro");
		lbCep = new JLabel("Codigo Postal");
		lbPontoRef = new JLabel("Ponto de referência");
		lbEstado = new JLabel("Estado");
		lbCidade = new JLabel("Cidade");
		lbComplemento = new JLabel("Complemento");
		lbSgEstado = new JLabel("Sigla de estado");

		tfRua = new JTextField();
		tfNumero = new JTextField();
		tfBairro = new JTextField();
		tfCidade = new JTextField();
		tfCep = new JTextField();
		tfPontoRef = new JTextField();
		tfEstado = new JTextField();
		tfComplemento = new JTextField();
		tfSgEstado = new JTextField();

		
		btPesquisa = new JButton(new ImageIcon(getClass().getResource("img/search_icon.png")));
		btNovo = new JButton(new ImageIcon(getClass().getResource("img/new_icon.png")));
		btAtualiiza = new JButton(new ImageIcon(getClass().getResource("img/update_icon.png")));
		btApaga = new JButton(new ImageIcon(getClass().getResource("img/delete_icon.png")));
		btCancelar = new JButton(new ImageIcon(getClass().getResource("img/exit_icon.png")));

		add(lbSgEstado);
		add(tfSgEstado);
		add(lbComplemento);
		add(tfComplemento);
		add(lbRua);
		add(lbNumero);
		add(lbBairro);
		add(lbCep);
		add(lbPontoRef);
		add(lbEstado);
		add(lbCidade);
		add(lbComplemento);
		add(tfRua);
		add(tfNumero);
		add(tfBairro);
		add(tfCep);
		add(tfPontoRef);
		add(tfEstado);
		add(tfComplemento);
		add(tfCidade);
		add(btApaga);
		add(btAtualiiza);
		add(btCancelar);
		add(btNovo);
		add(btPesquisa);

		lbRua.setBounds(30, 40, 200, 25);
		tfRua.setBounds(30, 70, 200, 25);

		lbNumero.setBounds(210, 110, 60, 25);
		tfNumero.setBounds(210, 140, 60, 25);

		lbBairro.setBounds(30, 110, 160, 25);
		tfBairro.setBounds(30, 140, 160, 25);

		lbCidade.setBounds(30, 180, 160, 25);
		tfCidade.setBounds(30, 210, 160, 25);

		lbSgEstado.setBounds(200, 180, 160, 25);
		tfSgEstado.setBounds(200, 210, 60, 25);

		lbCep.setBounds(30, 250, 160, 25);
		tfCep.setBounds(30, 280, 160, 25);

		lbPontoRef.setBounds(30, 310, 160, 25);
		tfPontoRef.setBounds(30, 340, 250, 65);

		lbEstado.setBounds(210, 250, 60, 25);
		tfEstado.setBounds(210, 280, 60, 25);

		lbComplemento.setBounds(30, 420, 160, 25);
		tfComplemento.setBounds(30, 450, 200, 25);


		btPesquisa.setBounds(30, 500, 60, 40);
		btNovo.setBounds(100, 500, 60, 40);
		btAtualiiza.setBounds(170, 500, 60, 40);
		btApaga.setBounds(240, 500, 60, 40);
		btCancelar.setBounds(310, 500, 60, 40);

	}

	public void definirEventos() {
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		btNovo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String endereco = tfRua.getText();
				String bairro = tfBairro.getText();
				String numero = tfNumero.getText();
				String cidade = tfCidade.getText();
				String estado = tfEstado.getText();
				String sgEstado = tfSgEstado.getText();
				String pontoRef = tfPontoRef.getText();
				String complemento = tfComplemento.getText();
				String cep = tfCep.getText();

				int numeroF = Integer.parseInt(numero);
				int cepF = Integer.parseInt(cep);

				EnderecoController ec = new EnderecoController();
				JOptionPane.showMessageDialog(null, ec.cadastroEndereco(1, bairro, endereco, cidade, cepF, pontoRef,
						estado, sgEstado, numeroF, complemento));

			}
		});
		btAtualiiza.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String endereco = tfRua.getText();
				String bairro = tfBairro.getText();
				String numero = tfNumero.getText();
				String cidade = tfCidade.getText();
				String estado = tfEstado.getText();
				String sgEstado = tfSgEstado.getText();
				String pontoRef = tfPontoRef.getText();
				String complemento = tfComplemento.getText();
				String cep = tfCep.getText();

				int numeroF = Integer.parseInt(numero);
				int cepF = Integer.parseInt(cep);

				EnderecoController ec = new EnderecoController();
				String aux = JOptionPane.showInputDialog("Digite o id que deseja atualizar: ");
				int id = Integer.parseInt(aux);

				JOptionPane.showMessageDialog(null,
						ec.alterarEndereco(id, bairro, aux, cidade, cepF, pontoRef, estado, sgEstado, id, complemento));

			}
		});
		btApaga.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				EnderecoController ec = new EnderecoController();
				String aux = JOptionPane.showInputDialog("Digite o id que deseja atualizar: ");
				int id = Integer.parseInt(aux);
				JOptionPane.showMessageDialog(null, ec.deletarEndereco(id));

			}
		});
	}
}
