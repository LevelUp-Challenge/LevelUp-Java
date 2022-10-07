package Model;

public class EnderecoCandidato {
	private int idEnderecoCandidato;
	private String dsBairro;
	private String dsLogradouro;
	private String dsCidade;
	private int cep;
	private String pontoRef;
	private String estado;
	private String sgEstado;
	private int nrLogradouro;
	private String complemento;
	
	
	public String getDsLogradouro() {
		return dsLogradouro;
	}
	public void setDsLogradouro(String dsLogradouro) {
		this.dsLogradouro = dsLogradouro;
	}
	
	public int getIdEnderecoCandidato() {
		return idEnderecoCandidato;
	}
	public void setIdEnderecoCandidato(int idEnderecoCandidato) {
		this.idEnderecoCandidato = idEnderecoCandidato;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDsBairro() {
		return dsBairro;
	}
	public void setDsBairro(String dsBairro) {
		this.dsBairro = dsBairro;
	}
	public String getDsCidade() {
		return dsCidade;
	}
	public void setDsCidade(String dsCidade) {
		this.dsCidade = dsCidade;
	}
	
	
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getPontoRef() {
		return pontoRef;
	}
	public void setPontoRef(String pontoRef) {
		this.pontoRef = pontoRef;
	}
	public String getSgEstado() {
		return sgEstado;
	}
	public void setSgEstado(String sgEstado) {
		this.sgEstado = sgEstado;
	}
	public int getNrLogradouro() {
		return nrLogradouro;
	}
	public void setNrLogradouro(int nrLogradouro) {
		this.nrLogradouro = nrLogradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	

}
