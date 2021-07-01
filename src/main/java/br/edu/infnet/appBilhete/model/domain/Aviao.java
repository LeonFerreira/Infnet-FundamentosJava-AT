package br.edu.infnet.appBilhete.model.domain;

import br.edu.infnet.appBilhete.model.exceptions.ModeloAviaoVazioException;

public class Aviao extends Viagem {
	
	private String modeloAviao;
	private int numeroAssento;
	private boolean aviaoInternacional;	

	public Aviao(String localEmbarque, String dataEmbarque, float valor) {
		super(localEmbarque, dataEmbarque, valor);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append("MODELO AVIÃO = " + this.modeloAviao);
		sb.append(";");
		sb.append("NÚMERO ASSENTO = " + this.numeroAssento);
		sb.append(";");
		sb.append(this.aviaoInternacional ? "Voo Internacional" : "Voo Nacional");
		
		return sb.toString();
	}	
	
	@Override
	public float calculaViagem() throws ModeloAviaoVazioException {
		
		if (this.modeloAviao.isBlank()) {
			throw new ModeloAviaoVazioException ("Nenhum modelo de avião foi adicionado");
		}
		
		float precoViagem = 0;		
		if (this.aviaoInternacional) {
			precoViagem = (float) 0.25;			
		}
		
		return this.getValor() + (this.getValor() * precoViagem);
	}

	public String getModeloAviao() {
		return modeloAviao;
	}

	public void setModeloAviao(String modeloAviao){
		this.modeloAviao = modeloAviao;		
	}

	public int getNumeroAssento() {
		return numeroAssento;
	}

	public void setNumeroAssento(int numeroAssento) {
		this.numeroAssento = numeroAssento;
	}

	public boolean isAviaoInternacional() {
		return aviaoInternacional;
	}

	public void setAviaoInternacional(boolean aviaoInternacional) {
		this.aviaoInternacional = aviaoInternacional;
	}
	
	
	

}
