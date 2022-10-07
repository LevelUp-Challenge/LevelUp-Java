package Controller;

import java.sql.Connection;

import Model.Conexao;
import Model.ContatoRecrutador;
import Model.ContatoRecrutadorDAO;

public class ContatoRecrutadorController {
	
	public String cadastrarContatoRecrutador(int id, String email, int telefone, int ddd, int ddi ) {
		String resultado;
		Connection con = Conexao.abrirConexao();
		
		ContatoRecrutador cr = new ContatoRecrutador();
		ContatoRecrutadorDAO crdao = new ContatoRecrutadorDAO(con);
		cr.setIdRecrutador(id);
		cr.setEmail(email);
		cr.setTelefone(telefone);
		cr.setDdd(ddd);
		cr.setDdi(ddi);
		resultado = crdao.inserir(cr);
		Conexao.fecharConexao(con);
		return resultado;

		
	}

}
