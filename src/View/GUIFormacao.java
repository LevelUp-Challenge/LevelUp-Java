package View;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Controller.ContatoRecrutadorController;
import Controller.FormacaoCandidatoController;
import Controller.FormacaoController;

@SuppressWarnings("serial")
public class GUIFormacao extends JPanel {

	private JLabel lbGrauFormacao, lbNmFormacao, lbInstituicao, lbDataI, lbDataC, lbTipoFormacao, lbStatusFormacao;
	private TextField tfGrauFormacao, tfNmFormacao, tfInstituicao, tfDataI, tfDataC, tfTipoFormacao, tfStatusFormacao;
	private JButton btNovo, btAtualiiza, btApaga, btCancelar;;
	private JRadioButton rbCursando, rbConcluido, rbIncompleto;
	private ButtonGroup buttonGroup;

	public GUIFormacao() {
		inicializarComponentes();
		definirEventos();

	}

	public void inicializarComponentes() {
		setBounds(0, 0, 600, 600);
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

		rbConcluido = new JRadioButton("Concluido");
		rbCursando = new JRadioButton("Cursando");
		rbIncompleto = new JRadioButton("Incompleto");

		buttonGroup = new ButtonGroup();
		buttonGroup.add(rbConcluido);
		buttonGroup.add(rbCursando);
		buttonGroup.add(rbIncompleto);

		btNovo = new JButton(new ImageIcon(getClass().getResource("img/new_icon.png")));
		btAtualiiza = new JButton(new ImageIcon(getClass().getResource("img/update_icon.png")));
		btApaga = new JButton(new ImageIcon(getClass().getResource("img/delete_icon.png")));
		btCancelar = new JButton(new ImageIcon(getClass().getResource("img/exit_icon.png")));

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
		add(btApaga);
		add(btAtualiiza);
		add(btCancelar);
		add(btNovo);
		add(rbConcluido);
		add(rbCursando);
		add(rbIncompleto);

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

		lbTipoFormacao.setBounds(230, 320, 130, 25);
		tfTipoFormacao.setBounds(230, 360, 250, 25);

		lbStatusFormacao.setBounds(230, 400, 130, 25);
		rbConcluido.setBounds(230, 430, 100, 25);
		rbCursando.setBounds(330, 430, 100, 25);
		rbIncompleto.setBounds(440, 430, 100, 25);

		btNovo.setBounds(300, 470, 60, 40);
		btAtualiiza.setBounds(370, 470, 60, 40);
		btApaga.setBounds(440, 470, 60, 40);
		btCancelar.setBounds(510, 470, 60, 40);

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

				FormacaoCandidatoController fcc = new FormacaoCandidatoController();
				FormacaoController fc = new FormacaoController();

				String nmFormacao = tfNmFormacao.getText();
				String grFormacao = tfGrauFormacao.getText();
				String instituicao = tfInstituicao.getText();
				String dtInicio = tfDataI.getText();
				String dtTermino = tfDataC.getText();
				String tpFormacao = tfTipoFormacao.getText();

				String status = "";

				if (rbConcluido.isSelected()) {
					status = "Concluido";

				} else if (rbCursando.isSelected()) {
					status = "Cursando";

				} else {
					status = "Incompleto";
				}
				String statusSelected = status;

				if (nmFormacao.equals("") || grFormacao.equals("") || instituicao.equals("") || dtInicio.equals("")
						|| dtTermino.equals("") || tpFormacao.equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");

				} else {
					JOptionPane.showMessageDialog(null, fcc.cadastrarFormacaoCandidato(10, tpFormacao, statusSelected));
					JOptionPane.showMessageDialog(null,
							fc.cadastrarFormacao(10, grFormacao, dtInicio, dtTermino, nmFormacao, instituicao));

				}

			}

		});
		btAtualiiza.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FormacaoCandidatoController fcc = new FormacaoCandidatoController();
				FormacaoController fc = new FormacaoController();

				String nmFormacao = tfNmFormacao.getText();
				String grFormacao = tfGrauFormacao.getText();
				String instituicao = tfInstituicao.getText();
				String dtInicio = tfDataI.getText();
				String dtTermino = tfDataC.getText();
				String tpFormacao = tfTipoFormacao.getText();

				String status = "";

				if (rbConcluido.isSelected()) {
					status = "Concluido";

				} else if (rbCursando.isSelected()) {
					status = "Cursando";

				} else {
					status = "Incompleto";
				}
				String statusSelected = status;

				if (nmFormacao.equals("") || grFormacao.equals("") || instituicao.equals("") || dtInicio.equals("")
						|| dtTermino.equals("") || tpFormacao.equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");

				} else {
					JOptionPane.showMessageDialog(null, fcc.alterarFormacaoCandidato(2, tpFormacao, statusSelected));
					JOptionPane.showMessageDialog(null,
							fc.alterarFormacao(2, grFormacao, dtInicio, dtTermino, nmFormacao, instituicao));

				}

			}
		});
		btApaga.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FormacaoCandidatoController fcc = new FormacaoCandidatoController();
				FormacaoController fc = new FormacaoController();
				String aux = JOptionPane.showInputDialog("Digite o id que deseja apagar: ");
				int id = Integer.parseInt(aux);

				if (id <= 0) {
					JOptionPane.showMessageDialog(null, "O id fornecido é invalido! digite um Id valido!");

				} else {
					JOptionPane.showMessageDialog(null, fc.deletarFormacao(id));
					JOptionPane.showMessageDialog(null, fcc.deletarFormacaoCandidato(id));

				}

			}
		});

	}
}
