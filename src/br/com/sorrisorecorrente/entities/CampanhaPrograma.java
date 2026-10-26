package br.com.sorrisorecorrente.entities;

public class CampanhaPrograma {

    private double percentualDistribuido;
    private String datVinculacao;
    private Campanha campanha;
    private Programa programa;

    public double getPercentualDistribuido() {
        return percentualDistribuido;
    }

    public void setPercentualDistribuido(double percentualDistribuido) {
        this.percentualDistribuido = percentualDistribuido;
    }

    public String getDatVinculacao() {
        return datVinculacao;
    }

    public void setDatVinculacao(String datVinculacao) {
        this.datVinculacao = datVinculacao;
    }

    public Campanha getCampanha() {
        return campanha;
    }

    public void setCampanha(Campanha campanha) {
        this.campanha = campanha;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
}
