package br.com.sorrisorecorrente.entities;

public class Doacao {

    private int idDoacao;
    private double valor;
    private String data;
    private String formaPagamento;
    private Doador doador;
    private Programa programa;
    private Recibo recibo;

    public Doacao() {
    }

    public Doacao(int idDoacao, double valor, String data, String formaPagamento) {
        this.idDoacao = idDoacao;
        this.valor = valor;
        this.data = data;
        this.formaPagamento = formaPagamento;
    }

    public int getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(int idDoacao) {
        this.idDoacao = idDoacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }

    @Override
    public String toString() {
        return "\n\nDoacao{" +
                "\nidDoacao=" + idDoacao +
                "\nvalor=" + valor +
                "\ndata='" + data + '\'' +
                "\nformaPagamento='" + formaPagamento + '\'' +
                "\ndoador=" + doador +
                "\nprograma=" + programa +
                "\nrecibo=" + recibo;
    }
}
