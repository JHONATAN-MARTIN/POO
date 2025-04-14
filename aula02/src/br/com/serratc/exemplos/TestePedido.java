package br.com.serratc.exemplos;

import java.time.LocalDate;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(123,LocalDate.of(2025, 02, 03), 2000.0,2);
		
		System.out.println("Numero Pedido: " + pedido1.getNumero() + "Total: " + pedido1.getTotal());

	}

}