package exemplos;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = sc.next() ;
		
		System.out.println("Idade:");
		int idade = sc.nextInt();
		
		System.out.println("Dados: " +nome + "-"+ idade);

	}

}
