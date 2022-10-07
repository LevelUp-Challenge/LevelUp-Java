package Controller;

import java.sql.Connection;

import Model.Conexao;
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

}
