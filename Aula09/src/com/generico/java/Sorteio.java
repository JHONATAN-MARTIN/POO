package com.generico.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sorteio<T> {
    private List<T> lista;
    private Random random;

    public Sorteio() {
        this.lista = new ArrayList<>();
        this.random = new Random();
    }

    public void adicionar(T... elementos) {
        this.lista.addAll(Arrays.asList(elementos));
    }

    public void remover(T elemento){
        this.lista.remove(elemento);
    }

    public T sortear(){
        int pos  = this.random.nextInt(this.lista.size());
        return lista.get(pos);
    }
}
