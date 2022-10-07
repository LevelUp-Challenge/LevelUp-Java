package Controller;

import java.sql.Connection;
import Model.Conexao;
import Model.Formacao;
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
	
	

}
