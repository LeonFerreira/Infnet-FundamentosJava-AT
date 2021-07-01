package br.edu.infnet.appBilhete.model.tests;

import br.edu.infnet.appBilhete.model.domain.Pacote;
import br.edu.infnet.appBilhete.model.domain.Passageiro;

public class PacoteTeste {
	
	public static void main(String[] args) {
		
		Passageiro passageiroP1 = new Passageiro("Leonardo Ferreira", "leo@sim.com", "21982736485", 25);
		
		Pacote p1 = new Pacote("Pacote número 1", false);
		p1.setPassageiro(passageiroP1);
		System.out.println("Pacote: " + p1);
	}

}
