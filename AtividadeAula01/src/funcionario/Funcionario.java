package funcionario;

public class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario){
        this.setNome(nome);
        this.setSalario(salario);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public float getSalario(){
        return this.salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public double calcularInss(){
        return getSalario() * 0.11;
    }

    public double calcularVale(){
        return getSalario() * 0.06;
    }

    public double calcularLiquido(){
        return getSalario() - calcularInss() - calcularVale();
    }

    public void status(){
        System.out.println("----------- Funcionario ---------- \nNome: " + this.getNome() + "\nSalario: " + this.getSalario() +
                "\nInss: " + this.calcularInss() + "\nVale transporte: " + this.calcularVale() + "\nSalario liquido: " + this.calcularLiquido() + "\n");
    }
}
