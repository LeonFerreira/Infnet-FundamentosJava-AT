package br.edu.infnet.appBilhete.model.domain;

public class Passageiro {
	
	private String nome;
	private String email;
	private String telefone;
	private int idade;
	
	
	public Passageiro (String nome, String email, String telefone, int idade) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		
		sb.append(this.nome);
		sb.append(";");
		sb.append(this.email);
		sb.append(";");
		sb.append(this.telefone);
		sb.append(";");
		sb.append(this.idade + " anos de idade.");
		
		return sb.toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	

}
