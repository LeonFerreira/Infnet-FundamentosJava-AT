package br.edu.infnet.appBilhete.model.domain;

import br.edu.infnet.appBilhete.model.exceptions.NumeroAssentoOnibusException;

public class Onibus extends Viagem {
	
	private String modeloOnibus;
	private int numeroAssento;
	private boolean onibusInterestadual;

	public Onibus(String localEmbarque, String dataEmbarque, float valor) {
		super(localEmbarque, dataEmbarque, valor);
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append("MODELO ÔNIBUS = " + this.modeloOnibus);
		sb.append(";");
		sb.append("NÚMERO ASSENTO = " + this.numeroAssento);
		sb.append(";");
		sb.append(this.onibusInterestadual ? "Viagem Interestadual" : "Viagem Local");
		
		return sb.toString();
	}

	@Override
	public float calculaViagem() throws NumeroAssentoOnibusException {
		if(this.numeroAssento <= 0) {
			throw new NumeroAssentoOnibusException ("Número de assento inválido.");
		}
		
		float precoViagem = 0;
		
		if (this.onibusInterestadual) {
			precoViagem = (float) 0.15;			
		}
		
		return this.getValor() + (this.getValor() * precoViagem);
	}

	public boolean isOnibusInterestadual() {
		return onibusInterestadual;
	}

	public void setOnibusInterestadual(boolean onibusInterestadual) {
		this.onibusInterestadual = onibusInterestadual;
	}

	public String getModeloOnibus() {
		return modeloOnibus;
	}

	public void setModeloOnibus(String modeloOnibus){

		this.modeloOnibus = modeloOnibus;
	}

	public int getNumeroAssento() {
		return numeroAssento;
	}

	public void setNumeroAssento(int numeroAssento) {
		this.numeroAssento = numeroAssento;
	}
	
	

}
