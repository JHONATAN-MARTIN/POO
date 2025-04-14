package produto;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);

        while (loop) {
            System.out.println("Digite a descrição do produto:");
            String desc = scanner.next();

            System.out.println("Digite o valor do produto:");
            float val = scanner.nextFloat();

            System.out.println("Digite a quantidade do produto:");
            int qnt = scanner.nextInt();

            Produto p = new Produto(desc, val, qnt);

            p.status();

            System.out.println("Deseja continuar? (true/false)");
            loop = scanner.nextBoolean();
        }
    }
}
