package Model;

import java.time.LocalDate;

public class FormacaoCandidato {
	
	private String nomeFormacao, grauFormacao, tipoGraduacao;
	private LocalDate dataConclusao, dataInicio;
	
	
	public String getNomeFormacao() {
		return nomeFormacao;
	}
	public void setNomeFormacao(String nomeFormacao) {
		this.nomeFormacao = nomeFormacao;
	}
	public String getGrauFormacao() {
		return grauFormacao;
	}
	public void setGrauFormacao(String grauFormacao) {
		this.grauFormacao = grauFormacao;
	}
	public String getTipoGraduacao() {
		return tipoGraduacao;
	}
	public void setTipoGraduacao(String tipoGraduacao) {
		this.tipoGraduacao = tipoGraduacao;
	}
	public LocalDate getDataConclusao() {
		return dataConclusao;
	}
	public void setDataConclusao(LocalDate dataConclusao) {
		this.dataConclusao = dataConclusao;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	

}
