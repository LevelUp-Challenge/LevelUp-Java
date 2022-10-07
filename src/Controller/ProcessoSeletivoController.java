package Controller;

import java.sql.Connection;

import Model.Conexao;
import Model.ProcessoSeletivo;
import Model.ProcessoSeletivoDAO;

public class ProcessoSeletivoController {
	
	public String cadastroProcesso(int id
			, String nome, 
			String desc,
			String area,
			double salario,
			String beneficios,
			String modalidade,
			String pcd, String desafio,
			int inscritos,
			String media ) {
		
		String resultado;
		Connection con = Conexao.abrirConexao();
		ProcessoSeletivo ps = new ProcessoSeletivo();
		ProcessoSeletivoDAO psdao = new ProcessoSeletivoDAO(con);
		ps.setId(id);
		ps.setNomeVaga(nome);
		ps.setDescricaoVaga(desc);
		ps.setAreaVaga(area);
		ps.setSalario(salario);
		ps.setBeneficiosVaga(beneficios);
		ps.setModalidadeVaga(modalidade);
		ps.setPcdAplicavel(pcd);
		ps.setDesafio(desafio);
		ps.setInscritos(inscritos);
		ps.setMediaInscritos(media);
		resultado = psdao.inserir(ps);
		Conexao.fecharConexao(con);
		return resultado;
		
	}

}
