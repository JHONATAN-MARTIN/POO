package br.org.serratec;

public interface Conta {
	//na interface não precisa declarar o public, static e final na constante por ser implicito.
	public static final Double TAXAS = 10.;
	
	public Boolean saque(Double valor);
	public void deposito(Double valor);
	

}
