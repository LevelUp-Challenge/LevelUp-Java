package Model;

import java.time.LocalDate;
import java.time.Period;

public class Candidato extends Pessoa {
	private String status;
	private int idCandidato;
	
	public Candidato() {
		
	}
	
	
	public Candidato(String nome, String idade, LocalDate dataNasc, int telefone, String email, String endereco, String login, String senha, int id, String status, int idCandidato) {
		
		super.setNome(nome);
		super.setIdade(idade);
		super.setEmail(email);
		super.setDataNasc(dataNasc);
		super.setEndereco(endereco);
		super.setLogin(login);
		super.setSenha(senha);
		super.setTelefone(telefone);
		super.setId(idCandidato);
		
		this.status = status;
		this.idCandidato = idCandidato;
	}


	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getIdCandidato() {
		return idCandidato;
	}
	public void setIdCandidato(int idCandidato) {
		this.idCandidato = idCandidato;
	}
	
	public int calculaId() {
		int userId = super.getId() + 1;
		return userId;
	
	}
	public Period calculaIdade(LocalDate dataA) {
		Period idade = Period.between(super.getDataNasc(), dataA);
		return idade;
		
	}
	
	
	
	

}
