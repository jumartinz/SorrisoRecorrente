package br.com.sorrisorecorrente.entities;

public class Campanha {

    private int idCampanha;
    private String nome;
    private String dataInicio;
    private String dataFim;
    private double meta;
    private double percentualDistribuido;

    public int getIdCampanha() {
        return idCampanha;
    }

    public void setIdCampanha(int idCampanha) {
        this.idCampanha = idCampanha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    public double getPercentualDistribuido() {
        return percentualDistribuido;
    }

    public void setPercentualDistribuido(double percentualDistribuido) {
        this.percentualDistribuido = percentualDistribuido;
    }
}
