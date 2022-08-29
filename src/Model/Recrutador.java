package Model;

import java.time.LocalDate;
import java.time.Period;

public class Recrutador extends Pessoa {
	private int idRecrutador;
	// Declarar lista;
	private String status;
	
	public Recrutador() {
		
	}
	
	
	
	public Recrutador(String nome, String idade, LocalDate dataNasc, int telefone, String email, String endereco, String login, String senha, int id, int idRecrutador, String status) {
		
		super.setNome(nome);
		super.setIdade(idade);
		super.setEmail(email);
		super.setDataNasc(dataNasc);
		super.setEndereco(endereco);
		super.setLogin(login);
		super.setSenha(senha);
		super.setTelefone(telefone);
		super.setId(idRecrutador);
		
		this.idRecrutador = idRecrutador;
		this.status = status;
	}



	public int getIdRecrutador() {
		return idRecrutador;
	}
	public void setIdRecrutador(int idRecrutador) {
		this.idRecrutador = idRecrutador;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
