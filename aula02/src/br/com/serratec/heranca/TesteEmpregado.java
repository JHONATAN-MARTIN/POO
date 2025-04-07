package br.com.serratec.heranca;

public class TesteEmpregado {
	
	public static void main(String[] args) {
		
		//Polimorfismo só existe em herança
		Gerente gerente = new Gerente("Carla", "c@gmail", "2323", 5500., 10);
		
		Diretor diretor = new Diretor("Carlos", "c@@gmail", "2121", 9000., "ADM");
		
		System.out.println(gerente.getNome() + " - " + gerente.getEmail());
		System.out.println(gerente.getNumEmpregadoGerenciados());
		
		gerente.aumentarSalario(10.);
		diretor.aumentarSalario(10.);
		
		System.out.println("Novo Salário: " + gerente.getSalario());
		System.out.println("Novo Salário: " + diretor.getSalario());
		
		System.out.println(gerente.toString());
		System.out.println(diretor.toString());
		
		System.out.println(gerente.toString());
		System.out.println(diretor);
	
		
	}

	
	
}
