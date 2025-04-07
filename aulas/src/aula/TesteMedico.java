package aula;


public class TesteMedico {
    public static void main(String[] args) {
    	
    	
        Medico medico1 = new Medico("12345", "Ana Maria", 0, 250.0);
        Medico medico2 = new Medico("456789", "Antônio", 0, 300.0);

        
        medico1.pagamentoDinheiro(250.0);
        medico2.pagamentoDinheiro(300.0);

        
        medico1.pagamentoPlano();
        medico2.pagamentoPlano();

        
        System.out.println("Médico 1:");
        System.out.println("CRM: " + medico1.getCrm());
        System.out.println("Nome: " + medico1.getNome());
        System.out.println("Salário: R$" + medico1.getSalario());
        System.out.println("Valor da Consulta: R$" + medico1.getValorConsulta());
        System.out.println();

        
        System.out.println("Médico 2:");
        System.out.println("CRM: " + medico2.getCrm());
        System.out.println("Nome: " + medico2.getNome());
        System.out.println("Salário: R$" + medico2.getSalario());
        System.out.println("Valor da Consulta: R$" + medico2.getValorConsulta());
        System.out.println();

        
        int totalMedicos = 2; 
        System.out.println("Número Total de Médicos: " + totalMedicos);
    }
}
