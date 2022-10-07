package Model;

import java.time.LocalDate;

public class Experiencias {
	
	private String descricaoExperiencia, titulo, empresa, atividade;
	private LocalDate dataInicio, fimPeriodo;
	
	
	
	public String getDescricaoExperiencia() {
		return descricaoExperiencia;
	}
	public void setDescricaoExperiencia(String descricaoExperiencia) {
		this.descricaoExperiencia = descricaoExperiencia;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
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
