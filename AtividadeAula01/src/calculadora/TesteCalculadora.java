package calculadora;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculadora c = new Calculadora();
        boolean loop = true;

        while(loop){
            menuCalculadora();
            Byte opcao = scanner.nextByte();
            float n1, n2;

            switch(opcao){
                case 1:
                    System.out.print("Digite a primeira parcela: ");
                    n1 = scanner.nextFloat();
                    c.setN1(n1);

                    System.out.print("Digite a segunda parcela: ");
                    n2 = scanner.nextFloat();
                    c.setN2(n2);

                    System.out.println("A soma do valor " + c.getN1() + " + " + c.getN2() + " resulta em: " + c.soma());
                    break;
                case 2:
                    System.out.print("Digite o minuendo: ");
                    n1 = scanner.nextFloat();
                    c.setN1(n1);

                    System.out.print("Digite o subtraendo: ");
                    n2 = scanner.nextFloat();
                    c.setN2(n2);

                    System.out.println("A subtração do valor " + c.getN1() + " - " + c.getN2() + " resulta em: " + c.subtracao());
                    break;
                case 3:
                    System.out.print("Digite o fator: ");
                    n1 = scanner.nextFloat();
                    c.setN1(n1);

                    System.out.print("Digite o multiplicador: ");
                    n2 = scanner.nextFloat();
                    c.setN2(n2);

                    System.out.println("A multiplicação do valor " + c.getN1() + " x " + c.getN2() + " resulta em: " + c.multiplicacao());
                    break;
                case 4:
                    System.out.print("Digite o dividendo: ");
                    n1 = scanner.nextFloat();
                    c.setN1(n1);

                    System.out.print("Digite o divisor: ");
                    n2 = scanner.nextFloat();
                    c.setN2(n2);

                    System.out.println("A divisão do valor " + c.getN1() + " ÷ " + c.getN2() + " resulta em: " + c.divisao());
                    break;
                case 5:
                    System.out.println("Encerrando calculadora...");
                    loop = false;
                    break;
                default:
                    System.out.println("Selecione uma opção valida no menu!");
                    break;
            }
        }
    }

    private static void menuCalculadora(){
        System.out.print("------------- Menu Calculadora ------------ \n1 -> Soma \n2 -> Subtração \n3 -> Multiplicação \n4 -> Divisão " +
                "\n5 -> Encerrar calculo \nQual opção desejada: ");
    }
}
