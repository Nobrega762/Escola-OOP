package classes;

import java.util.ArrayList;
import java.util.List;

import metodosEstaticos.SituacaoAluno;

public class Aluno {
	private String nome;
	private int idade;
	private String semestre;
	private String curso;
	
	List <Disciplina> disciplinas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	
	public double media() {
		double somaMedia = 0;
		for (Disciplina disciplina : disciplinas) {
			somaMedia += disciplina.getNota();
		}
		
		
		return somaMedia /disciplinas.size();
		
	}
	
	
	public String situacaoAluno() {
		if(media()>= 7) {
			return SituacaoAluno.APROVADO;
		}else if(media() >= 5) {
			return  SituacaoAluno.RECUPERACAO;
		}else {
			return SituacaoAluno.REPROVADO;
		}
	}
	
	 
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", semestre=" + semestre + ", curso=" + curso
				+ ", disciplinas=" + disciplinas + " Media Final: " + media() + " Situação: " + situacaoAluno() + "]";
	}
	
	
	
	
}
