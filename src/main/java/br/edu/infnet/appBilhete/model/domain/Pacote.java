package br.edu.infnet.appBilhete.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pacote {
	
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	private Passageiro passageiro;
	
	public Pacote() {
		data = LocalDateTime.now();
		
	}
	
	public Pacote (String descricao, boolean web) {
		this();
		this.descricao = descricao;
		this.web = web;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return String.format("%s;%s;%s;%s", this.descricao, this.data.format(formatoData), this.web ? "Compra realizada via Web" : "Compra realizada no Guichê", this.passageiro.toString()); //int = %d; float = %.2f
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
}
