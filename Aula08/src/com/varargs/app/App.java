package com.varargs.app;

public class App {
    public static void main(String[] args) {
        int total = somar(2, 3, 4, 5);
        System.out.println("Total: " + total);

        int total2 = somar2(10, 20, 30, 40, 60);
        System.out.println("total2: " + total2);
    }

    //VarArgs
    static int somar(int... numeros){
        int soma = 0;

        for(int num : numeros){
            soma += num;
        }
        return soma;
    }

    static int somar2(int numero, int... numeros){
        int soma = 0;

        for(int num : numeros){
            soma += num;
        }
        return soma * numero;
    }
}
