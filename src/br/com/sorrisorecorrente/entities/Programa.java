package br.com.sorrisorecorrente.entities;

public class Programa {

    private int idPrograma;
    private String nome;
    private String publicoAlvo;
    private String descricao;

    public Programa() {
    }

    public Programa(int idPrograma, String nome, String publicoAlvo, String descricao) {
        this.idPrograma = idPrograma;
        this.nome = nome;
        this.publicoAlvo = publicoAlvo;
        this.descricao = descricao;
    }

    public int getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "\n\nPrograma{" +
                "\nidPrograma=" + idPrograma +
                "\nnome='" + nome + '\'' +
                "\npublicoAlvo='" + publicoAlvo + '\'' +
                "\ndescricao='" + descricao;
    }
}
