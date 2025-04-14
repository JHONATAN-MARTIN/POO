package br.org.serratec;

public class TestaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Marco antônio", "cisco CCNA.", 85.0);
        Livro livro2 = new Livro("Kathy sierra", "use a cabeça java.", 98.0);

        double novoValorLivro1 = livro1.getValor() * 1.06;
        livro1.reajuste(novoValorLivro1);

        Operacao operacaoVenda = new Operacao("venda", livro1);
        Operacao operacaoEmprestimo = new Operacao("emprestimo", livro2);

        System.out.println("tipo: " + operacaoVenda.getTipo() +
                " valor: " + String.format("%.3f", operacaoVenda.getValorOperacao()) +
                " autor: " + operacaoVenda.getLivro().getAutor() +
                " titulo: " + operacaoVenda.getLivro().getTitulo());

        System.out.println("tipo: " + operacaoEmprestimo.getTipo() +
                " valor: " + String.format("%.2f", operacaoEmprestimo.getValorOperacao()) +
                " autor: " + operacaoEmprestimo.getLivro().getAutor() +
                " titulo: " + operacaoEmprestimo.getLivro().getTitulo());
    }
}
