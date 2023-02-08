package dominio.matricula;

import dominio.Aluno;
import dominio.Periodo;

public class MatriculaPeriodo extends Matricula implements Model {
    private MatriculaCurso matriculaCurso;
    private Periodo periodo;

    public MatriculaPeriodo(Aluno aluno, MatriculaCurso matriculaCurso, Periodo periodo) {
        super(aluno);
        this.matriculaCurso = matriculaCurso;
        this.periodo = periodo;
    }

    @Override
    public void persistir() {
        /*Persistir mátricula do aluno em um determinado período 
        de determinado curso*/
    }   
}
