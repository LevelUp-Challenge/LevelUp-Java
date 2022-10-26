package Controller;

import java.sql.Connection;

import Model.Candidato;
import Model.CandidatoDAO;
import Model.Conexao;

public class CandidatoController {
	
	public String cadastrarCandidato(String nome, String sexo, String dtNasc, String tel, String login, String senha) {

		String resultado;
		Connection con = Conexao.abrirConexao();
		CandidatoDAO cd = new CandidatoDAO(con);
		Candidato ca = new Candidato();

		ca.setNome(nome);
		ca.setSexo(sexo);
		ca.setDataNasc(dtNasc);
		ca.setTelefone(tel);
		ca.setLogin(login);
		ca.setSenha(senha);
		resultado = cd.inserir(ca);
		Conexao.fecharConexao(con);
		return resultado;

	}
}
