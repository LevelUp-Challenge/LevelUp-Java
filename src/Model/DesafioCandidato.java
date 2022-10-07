package Model;

public class DesafioCandidato {
	private int idDesafioCandidato;
	private String status, tempoAplicacao, aprovacao;
	private int pontuacao;
	
	
	
	public String getAprovacao() {
		return aprovacao;
	}
	public void setAprovacao(String aprovacao) {
		this.aprovacao = aprovacao;
	}
	public int getIdDesafioCandidato() {
		return idDesafioCandidato;
	}
	public void setIdDesafioCandidato(int idDesafioCandidato) {
		this.idDesafioCandidato = idDesafioCandidato;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTempoAplicacao() {
		return tempoAplicacao;
	}
	public void setTempoAplicacao(String tempoAplicacao) {
		this.tempoAplicacao = tempoAplicacao;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	

}
