package exercicios;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Amarildo",5000);
		Funcionario f2 = new Funcionario("Amanda",8000);
		Funcionario f3 = new Funcionario("Marcela",9000);
		
		System.out.println(f1.getNome());
		System.out.println(f2.getNome());
		System.out.println("Total Geral de funcionários: " 
		+ Funcionario.getContador());
		
		//Variáveis locais
		int  a=0;
		if  (a==0) {
			//variavel local
			int c = 10;
		}
	}

}
