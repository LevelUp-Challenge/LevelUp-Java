package View;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Controller.ContatoRecrutadorController;

@SuppressWarnings("serial")
public class GUIContatoRecrutador extends JPanel {

	private JLabel lbEmail, lbTelefone, lbDdd, lbDdi;
	private TextField tfEmail, tfTelefone, tfDdd, tfDdi;
	private JButton btPesquisa, btNovo, btAtualiiza, btApaga, btCancelar;

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
		btPesquisa = new JButton(new ImageIcon(getClass().getResource("img/search_icon.png")));
		btNovo = new JButton(new ImageIcon(getClass().getResource("img/new_icon.png")));
		btAtualiiza = new JButton(new ImageIcon(getClass().getResource("img/update_icon.png")));
		btApaga = new JButton(new ImageIcon(getClass().getResource("img/delete_icon.png")));
		btCancelar = new JButton(new ImageIcon(getClass().getResource("img/exit_icon.png")));

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

		lbEmail.setBounds(230, 40, 60, 25);
		tfEmail.setBounds(230, 70, 300, 25);

		lbTelefone.setBounds(230, 110, 60, 25);
		tfTelefone.setBounds(230, 140, 200, 25);

		lbDdd.setBounds(230, 180, 130, 25);
		tfDdd.setBounds(230, 210, 150, 25);

		lbDdi.setBounds(390, 250, 130, 25);
		tfDdi.setBounds(390, 250, 130, 25);

		btAtualiiza.setBounds(370, 470, 60, 40);
		btApaga.setBounds(440, 470, 60, 40);
		btCancelar.setBounds(500, 470, 60, 40);

	}

	public void definirEventos() {

		btCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		btNovo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String email = tfEmail.getText();
				String tel = tfTelefone.getText();
				int telFormat = Integer.parseInt(tel);
				String ddd = tfDdd.getText();
				int dddFormat = Integer.parseInt(ddd);
				String ddi = tfDdi.getText();
				int ddiFormat = Integer.parseInt(ddi);
				ContatoRecrutadorController crc = new ContatoRecrutadorController();
				JOptionPane.showMessageDialog(null,
						crc.cadastrarContatoRecrutador(1, email, telFormat, dddFormat, ddiFormat));

			}
		});
		btAtualiiza.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String email = tfEmail.getText();
				String tel = tfTelefone.getText();
				int telFormat = Integer.parseInt(tel);
				String ddd = tfDdd.getText();
				int dddFormat = Integer.parseInt(ddd);
				String ddi = tfDdi.getText();
				int ddiFormat = Integer.parseInt(ddi);
				ContatoRecrutadorController crc = new ContatoRecrutadorController();
				JOptionPane.showMessageDialog(null,
						crc.alteraContatoRecrutador(1, email, telFormat, dddFormat, ddiFormat));

			}
		});
		btApaga.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String aux = JOptionPane.showInputDialog("Digite o id que deseja excluir: ");
				int id = Integer.parseInt(aux);
				ContatoRecrutadorController crc = new ContatoRecrutadorController();
				JOptionPane.showMessageDialog(null, crc.deletarContatoRecrutador(id));

			}
		});

	}

}
