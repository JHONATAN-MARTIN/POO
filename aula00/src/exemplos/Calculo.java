package exemplos;

public class Calculo {

	public static void main(String[] args) {
		int num1 =10, num2=50;
		
//		boolean resposta = num1==num2;
		
		String resultado;
		
		if (num1 > num2) {
			System.out.println("O maior nº é:"+num1);
		} else {
			System.out.println("O maior nº é:"+num2);
		}
		
		System.out.println(num1 > num2 ?"O maior é o primeiro:"+num1 : "o maior nº é o segundo:"+num2);

	}
}