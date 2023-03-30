package main;

import classes.Aluno;
import classes.Disciplina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		List<Aluno> alunos = new ArrayList<>();

		for (int j = 0; j < 2; j++) {

			Aluno aluno = new Aluno();

			// PASSANDO OS DADOS PRO OBJETO ALUNO

			System.out.println("Informe o nome do Aluno: ");
			String nome = read.nextLine();

			/*
			 * System.out.println("Informe a idade do Aluno: "); int idade = read.nextInt();
			 * read.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			 * 
			 * 
			 * System.out.println("Informe o semestre do Aluno: "); String semestre =
			 * read.nextLine();
			 * 
			 * 
			 * System.out.println("Informe o curso do Aluno: "); String curso =
			 * read.nextLine();
			 */

			aluno.setNome(nome);
			// aluno.setIdade(idade);
			// aluno.setSemestre(semestre);
			// aluno.setCurso(curso);

			// PASSANDO OS DADOS PRO OBJETO DISCIPLINA
			for (int i = 0; i < 2; i++) {

				System.out.println("Informe o nome da disciplina número " + i + ": ");
				String nomeDisciplina = read.nextLine();

				System.out.println("Informe a nota da disciplina " + nomeDisciplina + ": ");
				String notaDisciplina = read.nextLine();

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno.getDisciplinas().add(disciplina);

			}

			// REMOVENDO ALGUMA DISCIPLINA

			System.out.println("Deseja remover alguma disciplina? 0(sim) / 1(não)");
			int removerDisciplina = read.nextInt();
			read.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			while (removerDisciplina == 0) {// Menu de opções

				for (int d = 0; d < aluno.getDisciplinas().size(); d++) {
					System.out.println(d + " - " + aluno.getDisciplinas().get(d).getDisciplina());
				}

				System.out.println("Informe o indice da disciplina que deseja remover ");
				int indice = read.nextInt();

				aluno.getDisciplinas().remove(indice);

				System.out.println("Disciplina " + indice + " Removida com sucesso!\n ");

				System.out.println(
						"Deseja finalizar o programa ou excluir outra disciplina? \n[1]sair [0]excluir outra disciplina");
				removerDisciplina = read.nextInt();
				read.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			}

			alunos.add(aluno);

			// PESQUISANDO ALUNO

			System.out.println("Deseja pesquisar algum aluno pelo indice? 0(sim) / 1(não)");
			int pesquisarAlu = read.nextInt();
			read.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			while (pesquisarAlu == 0) {

				for (int a = 0; a < alunos.size(); a++) {

					System.out.println(a + " - " + alunos.get(a).getNome());

				}

				System.out.println("Insira o indice que deseja pesquisar: ");
				int indiceAluno = read.nextInt();

				System.out.println("Aluno: " + alunos.get(indiceAluno).toString());

				System.out.println("Deseja pesquisar outro aluno ou sair? 0(sim) / 1(não)");
				pesquisarAlu = read.nextInt();
				read.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			}

			
			//REMOVER ALUNO
			
			System.out.println("Deseja remover algum aluno? 0(sim) / 1(não)");
			int removerAluno = read.nextInt();
			read.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			while (removerAluno == 0) {

				for (int a = 0; a < alunos.size(); a++) {

					System.out.println(a + " - " + alunos.get(a).getNome());

				}

				System.out.println("Informe o indice do aluno que deseja remover: ");
				int removerIndice = read.nextInt();
				read.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

				alunos.remove(removerIndice);

				System.out.println("Aluno " + removerIndice + " Removido com sucesso!");

				System.out.println("Deseja remover mais algum aluno? 0(sim) / 1(não)");
				removerAluno = read.nextInt();
				read.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			}

		}

		for (Aluno aluno1 : alunos) {

			System.out.println(aluno1);
		}

	}

}
