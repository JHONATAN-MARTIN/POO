package br.org.serratec.teste;
import br.org.serratec.endereco.*;
import br.org.serratec.contato.*;

public class App {

	public static void main(String[] args){
		Estado e1 = new Estado("Rio de Janeiro", "rj");
		Cidade c1 = new Cidade("Petrópolis", e1);
		Endereco end1 = new Endereco("Bingen", "Centro", "25645-470", c1);
		Telefone[] telefones = new Telefone[2];

		telefones[0] = new Telefone("2222-2222");
		telefones[1] = new Telefone("3333-3333");

		Contato con1 = new Contato("Ana", telefones, end1);

		System.out.println(con1);
		con1.mostrarTelefones();
	}
}