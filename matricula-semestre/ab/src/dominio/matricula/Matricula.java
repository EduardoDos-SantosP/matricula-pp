package dominio.matricula;

import dominio.Aluno;

public abstract class Matricula {
    private Aluno aluno;

    public Matricula(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public abstract void persistir();
}
