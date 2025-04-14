package br.org.serratec;

public class Operacao {
    private String tipo; 
    private double valorOperacao; 
    private Livro livro; 

    public Operacao(String tipo, Livro livro) {
        this.tipo = tipo;
        this.livro = livro;
        calcularValorOperacao(); 
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
        calcularValorOperacao(); 
    }

    public void venderLivro() {
        if ("venda".equalsIgnoreCase(tipo)) {
            valorOperacao = livro.getValor() * 1.09; 
        }
    }

    public void emprestarLivro(double taxaEmprestimo) {
        if ("emprestimo".equalsIgnoreCase(tipo)) {
            valorOperacao = (livro.getValor() * 0.02) + taxaEmprestimo;
        }
    }

    private void calcularValorOperacao() {
        if ("venda".equalsIgnoreCase(tipo)) {
            venderLivro();
        } else if ("emprestimo".equalsIgnoreCase(tipo)) {
            emprestarLivro(2.8);
        }
    }

    @Override
    public String toString() {
        return "Operação:" + "tipo: " + tipo + ", valorOperação: " + valorOperacao + ", livro: " + livro;
    }
}
