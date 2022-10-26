package Controller;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.util.ArrayList;

import Model.Conexao;
import Model.FormacaoDAO;
import Model.ProcessoSeletivo;
import Model.ProcessoSeletivoDAO;
import View.GUIProcessoSeletivo;

public class ProcessoSeletivoController {
	
	public String cadastroProcesso(
			 String nome, 
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
		//ps.setId(id);
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
//	public String listarTodos() {
//		String resultado;
//		Connection con = Conexao.abrirConexao();
//		ProcessoSeletivoDAO psdao = new ProcessoSeletivoDAO(con);
//		resultado = psdao.ListarTodos();
//		Conexao.fecharConexao(con);
//		if (resultado != null) {
//			return resultado;
//			
//		} else {
//			return null;
//
//		}
//		
//		
//	}
	public String listaTodosArray() {
		String resultado = new String();
		Connection con = Conexao.abrirConexao();
		ProcessoSeletivoDAO psdao = new ProcessoSeletivoDAO(con);
		resultado = psdao.ListarTodos();
		Conexao.fecharConexao(con);
		if (resultado != null) {
			return resultado;
			
		}else {
			return null;
		}
		

		
	}
	public String alterarProcesso(int id
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
		resultado = psdao.alterar(ps);
		Conexao.fecharConexao(con);
		return resultado;
		
	}
	public String deletarProcesso(int id) {
		
		String resultado;
		Connection con = Conexao.abrirConexao();
		ProcessoSeletivo ps = new ProcessoSeletivo();
		ProcessoSeletivoDAO psdao = new ProcessoSeletivoDAO(con);
		ps.setId(id);
		resultado = psdao.excluir(ps);
		Conexao.fecharConexao(con);
		return resultado;
		
	}
	public ArrayList<String> listarProcesso(int id) {
		ArrayList<String> resultado = new ArrayList<String>();
		Connection con = Conexao.abrirConexao();
		ProcessoSeletivoDAO psdao = new ProcessoSeletivoDAO(con);
		//resultado = psdao.listar(id);
		Conexao.fecharConexao(con);
		if (resultado != null) {
			return resultado;
			
		}else {
			return null;
		}
	}
	

}
