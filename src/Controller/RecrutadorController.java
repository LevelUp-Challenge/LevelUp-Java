package Controller;

import java.sql.Connection;

import Model.Conexao;
import Model.Recrutador;
import Model.RecrutadorDAO;

public class RecrutadorController {
	
	public String cadastrarRecrutador(int id, String nome, String login, String senha, String areasRecrutamento) {
		String Resultado;
		
		Connection con = Conexao.abrirConexao();
		Recrutador rd = new Recrutador();
		RecrutadorDAO rdao = new RecrutadorDAO(con);
		rd.setId(id);
		rd.setNome(nome);
		rd.setLogin(login);
		rd.setSenha(senha);
		rd.setAreas_recrutamento(areasRecrutamento);
		Resultado = rdao.inserir(rd);
		Conexao.fecharConexao(con);
		return Resultado;
		
		
		
	}

}
