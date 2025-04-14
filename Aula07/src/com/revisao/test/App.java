package com.revisao.test;

public class App {
    public static void main(String[] args){
        Integer[] array = {10, 20, 30, 40, 50};
        String text = null;
        int a = 10;
        int b = 0;

        try {
            //System.out.println(array[0] / b);
            //System.out.println(array[5] / a);
            System.out.println(text.equals("sei lá"));
        } catch(ArithmeticException e){
            System.out.println("Divisão por 0 (zero)!");
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Acesso ao indice no array invalido!");
            e.printStackTrace();
        } catch(NullPointerException e){
            System.out.println("O texto referenciado é nulo!");
            e.printStackTrace();
        }
    }
}