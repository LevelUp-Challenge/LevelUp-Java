package Model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa extends Login{
	private String nome;
	private String idade;
	private LocalDate dataNasc;
	private int telefone;
	private String email;
	private String sexo;
	private int cpf;
	
	public Pessoa() {
		
	}
	
	
	public Pessoa(String nome, String idade, LocalDate dataNasc, int telefone, String email, String endereco, String login, String senha, int id) {
		
		this.nome = nome;
		this.idade = idade;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.email = email;
		
		super.setLogin(login);
		super.setSenha(senha);
		super.setId(id);
	}
	
	
	


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int calculaId() {
		int userId = super.getId() + 1;
		return userId;
	
	}
	public Period calculaIdade() {
		LocalDate dataA = LocalDate.now();
		Period idade = Period.between(dataNasc, dataA);
		return idade;
		
	}
}
