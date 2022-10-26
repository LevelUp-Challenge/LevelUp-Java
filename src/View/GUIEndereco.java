package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.EnderecoController;

@SuppressWarnings("serial")
public class GUIEndereco extends JPanel {

	private JLabel lbRua, lbLogradouro, lbBairro, lbCidade, lbCep, lbEstado, lbComplemento;
	private JTextField tfRua, tfLogradouro, tfBairro, tfCidade, tfCep, tfEstado, tfComplemento;
	private JButton btNovo, btAtualiiza, btApaga, btCancelar;

	public GUIEndereco() {
		inicializarComponentes();
		definirEventos();

	}

	public void inicializarComponentes() {
		setBounds(0, 0, 400, 880);
		setLayout(null);

		lbRua = new JLabel("Endereco completo: *");
		lbLogradouro = new JLabel("Número");
		lbBairro = new JLabel("Bairro");
		lbCep = new JLabel("Codigo Postal");
		lbEstado = new JLabel("Estado");
		lbCidade = new JLabel("Cidade");
		lbComplemento = new JLabel("Complemento");

		tfRua = new JTextField();
		tfLogradouro = new JTextField();
		tfBairro = new JTextField();
		tfCidade = new JTextField();
		tfCep = new JTextField();
		tfEstado = new JTextField();
		tfComplemento = new JTextField();

		btNovo = new JButton(new ImageIcon(getClass().getResource("img/new_icon.png")));
		btAtualiiza = new JButton(new ImageIcon(getClass().getResource("img/update_icon.png")));
		btApaga = new JButton(new ImageIcon(getClass().getResource("img/delete_icon.png")));
		btCancelar = new JButton(new ImageIcon(getClass().getResource("img/exit_icon.png")));

		add(lbComplemento);
		add(tfComplemento);
		add(lbRua);
		add(lbLogradouro);
		add(lbBairro);
		add(lbCep);
		add(lbLogradouro);
		add(tfLogradouro);
		add(lbEstado);
		add(lbCidade);
		add(lbComplemento);
		add(tfRua);
		add(tfBairro);
		add(tfCep);
		add(tfEstado);
		add(tfComplemento);
		add(tfCidade);
		add(btApaga);
		add(btAtualiiza);
		add(btCancelar);
		add(btNovo);

		lbRua.setBounds(30, 40, 200, 25);
		tfRua.setBounds(30, 70, 200, 25);

		lbLogradouro.setBounds(210, 110, 60, 25);
		tfLogradouro.setBounds(210, 140, 60, 25);

		lbBairro.setBounds(30, 110, 160, 25);
		tfBairro.setBounds(30, 140, 160, 25);

		lbCidade.setBounds(30, 180, 160, 25);
		tfCidade.setBounds(30, 210, 160, 25);

		lbCep.setBounds(30, 250, 160, 25);
		tfCep.setBounds(30, 280, 160, 25);

		lbEstado.setBounds(210, 250, 60, 25);
		tfEstado.setBounds(210, 280, 60, 25);

		lbComplemento.setBounds(30, 320, 160, 25);
		tfComplemento.setBounds(30, 350, 200, 25);

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
				String logradouro = tfLogradouro.getText();
				String cidade = tfCidade.getText();
				String estado = tfEstado.getText();
				String complemento = tfComplemento.getText();
				String cep = tfCep.getText();
				int cepF = Integer.parseInt(cep);

				EnderecoController ec = new EnderecoController();
				System.out.println(ec.cadastroEndereco(bairro, logradouro, cidade, cepF, estado, complemento));

			}
		});
		btAtualiiza.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String endereco = tfRua.getText();
				String bairro = tfBairro.getText();
				String logradouro = tfLogradouro.getText();
				String cidade = tfCidade.getText();
				String estado = tfEstado.getText();
				String complemento = tfComplemento.getText();
				String cep = tfCep.getText();
				int cepF = Integer.parseInt(cep);

				EnderecoController ec = new EnderecoController();
				String aux = JOptionPane.showInputDialog("Digite o id que deseja atualizar: ");
				int id = Integer.parseInt(aux);

				JOptionPane.showMessageDialog(null,
						ec.alterarEndereco(id, bairro, logradouro, cidade, cepF, estado, complemento));

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
