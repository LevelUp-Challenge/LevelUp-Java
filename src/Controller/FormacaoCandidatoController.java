package Controller;

import java.sql.Connection;
import java.util.ArrayList;

import Model.Conexao;
import Model.EnderecoCandidatoDAO;
import Model.FormacaoCandidato;
import Model.FormacaoCandidatoDAO;

public class FormacaoCandidatoController {
	
	public String cadastrarFormacaoCandidato(int id, String tpFormacao, String status) {
		
		String resultado;
		Connection con = Conexao.abrirConexao();
		FormacaoCandidatoDAO fdao = new FormacaoCandidatoDAO(con);
		FormacaoCandidato fc = new FormacaoCandidato();
		fc.setIdFormacao(id);
		fc.setTpFormacao(tpFormacao);
		fc.setStatus(status);
		resultado = fdao.inserir(fc);
		Conexao.fecharConexao(con);
		return resultado;
		
		
	}
	public String alterarFormacaoCandidato(int id, String tpFormacao, String status) {
		
		String resultado;
		Connection con = Conexao.abrirConexao();
		FormacaoCandidatoDAO fdao = new FormacaoCandidatoDAO(con);
		FormacaoCandidato fc = new FormacaoCandidato();
		fc.setIdFormacao(id);
		fc.setTpFormacao(tpFormacao);
		fc.setStatus(status);
		resultado = fdao.alterar(fc);
		Conexao.fecharConexao(con);
		return resultado;
	}
	public String deletarFormacaoCandidato(int id) {
		
		String resultado;
		Connection con = Conexao.abrirConexao();
		FormacaoCandidatoDAO fdao = new FormacaoCandidatoDAO(con);
		FormacaoCandidato fc = new FormacaoCandidato();
		fc.setIdFormacao(id);

		resultado = fdao.excluir(fc);
		Conexao.fecharConexao(con);
		return resultado;
	
	}
	public ArrayList<String> listarFormacaoCandidato(int id) {
		ArrayList<String> resultado = new ArrayList<String>();
		Connection con = Conexao.abrirConexao();
		FormacaoCandidatoDAO fdao = new FormacaoCandidatoDAO(con);
		//resultado = fdao.listar(id);
		Conexao.fecharConexao(con);
		if (resultado != null) {
			return resultado;
			
		}else {
			return null;
		}
	}
	
}
