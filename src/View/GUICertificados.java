package View;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Controller.CertificadosController;

@SuppressWarnings("serial")
public class GUICertificados extends JPanel {

	private JLabel lbCertificados, lbCursos;
	private TextField tfCertificados, tfCursos;
	private JButton btPesquisa, btNovo, btAtualiiza, btApaga, btCancelar;

	public GUICertificados() {
		inicializarComponentes();
		definirEventos();

	}

	public void inicializarComponentes() {

		setBounds(0, 0, 120, 200);
		setLayout(null);
		
		btPesquisa = new JButton(new ImageIcon(getClass().getResource("img/search_icon.png")));
		btNovo = new JButton(new ImageIcon(getClass().getResource("img/new_icon.png")));
		btAtualiiza = new JButton(new ImageIcon(getClass().getResource("img/update_icon.png")));
		btApaga = new JButton(new ImageIcon(getClass().getResource("img/delete_icon.png")));
		btCancelar = new JButton(new ImageIcon(getClass().getResource("img/exit_icon.png")));

		lbCertificados = new JLabel("Insira o certificado");
		lbCursos = new JLabel("Insira um curso extra-curricular");

		tfCertificados = new TextField();
		tfCursos = new TextField();

		add(lbCertificados);
		add(tfCertificados);
		add(lbCursos);
		add(tfCursos);
		
		add(btApaga);
		add(btAtualiiza);
		add(btCancelar);
		add(btNovo);
		add(btPesquisa);


		lbCertificados.setBounds(50, 40, 120, 25);
		tfCertificados.setBounds(50, 70, 300, 25);

		lbCursos.setBounds(50, 110, 200, 25);
		tfCursos.setBounds(50, 140, 200, 25);
		
		btPesquisa.setBounds(50, 200, 60, 40);
		btNovo.setBounds(120, 200, 60, 40);
		btAtualiiza.setBounds(200, 200, 60, 40);
		btApaga.setBounds(270, 200, 60, 40);
		btCancelar.setBounds(340, 200, 60, 40);
		


	}

	public void definirEventos() {
		btNovo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String certificado = tfCertificados.getText();
				String cursos = tfCursos.getText();
				
				if (certificado.equals("") || cursos.equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
					
				} else {
					CertificadosController gc = new CertificadosController();
					JOptionPane.showMessageDialog(null, gc.cadastrarCertificados(1, certificado, cursos));

				}
				
				
			}
		});
		btAtualiiza.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String certificado = tfCertificados.getText();
				String cursos = tfCursos.getText();
				
				if (certificado.equals("") || cursos.equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
					
				} else {
					CertificadosController gc = new CertificadosController();
					String aux = JOptionPane.showInputDialog("Digite o id que deseja alterar: ");
					int id = Integer.parseInt(aux);
					JOptionPane.showMessageDialog(null, gc.alterarCertificados(id, certificado, cursos));

				}
				
			}
		});
		btApaga.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CertificadosController gc = new CertificadosController();

				String aux = JOptionPane.showInputDialog("Digite o id que deseja apagar: ");
				int id = Integer.parseInt(aux);
				JOptionPane.showInputDialog(gc.deletarCertificados(id));
				
			}
		});

		

	}

}
