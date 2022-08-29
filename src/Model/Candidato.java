package Model;

import java.time.LocalDate;
import java.time.Period;

public class Candidato extends Pessoa {
	private String status;
	private int idCandidato;
	private String dadosPerfilCandidato;
	private String InteressesCandidato;
	private String biografia;
	private String email;
	
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
	
	
	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDadosPerfilCandidato() {
		return dadosPerfilCandidato;
	}


	public void setDadosPerfilCandidato(String dadosPerfilCandidato) {
		this.dadosPerfilCandidato = dadosPerfilCandidato;
	}


	public String getInteressesCandidato() {
		return InteressesCandidato;
	}


	public void setInteressesCandidato(String interessesCandidato) {
		InteressesCandidato = interessesCandidato;
	}


	public String getBiografia() {
		return biografia;
	}


	public void setBiografia(String biografia) {
		this.biografia = biografia;
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
