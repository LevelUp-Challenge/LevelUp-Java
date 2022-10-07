package Model;

import java.time.LocalDate;

public class Formacao {
	private int id;
	private String grauFormacao, nmFormacao, nmInstituicao;
	private String dtInicio, dtTermino;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrauFormacao() {
		return grauFormacao;
	}
	public void setGrauFormacao(String grauFormacao) {
		this.grauFormacao = grauFormacao;
	}
	public String getNmFormacao() {
		return nmFormacao;
	}
	public void setNmFormacao(String nmFormacao) {
		this.nmFormacao = nmFormacao;
	}
	public String getNmInstituicao() {
		return nmInstituicao;
	}
	public void setNmInstituicao(String nmInstituicao) {
		this.nmInstituicao = nmInstituicao;
	}
	
	public String getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}
	public void setDtTermino(String dtTermino) {
		this.dtTermino = dtTermino;
	}
	public String getDtTermino() {
		return dtTermino;
	}
	
	
	

}
