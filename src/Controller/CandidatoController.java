package Controller;

import java.sql.Connection;

import Model.Candidato;
import Model.CandidatoDAO;
import Model.Conexao;

public class CandidatoController {
	
	//REVISAR
	public String cadastrarCandidato(String nome, 
			String sexo,  String Email,
			 String dsPerfil, String biografia,
			 String interesses, String dtNasc, String tel, 
			 String login, String cpf, String status, 
			 String senha, int id ) {
		
	String resultado;
	Connection con = Conexao.abrirConexao();
	CandidatoDAO cd = new CandidatoDAO(con);
	Candidato ca = new Candidato();
	
	ca.setId(id);
	ca.setNome(nome);
	ca.setSexo(sexo);
	ca.setDataNasc(dtNasc);
	ca.setEmail(Email);
	ca.setTelefone(tel);
	ca.setLogin(login);
	ca.setCpf(cpf);
	ca.setStatus(status);
	ca.setSenha(senha);
	ca.setDadosPerfilCandidato(dsPerfil);
	ca.setBiografia(biografia);
	ca.setInteressesCandidato(interesses);
	resultado = cd.inserir(ca);
	Conexao.fecharConexao(con);
	
	return resultado;
	
	}
}
