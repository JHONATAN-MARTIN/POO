package produto;

public class Produto {
    private String nome;
    private float preco;
    private int quantidade;

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularIcms(){
        return (this.preco * this.quantidade) * 0.12;
    }

    public void status(){
        System.out.println("Descrição: " + this.getNome() + "\nValor: " + this.getPreco() + "\nTotal: " +
                (this.getPreco() * this.getQuantidade()) + "\nIcms: " + this.calcularIcms());
    }
}
