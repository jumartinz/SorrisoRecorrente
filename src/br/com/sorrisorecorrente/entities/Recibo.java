package br.com.sorrisorecorrente.entities;

public class Recibo {

    private int idRecibo;
    private int numero;
    private String dataEmissao;
    private Doacao doacao;

    public Recibo() {
    }

    public Recibo(int idRecibo, int numero, String dataEmissao) {
        this.idRecibo = idRecibo;
        this.numero = numero;
        this.dataEmissao = dataEmissao;
    }

    public int getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(int idRecibo) {
        this.idRecibo = idRecibo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Doacao getDoacao() {
        return doacao;
    }

    public void setDoacao(Doacao doacao) {
        this.doacao = doacao;
    }

    @Override
    public String toString() {
        return "\n\nRecibo{" +
                "\nidRecibo=" + idRecibo +
                "\nnumero=" + numero +
                "\ndataEmissao='" + dataEmissao + '\'' +
                "\ndoacao=" + doacao;
    }
}
