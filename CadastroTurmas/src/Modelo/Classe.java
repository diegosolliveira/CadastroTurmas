package Modelo;

public class Classe {
	
	private Aluno aluno;
	private Aluno matriculaA;
	private Professor professor;
	private Professor matriculaP;
	private Disciplina disciplina;
	private PeriodoLetivo periodoLetivo;
	
	public Classe(Aluno aluno, Aluno matriculaA, Professor professor, Professor matriculaP, Disciplina disciplina,
			PeriodoLetivo periodoLetivo) {
		super();
		this.aluno = aluno;
		this.matriculaA = matriculaA;
		this.professor = professor;
		this.matriculaP = matriculaP;
		this.disciplina = disciplina;
		this.periodoLetivo = periodoLetivo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Aluno getMatriculaA() {
		return matriculaA;
	}

	public void setMatriculaA(Aluno matriculaA) {
		this.matriculaA = matriculaA;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Professor getMatriculaP() {
		return matriculaP;
	}

	public void setMatriculaP(Professor matriculaP) {
		this.matriculaP = matriculaP;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public PeriodoLetivo getPeriodoLetivo() {
		return periodoLetivo;
	}

	public void setPeriodoLetivo(PeriodoLetivo periodoLetivo) {
		this.periodoLetivo = periodoLetivo;
	}

}
