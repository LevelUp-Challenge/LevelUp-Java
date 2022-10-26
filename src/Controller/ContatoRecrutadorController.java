package Controller;

import java.sql.Connection;
import java.util.ArrayList;

import Model.CertificadosDAO;
import Model.Conexao;
import Model.ContatoRecrutador;
import Model.ContatoRecrutadorDAO;

public class ContatoRecrutadorController {
	
	public String cadastrarContatoRecrutador( String email, int telefone, int ddd, int ddi ) {
		String resultado;
		Connection con = Conexao.abrirConexao();
		
		ContatoRecrutador cr = new ContatoRecrutador();
		ContatoRecrutadorDAO crdao = new ContatoRecrutadorDAO(con);
		//cr.setIdRecrutador(id);
		cr.setEmail(email);
		cr.setTelefone(telefone);
		cr.setDdd(ddd);
		cr.setDdi(ddi);
		resultado = crdao.inserir(cr);
		Conexao.fecharConexao(con);
		return resultado;

		
	}
	public String alteraContatoRecrutador(int id, String email, int telefone, int ddd, int ddi ) {
		String resultado;
		Connection con = Conexao.abrirConexao();
		
		ContatoRecrutador cr = new ContatoRecrutador();
		ContatoRecrutadorDAO crdao = new ContatoRecrutadorDAO(con);
		cr.setIdRecrutador(id);
		cr.setEmail(email);
		cr.setTelefone(telefone);
		cr.setDdd(ddd);
		cr.setDdi(ddi);
		resultado = crdao.alterar(cr);
		Conexao.fecharConexao(con);
		return resultado;
		
		
	}
	public String deletarContatoRecrutador(int id) {
		String resultado;
		Connection con = Conexao.abrirConexao();
		
		ContatoRecrutador cr = new ContatoRecrutador();
		ContatoRecrutadorDAO crdao = new ContatoRecrutadorDAO(con);
		cr.setIdRecrutador(id);
		resultado = crdao.excluir(cr);
		Conexao.fecharConexao(con);
		return resultado;
		
	}
	
	public ArrayList<String> listarContatoRecrutador(int id) {
		ArrayList<String> resultado = new ArrayList<String>();
		Connection con = Conexao.abrirConexao();
		ContatoRecrutadorDAO crdao = new ContatoRecrutadorDAO(con);
		//resultado = crdao.listar(id);
		Conexao.fecharConexao(con);
		if (resultado != null) {
			return resultado;
			
		}else {
			return null;
		}
	}

}
