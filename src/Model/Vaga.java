package Model;

public class Vaga {
	
	private int idVaga, quantidadeVagas, pontuacaoMin, pontuacaoMax;
	private String nomeVaga, tipoVaga, descricaoVaga, salario, areaVaga, beneficios, tempoMax;
	
	public int calculaId(int maxId) {
		return maxId + 1;
	}
	
	
	public int getIdVaga() {
		return idVaga;
	}
	public void setIdVaga(int idVaga) {
		this.idVaga = idVaga;
	}
	public int getQuantidadeVagas() {
		return quantidadeVagas;
	}
	public void setQuantidadeVagas(int quantidadeVagas) {
		this.quantidadeVagas = quantidadeVagas;
	}
	public int getPontuacaoMin() {
		return pontuacaoMin;
	}
	public void setPontuacaoMin(int pontuacaoMin) {
		this.pontuacaoMin = pontuacaoMin;
	}
	public int getPontuacaoMax() {
		return pontuacaoMax;
	}
	public void setPontuacaoMax(int pontuacaoMax) {
		this.pontuacaoMax = pontuacaoMax;
	}
	public String getNomeVaga() {
		return nomeVaga;
	}
	public void setNomeVaga(String nomeVaga) {
		this.nomeVaga = nomeVaga;
	}
	public String getTipoVaga() {
		return tipoVaga;
	}
	public void setTipoVaga(String tipoVaga) {
		this.tipoVaga = tipoVaga;
	}
	public String getDescricaoVaga() {
		return descricaoVaga;
	}
	public void setDescricaoVaga(String descricaoVaga) {
		this.descricaoVaga = descricaoVaga;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public String getAreaVaga() {
		return areaVaga;
	}
	public void setAreaVaga(String areaVaga) {
		this.areaVaga = areaVaga;
	}
	public String getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	public String getTempoMax() {
		return tempoMax;
	}
	public void setTempoMax(String tempoMax) {
		this.tempoMax = tempoMax;
	}
	
	

}
