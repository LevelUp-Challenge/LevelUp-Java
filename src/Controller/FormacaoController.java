package Controller;

import java.sql.Connection;
import java.util.ArrayList;

import Model.Conexao;
import Model.Formacao;
import Model.FormacaoCandidatoDAO;
import Model.FormacaoDAO;

public class FormacaoController {
	
	public String cadastrarFormacao(int id, String grau, 
			String dtInicio, String dtConclusao, String nomeFormacao, String instituicao) {
		String resultado;
		Formacao f = new Formacao();
		Connection con = Conexao.abrirConexao();
		FormacaoDAO fcdao = new FormacaoDAO(con);
		f.setId(id);
		f.setNmFormacao(nomeFormacao);
		f.setNmInstituicao(instituicao);
		f.setDtInicio(dtInicio);
		f.setDtTermino(dtConclusao);
		f.setGrauFormacao(grau);
		resultado = fcdao.inserir(f);
		Conexao.fecharConexao(con);
		return resultado;
		
	}
	public String alterarFormacao(int id, String grau, 
			String dtInicio, String dtConclusao, String nomeFormacao, String instituicao) {
		String resultado;
		Formacao f = new Formacao();
		Connection con = Conexao.abrirConexao();
		FormacaoDAO fcdao = new FormacaoDAO(con);
		f.setId(id);
		f.setNmFormacao(nomeFormacao);
		f.setNmInstituicao(instituicao);
		f.setDtInicio(dtInicio);
		f.setDtTermino(dtConclusao);
		f.setGrauFormacao(grau);
		resultado = fcdao.alterar(f);
		Conexao.fecharConexao(con);
		return resultado;
		
	}
	public String deletarFormacao(int id) {
		String resultado;
		Formacao f = new Formacao();
		Connection con = Conexao.abrirConexao();
		FormacaoDAO fcdao = new FormacaoDAO(con);
		f.setId(id);
		resultado = fcdao.excluir(f);
		Conexao.fecharConexao(con);
		return resultado;
	}
	public ArrayList<String> listarFormacao(int id) {
		ArrayList<String> resultado = new ArrayList<String>();
		Connection con = Conexao.abrirConexao();
		FormacaoDAO fcdao = new FormacaoDAO(con);
		//resultado = fcdao.listar(id);
		Conexao.fecharConexao(con);
		if (resultado != null) {
			return resultado;
			
		}else {
			return null;
		}
	}
	
	
	

}
