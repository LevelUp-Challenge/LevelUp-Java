package Model;

public class AreaEstatistica {
	
	private String nome;
	private String descricao;
	private String senioridade;
	private double salarioMinimo;
	private double salarioMaximo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSenioridade() {
		return senioridade;
	}
	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}
	public double getSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(float salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	public double getSalarioMaximo() {
		return salarioMaximo;
	}
	public void setSalarioMaximo(float salarioMaximo) {
		this.salarioMaximo = salarioMaximo;
	}
	
	public double calculaMedia() {
		double mediaSalarial = (salarioMinimo + salarioMaximo) / 2;
		return mediaSalarial;
	}
	
	
	
	
	
	
	
	

}
