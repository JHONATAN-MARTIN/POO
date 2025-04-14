package br.org.serratec.contato;

import br.org.serratec.endereco.Cidade;
import br.org.serratec.endereco.Endereco;

import java.util.Arrays;

public class Contato {
	private String nome;
	private Telefone[] telefones;
	private Endereco endereco;

	public Contato(String nome, Telefone[] telefones, Endereco endereco) {
		this.nome = nome;
		this.telefones = telefones;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Contato{" +
				"nome='" + nome + '\'' +
				", telefones=" + Arrays.toString(telefones) +
				", endereco=" + endereco +
				'}';
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	public String getNome() {
		return nome;
	}
	
	public void mostrarTelefones () {
		for (Telefone telefone : telefones) {
			System.out.println(telefone);
		}
	}
}
