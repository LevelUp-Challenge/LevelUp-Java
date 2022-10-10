package Controller;

import java.sql.Connection;

import Model.Candidato;
import Model.CandidatoDAO;
import Model.Conexao;

public class CandidatoController {
	
	//REVISAR
	public String cadastrarCandidato(int id ,String nome, 
			String sexo, String dtNasc,  String Email, String tel,
			 String dsPerfil, String biografia,
			 String interesses, 
			 String login, int cpf, String status, String senha ) {
		
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
