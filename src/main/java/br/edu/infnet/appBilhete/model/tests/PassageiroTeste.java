package br.edu.infnet.appBilhete.model.tests;

import br.edu.infnet.appBilhete.model.domain.Passageiro;

public class PassageiroTeste {
	
	public static void main(String[] args) {
		
		Passageiro p1 = new Passageiro("Leonardo Ferreira", "leo@sim.com", "21982736485", 25);
		System.out.println("Passageiro: " + p1);		
		
	}

}
