package Model;

import java.time.LocalDate;

public class ExtraCurriculares {
	
	private String titulo, instituicao;
	private LocalDate dataInicio, fimPeriodo;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getFimPeriodo() {
		return fimPeriodo;
	}
	public void setFimPeriodo(LocalDate fimPeriodo) {
		this.fimPeriodo = fimPeriodo;
	}
	
	

}
