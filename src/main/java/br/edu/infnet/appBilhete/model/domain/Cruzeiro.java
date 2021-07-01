package br.edu.infnet.appBilhete.model.domain;

import br.edu.infnet.appBilhete.model.exceptions.NumeroQuartoCruzeiroException;

public class Cruzeiro extends Viagem {
	
	private String modeloCruzeiro;
	private int numeroQuarto;
	private boolean cruzeiroInternacional;

	public Cruzeiro(String localEmbarque, String dataEmbarque, float valor) {
		super(localEmbarque, dataEmbarque, valor);
		
	}
	
	@Override
	public String toString() {		
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append("MODELO CRUZEIRO = " + this.modeloCruzeiro);
		sb.append(";");
		sb.append("NÚMERO DO QUARTO = " + this.numeroQuarto);
		sb.append(";");
		sb.append(this.cruzeiroInternacional ? "Cruzeiro Internacional" : "Cruzeiro Nacional");
		
		return sb.toString();
	}

	@Override
	public float calculaViagem() throws NumeroQuartoCruzeiroException {
		if(this.numeroQuarto <= 0) {
			throw new NumeroQuartoCruzeiroException ("Número de quarto do Cruzeiro inválido.");
		}
		
		float precoViagem = 0;
		
		if (this.cruzeiroInternacional) {
			precoViagem = (float) 0.40;			
		}
		
		return this.getValor() + (this.getValor() * precoViagem);
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public String getModeloCruzeiro() {
		return modeloCruzeiro;
	}

	public void setModeloCruzeiro(String modeloCruzeiro){

		
		this.modeloCruzeiro = modeloCruzeiro;
	}

	public boolean isCruzeiroInternacional() {
		return cruzeiroInternacional;
	}

	public void setCruzeiroInternacional(boolean cruzeiroInternacional) {
		this.cruzeiroInternacional = cruzeiroInternacional;
	}
	
	

}
