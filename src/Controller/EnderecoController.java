package Controller;

import java.sql.Connection;

import Model.Conexao;
import Model.EnderecoCandidato;
import Model.EnderecoCandidatoDAO;

public class EnderecoController {
	
	public String cadastroEndereco(int id,
			String bairro, String logradouro, String cidade,
			int cep, String pontoRef,
			String estado, String sgEstado,
			int nrLogradouro,
			String complementoNumber) {
	
	String resultado;
	EnderecoCandidato ec = new EnderecoCandidato();
	Connection con = Conexao.abrirConexao();
	EnderecoCandidatoDAO ecdao = new EnderecoCandidatoDAO(con);
	ec.setIdEnderecoCandidato(id);
	ec.setDsBairro(bairro);
	ec.setDsCidade(cidade);
	ec.setCep(cep);
	ec.setPontoRef(pontoRef);
	ec.setEstado(estado);
	ec.setSgEstado(sgEstado);
	ec.setNrLogradouro(nrLogradouro);
	ec.setDsLogradouro(logradouro);
	ec.setComplemento(complementoNumber);
	
	resultado = ecdao.inserir(ec);
	Conexao.fecharConexao(con);
	return resultado;
	
	
	
	}
}
