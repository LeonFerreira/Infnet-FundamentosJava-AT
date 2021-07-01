package br.edu.infnet.appBilhete.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.edu.infnet.appBilhete.model.domain.Aviao;
import br.edu.infnet.appBilhete.model.domain.Cruzeiro;
import br.edu.infnet.appBilhete.model.domain.Onibus;
import br.edu.infnet.appBilhete.model.domain.Pacote;
import br.edu.infnet.appBilhete.model.domain.Passageiro;
import br.edu.infnet.appBilhete.model.exceptions.ModeloAviaoVazioException;
import br.edu.infnet.appBilhete.model.exceptions.NumeroAssentoOnibusException;
import br.edu.infnet.appBilhete.model.exceptions.NumeroQuartoCruzeiroException;

public class AppTeste {

	public static void main(String[] args) {		
		
		String dir = "D:/Ferramentas/eclipse-workspace/";
		String arq = "pacotes.txt";
		
		try {			
	
			try {
				FileWriter fileW = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				FileReader file = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();				
				
				while(linha != null) {
					
					String[] campos = linha.split(";");
					

						switch (campos[0].toUpperCase()) {
						case "0":
							Passageiro passageiroP1 = new Passageiro(campos[3], campos[4], campos[5], Integer.valueOf(campos[6]));
							
							Pacote p1 = new Pacote("Pacote número 1", false);
							p1.setPassageiro(passageiroP1);
							System.out.println("Pacote: " + p1);
							break;
							
						case "A":
							Aviao a1 = new Aviao(campos[1], campos[2], Float.valueOf(campos[3]));
							a1.setModeloAviao(campos[4]);
							a1.setNumeroAssento(Integer.valueOf(campos[5]));
							a1.setAviaoInternacional(Boolean.valueOf(campos[6]));
							
							escrita.write(a1.obterViagem());
							System.out.println("Avião: " + a1);
							break;
							
						case "C":
							Cruzeiro c1 = new Cruzeiro(campos[1], campos[2], Float.valueOf(campos[3]));
							c1.setModeloCruzeiro(campos[4]);
							c1.setNumeroQuarto(Integer.valueOf(campos[5]));
							c1.setCruzeiroInternacional(Boolean.valueOf(campos[6]));
							
							escrita.write(c1.obterViagem());
							System.out.println("Cruzeiro: " + c1);
							break;	
							
						case "O":
							Onibus o1 = new Onibus(campos[1], campos[2], Float.valueOf(campos[3]));
							o1.setModeloOnibus(campos[4]);
							o1.setNumeroAssento(Integer.valueOf(campos[5]));
							o1.setOnibusInterestadual(Boolean.valueOf(campos[6]));
							
							escrita.write(o1.obterViagem());
							System.out.println("Onibus: " + o1);
							break;

						default:
							System.out.println("ERROU");
							break;
						}					

					linha = leitura.readLine();
				}
				file.close();
				leitura.close();
				escrita.close();
				fileW.close();
				
			} catch (ModeloAviaoVazioException | NumeroQuartoCruzeiroException | NumeroAssentoOnibusException | IOException e) {
				System.out.println(e.getMessage());
			}
				
				

		} finally {
			System.out.println("Processamento finalizado. Arquivo está em " + dir + "out_" + arq);
		}
		
	}
	
}
