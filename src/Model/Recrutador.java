package Model;

import java.time.LocalDate;
import java.time.Period;

public class Recrutador extends Pessoa {
	private int idRecrutador;
	private String status;
	private String areas_recrutamento;
	
	public Recrutador() {
		
	}
	
	
	
	public Recrutador(String areas_recrutamento, String nome, String login, String senha, int idRecrutador, String status) {
		super.setNome(nome);
		super.setLogin(login);
		super.setSenha(senha);
		super.setId(idRecrutador);
		
		this.idRecrutador = idRecrutador;
		this.status = status;
		this.areas_recrutamento = areas_recrutamento;
	}



	public String getAreas_recrutamento() {
		return areas_recrutamento;
	}



	public void setAreas_recrutamento(String areas_recrutamento) {
		this.areas_recrutamento = areas_recrutamento;
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
