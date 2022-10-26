package Controller;

import java.sql.Connection;
import java.util.ArrayList;

import Model.Conexao;
import Model.DesafioCandidatoDAO;
import Model.EnderecoCandidato;
import Model.EnderecoCandidatoDAO;

public class EnderecoController {

	public String cadastroEndereco( String bairro, String logradouro, String cidade, int cep, String estado,
			String complemento) {

		String resultado;
		EnderecoCandidato ec = new EnderecoCandidato();
		Connection con = Conexao.abrirConexao();
		EnderecoCandidatoDAO ecdao = new EnderecoCandidatoDAO(con);
		ec.setLogradouro(logradouro);
		ec.setBairro(bairro);
		ec.setCidade(cidade);
		ec.setCep(cep);
		ec.setEstado(estado);
		ec.setEstado(estado);
		ec.setComplemento(complemento);

		resultado = ecdao.inserir(ec);
		Conexao.fecharConexao(con);
		return resultado;

	}

	public String alterarEndereco(int id, String bairro, String logradouro, String cidade, int cep, String estado,
			String complemento) {
		String resultado;
		EnderecoCandidato ec = new EnderecoCandidato();
		Connection con = Conexao.abrirConexao();
		EnderecoCandidatoDAO ecdao = new EnderecoCandidatoDAO(con);
		ec.setLogradouro(logradouro);
		ec.setBairro(bairro);
		ec.setCidade(cidade);
		ec.setCep(cep);
		ec.setEstado(estado);
		ec.setEstado(estado);
		ec.setComplemento(complemento);

		resultado = ecdao.alterar(ec);
		Conexao.fecharConexao(con);
		return resultado;

	}

	public String deletarEndereco(int id) {
		String resultado;
		EnderecoCandidato ec = new EnderecoCandidato();
		Connection con = Conexao.abrirConexao();
		EnderecoCandidatoDAO ecdao = new EnderecoCandidatoDAO(con);
		ec.setId(id);
		resultado = ecdao.excluir(ec);
		Conexao.fecharConexao(con);
		return resultado;

	}

//	public ArrayList<String> listarEndereco(int id) {
//		ArrayList<String> resultado = new ArrayList<String>();
//		Connection con = Conexao.abrirConexao();
//		EnderecoCandidatoDAO ecdao = new EnderecoCandidatoDAO(con);
//		// resultado = ecdao.listar(id);
//		Conexao.fecharConexao(con);
//		if (resultado != null) {
//			return resultado;
//
//		} else {
//			return null;
//		}
//	}

}
