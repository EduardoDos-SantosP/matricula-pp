package dominio.matricula;

import dominio.Aluno;
import dominio.Curso;

public class MatriculaCurso extends Matricula implements Model {
    private Curso curso;

    public MatriculaCurso(Aluno aluno, Curso curso) {
        super(aluno);
        this.curso = curso;
    }

    @Override
    public void persistir() {
        //Persistir matrícula do aluno no curso
    }
}
