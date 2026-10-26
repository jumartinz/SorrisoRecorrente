package br.com.sorrisorecorrente.entities;

public class CampanhaPrograma {

    private double percentualDistribuido;
    private String dataVinculacao;
    private Campanha campanha;
    private Programa programa;

    public CampanhaPrograma() {
    }

    public CampanhaPrograma(double percentualDistribuido, String dataVinculacao) {
        this.percentualDistribuido = percentualDistribuido;
        this.dataVinculacao = dataVinculacao;
    }

    public double getPercentualDistribuido() {
        return percentualDistribuido;
    }

    public void setPercentualDistribuido(double percentualDistribuido) {
        this.percentualDistribuido = percentualDistribuido;
    }

    public String getDatVinculacao() {
        return dataVinculacao;
    }

    public void setDatVinculacao(String datVinculacao) {
        this.dataVinculacao = datVinculacao;
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

    @Override
    public String toString() {
        return "\n\nCampanhaPrograma{" +
                "\npercentualDistribuido=" + percentualDistribuido +
                "\ndatVinculacao='" + dataVinculacao + '\'' +
                "\ncampanha=" + campanha +
                "\nprograma=" + programa;
    }
}
