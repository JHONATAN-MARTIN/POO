package org.serratec.exemplos;

//import org.serrtec.exemplos.PeriodoCurso;

public class TesteTurma {

	public static void main(String[] args) {
		Turma turma = new Turma("programador Full Stack", PeriodoCurso.TARDE);
	
		System.out.println("Curso: "+ turma.getCurso());
		System.out.println("Dias: "+ turma.getPeriodoCurso().getDias());
		System.out.println("Valor: "+ turma.getPeriodoCurso().getValor());
		
	
	}

}
