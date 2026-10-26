package br.com.sorrisorecorrente.entities;

public class Score {

    private int idScore;
    private double valor;
    private String nivel;
    private String dataCalculo;

    public Score() {
    }

    public Score(int idScore, double valor, String nivel, String dataCalculo) {
        this.idScore = idScore;
        this.valor = valor;
        this.nivel = nivel;
        this.dataCalculo = dataCalculo;
    }

    public int getIdScore() {
        return idScore;
    }

    public void setIdScore(int idScore) {
        this.idScore = idScore;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) { valor = valor;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDataCalculo() {
        return dataCalculo;
    }

    public void setDataCalculo(String dataCalculo) {
        this.dataCalculo = dataCalculo;
    }

    @Override
    public String toString() {
        return "\n\nScore{" +
                "\nidScore=" + idScore +
                "\nvalor=" + valor +
                "\nnivel='" + nivel + '\'' +
                "\ndataCalculo='" + dataCalculo;
    }
}
