package br.com.sorrisorecorrente.entities;

public class Colaborador {

    private int idColaborador;
    private String nome;
    private String email;
    private String cargo;
    private Score score;

    public Colaborador() {
    }

    public Colaborador(int idColaborador, String nome, String email, String cargo) {
        this.idColaborador = idColaborador;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }

    public int getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "\n\nColaborador{" +
                "\nidColaborador=" + idColaborador +
                "\nnome='" + nome + '\'' +
                "\nemail='" + email + '\'' +
                "\ncargo='" + cargo + '\'' +
                "\nscore=" + score;
    }
}
