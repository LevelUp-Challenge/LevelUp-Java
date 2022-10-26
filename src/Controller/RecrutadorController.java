package Controller;

import java.sql.Connection;
import java.util.ArrayList;

import Model.Conexao;
import Model.ProcessoSeletivoDAO;
import Model.Recrutador;
import Model.RecrutadorDAO;

public class RecrutadorController {
	
	public String cadastrarRecrutador(String nome, String login, String senha, String areasRecrutamento) {
		String Resultado;
		
		Connection con = Conexao.abrirConexao();
		Recrutador rd = new Recrutador();
		RecrutadorDAO rdao = new RecrutadorDAO(con);
		rd.setNome(nome);
		rd.setLogin(login);
		rd.setSenha(senha);
		rd.setAreas_recrutamento(areasRecrutamento);
		Resultado = rdao.inserir(rd);
		Conexao.fecharConexao(con);
		return Resultado;
		
		
		
	}
	public String alterarRecrutador(int id, String nome, String login, String senha, String areasRecrutamento) {
		String Resultado;
		
		Connection con = Conexao.abrirConexao();
		Recrutador rd = new Recrutador();
		RecrutadorDAO rdao = new RecrutadorDAO(con);
		rd.setId(id);
		rd.setNome(nome);
		rd.setLogin(login);
		rd.setSenha(senha);
		rd.setAreas_recrutamento(areasRecrutamento);
		Resultado = rdao.alterar(rd);
		Conexao.fecharConexao(con);
		return Resultado;
		
		
		
	}
	public String deletarRecrutador(int id) {
		String Resultado;
		
		Connection con = Conexao.abrirConexao();
		Recrutador rd = new Recrutador();
		RecrutadorDAO rdao = new RecrutadorDAO(con);
		rd.setId(id);
		Resultado = rdao.excluir(rd);
		Conexao.fecharConexao(con);
		return Resultado;
	
	}
	public ArrayList<String> listarRecrutador(int id) {
		ArrayList<String> resultado = new ArrayList<String>();
		Connection con = Conexao.abrirConexao();
		RecrutadorDAO rdao = new RecrutadorDAO(con);
		Conexao.fecharConexao(con);
		if (resultado != null) {
			return resultado;
			
		}else {
			return null;
		}
	}

}
