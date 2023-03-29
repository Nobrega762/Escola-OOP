package main;

import classes.Aluno;
import classes.Disciplina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		List <Aluno> alunos = new ArrayList<>();
		
		
		
		for(int j = 0; j < 2; j++) {
		
			Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do Aluno: ");
		String nome = read.nextLine();
		
		/*System.out.println("Informe a idade do Aluno: ");
		int idade = read.nextInt();
		read.nextLine();
		
		System.out.println("Informe o semestre do Aluno: ");
		String semestre = read.nextLine();
		read.nextLine();
		
		System.out.println("Informe o curso do Aluno: ");
		String curso = read.nextLine();
		*/
		
		
		aluno.setNome(nome);
	//	aluno1.setIdade(idade);
		//aluno1.setSemestre(semestre);
		//aluno1.setCurso(curso);
		
		//DISCIPLINA
			for(int i = 0; i < 2; i++) {
			
			System.out.println("Informe o nome da disciplina número " +i + ": ");
			String nomeDisciplina = read.nextLine();
			read.nextLine();
			
			System.out.println("Informe a nota da disciplina " +nomeDisciplina + ": ");
			String notaDisciplina = read.nextLine();
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			
			
			aluno.getDisciplinas().add(disciplina);
			
		}
			System.out.println("Deseja remover alguma disciplina? 0(sim) / 1(não)");
			int removerDisciplina = read.nextInt();
			read.nextLine();
			
			
			int opcao = 0;
			while(removerDisciplina == 0) {// Menu de opções
			
			
				
				System.out.println("Informe o indice da disciplina que deseja remover ");
				int indice = read.nextInt();
				
				aluno.getDisciplinas().remove(indice);
				
				System.out.println("Disciplina " + indice + " Removida com sucesso!\n ");
				
				System.out.println("Deseja finalizar o programa ou excluir outra disciplina? \n[1]sair [0]excluir outra disciplina");
				opcao = read.nextInt();
				
				if(opcao == 1) {
					System.out.println("Saindo do sistema!");
					break;
				}
				
			}
			
			
			alunos.add(aluno);
		}
		
			for (Aluno aluno1 : alunos) {
				
				System.out.println(aluno1);
			}
		
		
		
		

		
	}

}
