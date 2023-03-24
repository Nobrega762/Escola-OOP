package main;

import classes.Aluno;
import classes.Disciplina;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Aluno alu1 = new Aluno();
		
		alu1.setNome("Renato");
		alu1.setIdade(25);
		alu1.setSemestre("5°");
		alu1.setCurso("ADS");
		
		//DISCIPLINA
			for(int i = 0; i < 3; i++) {
			
			System.out.println("Informe o nome da disciplina número " +i + ": ");
			String nomeDisciplina = read.nextLine();
			
			System.out.println("Informe a nota da disciplina " +nomeDisciplina + ": ");
			String notaDisciplina = read.nextLine();
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			
			
			alu1.getDisciplinas().add(disciplina);
			
		}
			System.out.println("Deseja remover alguma disciplina? 0(sim) / 1(não)");
			int removerDisciplina = read.nextInt();
			
			if(removerDisciplina == 0) {
				
				System.out.println("Informe o indice da disciplina que deseja remover ");
				int indice = read.nextInt();
				
				alu1.getDisciplinas().remove(indice);
				
				System.out.println("Disciplina " + indice + "Removida com sucesso! ");
			}
			
		System.out.println(alu1);
		
		
		

		
	}

}
