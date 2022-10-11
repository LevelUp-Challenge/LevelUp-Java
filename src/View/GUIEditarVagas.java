package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.ProcessoSeletivoController;

public class GUIEditarVagas extends JLabel {
	private JLabel lbVaga, lbDescricao, lbArea, lbSalario, lbBeneficios, lbModalidade, lbPcd, lbDesafio, lbInscritos, lbMediaSexo;
	private JTextField tfVaga, tfDescricao, tfArea, tfSalario, tfBeneficios, tfModalidade, tfPcd, tfDesafio, tfInscritos, tfMediaSexo;
	private JButton  btAtualiiza, btApaga, btCancelar ;
	
	public GUIEditarVagas() {
		inicializarComponentes();
		definirEventos();

	}

	public void inicializarComponentes() {
		setBounds(0, 0, 600, 750);
		setLayout(null);
		
		
		btAtualiiza = new JButton(new ImageIcon(getClass().getResource("img/update_icon.png")));
		btApaga = new JButton(new ImageIcon(getClass().getResource("img/delete_icon.png")));
		btCancelar = new JButton(new ImageIcon(getClass().getResource("img/exit_icon.png")));

		lbVaga = new JLabel("Nome da Vaga");
		tfVaga = new JTextField();

		lbDescricao = new JLabel("Descrição vaga");
		tfDescricao = new JTextField();

		lbArea = new JLabel("Area de atuação");
		tfArea = new JTextField();

		lbSalario = new JLabel("Salario");
		tfSalario = new JTextField();

		lbBeneficios = new JLabel("Beneficios");
		tfBeneficios = new JTextField();

		lbModalidade = new JLabel("Modalidade da vaga");
		tfModalidade = new JTextField();
		
		lbPcd = new JLabel("PCD");
		tfPcd = new JTextField();
		
		lbDesafio = new JLabel("Tipo de teste");
		tfDesafio = new JTextField();
		
		lbInscritos = new JLabel("Quanditade de inscritos");
		tfInscritos = new JTextField();
		
		lbMediaSexo = new JLabel("Media sexo inscritos");
		tfMediaSexo = new JTextField();
		
		


		add(lbVaga);
		add(tfVaga);

		add(lbDescricao);
		add(tfDescricao);

		add(lbArea);
		add(tfArea);

		add(lbSalario);
		add(tfSalario);

		add(lbBeneficios);
		add(tfBeneficios);

		add(lbModalidade);
		add(tfModalidade);
		
		add(lbPcd);
		add(tfPcd);
		
		add(lbDesafio);
		add(tfDesafio);
		
		add(lbInscritos);
		add(tfInscritos);
		
		add(lbMediaSexo);
		add(tfMediaSexo);

		add(btApaga);
		add(btAtualiiza);
		add(btCancelar);

		
		lbVaga.setBounds(30, 40, 160, 25);
		tfVaga.setBounds(30, 70, 200, 25);
		
		lbDescricao.setBounds(30, 110, 160, 25);
		tfDescricao.setBounds(30, 140, 200, 55);
		
		lbArea.setBounds(30, 210, 160, 25);
		tfArea.setBounds(30, 240, 200, 25);
		
		lbSalario.setBounds(30, 280, 160, 25);
		tfSalario.setBounds(30, 310, 200, 25);
		
		lbBeneficios.setBounds(30, 340, 160, 25);
		tfBeneficios.setBounds(30, 370, 200, 25);
		
		lbModalidade.setBounds(30, 410, 160, 25);
		tfModalidade.setBounds(30, 440, 200, 25);
		
		lbPcd.setBounds(300, 40, 100, 25);
		tfPcd.setBounds(300, 70, 100, 25);
		
		lbDesafio.setBounds(300, 110, 200, 25);
		tfDesafio.setBounds(300, 140, 200, 25);
		
		lbInscritos.setBounds(300, 180, 200, 25);
		tfInscritos.setBounds(300, 210, 200, 25);
		
		lbMediaSexo.setBounds(300, 250, 200, 25);
		tfMediaSexo.setBounds(300, 280, 200, 25);
		
	
		btAtualiiza.setBounds(300, 350, 60, 40);
		btApaga.setBounds(380, 350, 60, 40);
		btCancelar.setBounds(460, 350, 60, 40);
		
	}
	
	public void definirEventos() {
		btCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btAtualiiza.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ProcessoSeletivoController psc = new ProcessoSeletivoController();
				String vaga = tfVaga.getText();
				String desc = tfDescricao.getText();
				String area = tfArea.getText();
				String salario = tfSalario.getText();
				String beneficios = tfBeneficios.getText();
				String modalidade = tfModalidade.getText();
				String pcd = tfPcd.getText();
				String desa = tfDesafio.getText();
				String inscritos = tfInscritos.getText();
				String media = tfMediaSexo.getText();
				
				double salarioF = Double.parseDouble(salario);
				int inscritosF = Integer.parseInt(inscritos);
				
				String aux = JOptionPane.showInputDialog("Digite o id que deseja atualizar: ");
				int id = Integer.parseInt(aux);
				
				JOptionPane.showMessageDialog(null, psc.alterarProcesso(id, vaga, desc, area, salarioF, beneficios, modalidade, pcd, desa, inscritosF, media));
				
			}
		});
		btCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ProcessoSeletivoController psc = new ProcessoSeletivoController();

				String aux = JOptionPane.showInputDialog("Digite o id que deseja Excluir: ");
				int id = Integer.parseInt(aux);	
				JOptionPane.showMessageDialog(null, psc.deletarProcesso(id));
			}
		});
		
	}

}
