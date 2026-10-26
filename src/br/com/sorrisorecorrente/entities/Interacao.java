package br.com.sorrisorecorrente.entities;

public class Interacao {

    private int idInteracao;
    private String canal;
    private String data;
    private String assunto;
    private String colaboradorResponsavel;
    private Doador doador;

    public Interacao() {
    }

    public Interacao(int idInteracao, String canal, String data, String assunto, String colaboradorResponsavel) {
        this.idInteracao = idInteracao;
        this.canal = canal;
        this.data = data;
        this.assunto = assunto;
        this.colaboradorResponsavel = colaboradorResponsavel;
    }

    public int getIdInteracao() {
        return idInteracao;
    }

    public void setIdInteracao(int idInteracao) {
        this.idInteracao = idInteracao;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getColaboradorResponsavel() {
        return colaboradorResponsavel;
    }

    public void setColaboradorResponsavel(String colaboradorResponsavel) {
        this.colaboradorResponsavel = colaboradorResponsavel;
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    @Override
    public String toString() {
        return "\n\nInteracao{" +
                "\nidInteracao=" + idInteracao +
                "\ncanal='" + canal + '\'' +
                "\ndata='" + data + '\'' +
                "\nassunto='" + assunto + '\'' +
                "\ncolaboradorResponsavel='" + colaboradorResponsavel + '\'' +
                "\ndoador=" + doador;
    }
}
