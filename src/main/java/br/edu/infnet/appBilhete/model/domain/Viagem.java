package br.edu.infnet.appBilhete.model.domain;

import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.edu.infnet.appBilhete.model.exceptions.ModeloAviaoVazioException;
import br.edu.infnet.appBilhete.model.exceptions.NumeroAssentoOnibusException;
import br.edu.infnet.appBilhete.model.exceptions.NumeroQuartoCruzeiroException;

public abstract class Viagem {
	
	private String localEmbarque;
	private LocalDate dataEmbarque;
	private float valor;
	
	DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	//public Viagem() {
	//	dataEmbarque = LocalDateTime.now();
	//}
	
	public Viagem (String localEmbarque, String dataEmbarque, float valor) {
		//this();
		this.localEmbarque = localEmbarque;
		this.dataEmbarque = LocalDate.parse(dataEmbarque, formatoData);
		this.valor = valor;
		
	}
	
	public String obterViagem() throws ModeloAviaoVazioException, NumeroQuartoCruzeiroException, NumeroAssentoOnibusException{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Viagem da data: " + this.dataEmbarque.format(formatoData));
		sb.append(";");
		sb.append("VALOR TOTAL = " + this.calculaViagem());
		sb.append("\r\n");
		
		return sb.toString();
	}
	
	@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		
		sb.append("LOCAL DE EMBARQUE = " + this.localEmbarque);
		sb.append(";");
		sb.append("DATA DE EMBARQUE = " + this.dataEmbarque.format(formatoData));
		sb.append(";");
		sb.append("VALOR DA PASSAGEM = " + this.valor);
		
		return sb.toString();
	}
	
	public abstract float calculaViagem() throws ModeloAviaoVazioException, NumeroQuartoCruzeiroException, NumeroAssentoOnibusException;
	
		public float getValor() {
		return valor;
	}

	public String getLocalEmbarque() {
		return localEmbarque;
	}

	public LocalDate getDataEmbarque() {
		return dataEmbarque;
	}
	

}
