package aula;


public class Medico {
    private String crm;
    private String nome;
    private double salario;
    private double valorConsulta;

   
    public Medico(String crm, String nome, double salario, double valorConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
        this.valorConsulta = valorConsulta;
    }

    // Métodos
    public void pagamentoDinheiro(double valorPago) {
        if (valorPago >= valorConsulta) {
            System.out.println("Pagamento em dinheiro realizado com sucesso.");
        } else {
            System.out.println("Valor pago insuficiente.");
        }
    }

    public void pagamentoPlano() {
        double valorRecebido = valorConsulta * 0.7;
        System.out.println("Pagamento via plano de saúde realizado. Valor recebido: R$" + valorRecebido);
    }

    // Getters e Setters
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
}
