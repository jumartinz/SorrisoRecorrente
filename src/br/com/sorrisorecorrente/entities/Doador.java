package br.com.sorrisorecorrente.entities;

public class Doador {

    private int idDoador;
    private String nome;
    private String cpf;
    private String cnpj;
    private String email;
    private String telefone;
    private String dataCadastro;
    private Endereco endereco;

    public Doador() {
    }

    public Doador(int idDoador, String nome, String cpf, String cnpj, String email, String telefone, String dataCadastro) {
        this.idDoador = idDoador;
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
    }

    public int getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(int idDoador) {
        this.idDoador = idDoador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\n\nDoador{" +
                "\nidDoador=" + idDoador +
                "\nnome='" + nome + '\'' +
                "\ncpf='" + cpf + '\'' +
                "\ncnpj='" + cnpj + '\'' +
                "\nemail='" + email + '\'' +
                "\ntelefone='" + telefone + '\'' +
                "\ndataCadastro='" + dataCadastro + '\'' +
                "\nendereco=" + endereco;
    }
}
