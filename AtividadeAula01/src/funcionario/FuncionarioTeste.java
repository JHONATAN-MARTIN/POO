package funcionario;

public class FuncionarioTeste {
    public static void main(String[] args){
        Funcionario n1 = new Funcionario("Elton Kasesky", 3000);
        Funcionario n2 = new Funcionario("Ana Julia", 5000);

        n1.status();
        n2.status();
    }
}
