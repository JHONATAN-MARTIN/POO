package exercicios;

import java.util.Iterator;

public class revisao {
	

	public static void main(String[] args) {
		
		System.out.println("Aula 01");
		//função inicio do Portugol
		
		int valor;
		String [] nomes = {"Laranja", "Amarelo", "Preto"};
		
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals("Preto")) {
					continue;
			}
			System.out.println(nomes[i]);
		}
	}
}
