package Model;

import java.time.LocalDate;
import java.time.Period;

public class Recrutador extends Pessoa {
	private int idRecrutador; 
	private String areas_recrutamento; 
	
	public Recrutador() {
		
	}
	
	
	
	public Recrutador(String areas_recrutamento, String nome, String login, String senha, int idRecrutador, String status) {
		super.setNome(nome);
		super.setLogin(login);
		super.setSenha(senha);
		super.setId(idRecrutador);
		super.getStatus();
		
		this.idRecrutador = idRecrutador;
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
	
	
	public int calculaId() {
		int userId = super.getId() + 1;
		return userId;
	
	}
	
	
	
	
	

}
