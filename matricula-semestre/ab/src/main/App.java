package main;
import dominio.*;
import dominio.matricula.*;

public class App {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("aluno");
        
        Curso curso = new Curso("curso");
        
        MatriculaCurso matriculaCurso = new MatriculaCurso(aluno, curso);
        matriculaCurso.persistir();
        
        Periodo periodo = new Periodo("periodo", curso);
        
        Matricula matriculaPeriodo = new MatriculaPeriodo(aluno, matriculaCurso, periodo);
        matriculaPeriodo.persistir();
    }
}
