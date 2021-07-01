package br.edu.infnet.appBilhete.model.tests;

import br.edu.infnet.appBilhete.model.domain.Aviao;
import br.edu.infnet.appBilhete.model.domain.Cruzeiro;
import br.edu.infnet.appBilhete.model.domain.Onibus;

public class ViagemTeste {
	
	public static void main(String[] args) {
		
		Aviao a1 = new Aviao("Congonhas", "10/02/2022", 100);
		//a1.setModeloAviao("Boing");
		a1.setNumeroAssento(12);
		a1.setAviaoInternacional(true);		
		System.out.println("Avião: " + a1);
		
		Cruzeiro c1 = new Cruzeiro("Cruzeiro Porto Rio", "10/02/2022", 2000);
		//c1.setModeloCruzeiro("Cruzeiro Sagaz");
		c1.setNumeroQuarto(34);
		c1.setCruzeiroInternacional(false);		
		System.out.println("Cruzeiro: " + c1);
		
		Onibus o1 = new Onibus("Onibus Novo Rio", "10/02/2023", 500);
		//o1.setModeloOnibus("Máximo Viação");
		o1.setNumeroAssento(23);
		o1.setOnibusInterestadual(false);
		System.out.println("Onibus: " + o1);
		
	}

}