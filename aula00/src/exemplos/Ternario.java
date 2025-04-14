package exemplos;

public class Ternario {

	public static void main(String[] args) {
		int mes = 2;
		String resposta;
		double resultado;

		resposta = (mes == 1 ? "Janeiro" : mes == 2 ? "Fevereiro" : mes == 3 ? "Março" : "Outros");

		System.out.println(resposta);

		double salario = 5500.89;

		//resultado = salario > 5000 ? salario * 1.05 : salario * 1.10;
		 System.out.println("Resultado:" + Double.toString(salario > 5000 ? salario * 1.05 : salario * 1.10));

	}

}