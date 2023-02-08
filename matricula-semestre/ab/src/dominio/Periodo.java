package dominio;

public class Periodo {
    private String descricao;
    private Curso curso;

    public Periodo(String descricao, Curso curso) {
        this.descricao = descricao;
        this.curso = curso;
    }
}
