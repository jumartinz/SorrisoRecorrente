package br.com.sorrisorecorrente.main;

import br.com.sorrisorecorrente.entities.*;

public class TesteSistema {

    public static void main(String[] args) {

        Endereco objEndereco = new Endereco();
        Doador objDoador = new Doador();
        Programa objPrograma = new Programa();
        Campanha objCampanha = new Campanha();
        CampanhaPrograma objCampanhaPrograma = new CampanhaPrograma();
        Doacao objDoacao = new Doacao();
        Recibo objRecibo = new Recibo();
        Score objScore = new Score();
        Colaborador objColaborador = new Colaborador();
        Interacao objInteracao = new Interacao();

        objEndereco.setIdEndereco(1);
        objEndereco.setLogradouro("Avenida Paulista");
        objEndereco.setNumero(1106);
        objEndereco.setComplemento("7º andar");
        objEndereco.setCep("01311-000");
        objEndereco.setCidade("São Paulo");
        objEndereco.setEstado("SP");
        objEndereco.setPais("Brasil");

        objDoador.setIdDoador(10);
        objDoador.setNome("Maria Souza");
        objDoador.setCpf("123.456.789-00");
        objDoador.setCnpj("");
        objDoador.setEmail("maria@email.com");
        objDoador.setTelefone("(11) 99999-0000");
        objDoador.setDataCadastro("2026-10-26");
        objDoador.setEndereco(objEndereco);

        objPrograma.setIdPrograma(1);
        objPrograma.setNome("Dentista do Bem");
        objPrograma.setPublicoAlvo("Jovens de 11 a 17 anos em situação de vulnerabilidade");
        objPrograma.setDescricao("Tratamento odontológico gratuito feito por dentistas voluntários");

        objCampanha.setIdCampanha(100);
        objCampanha.setNome("Sorriso para Todos");
        objCampanha.setDataInicio("2026-11-01");
        objCampanha.setDataFim("2026-12-31");
        objCampanha.setMeta(1000.0);
        objCampanha.setPercentualDistribuido(100.0);

        objCampanhaPrograma.setPercentualDistribuido(100.0);
        objCampanhaPrograma.setDatVinculacao("2026-11-01");
        objCampanhaPrograma.setCampanha(objCampanha);
        objCampanhaPrograma.setPrograma(objPrograma);

        objDoacao.setIdDoacao(500);
        objDoacao.setValor(30.0);
        objDoacao.setData("2026-10-26");
        objDoacao.setFormaPagamento("Pix");
        objDoacao.setDoador(objDoador);
        objDoacao.setPrograma(objPrograma);
        objDoacao.setRecibo(objRecibo);

        objRecibo.setIdRecibo(2026001);
        objRecibo.setNumero(2026001);
        objRecibo.setDataEmissao("2026-10-26");
        objRecibo.setDoacao(objDoacao);

        objScore.setIdScore(1);
        objScore.setValor(82.5);
        objScore.setNivel("");
        objScore.setDataCalculo("2026-10-26");

        objColaborador.setIdColaborador(7);
        objColaborador.setNome("Carlos Lima");
        objColaborador.setEmail("carlos@turmadobem.org");
        objColaborador.setCargo("Analista de Relacionamento");
        objColaborador.setScore(objScore);

        objInteracao.setIdInteracao(900);
        objInteracao.setCanal("chatbot");
        objInteracao.setData("2026-10-26");
        objInteracao.setAssunto("Dúvida sobre doação mensal");
        objInteracao.setColaboradorResponsavel(objColaborador.getNome());
        objInteracao.setDoador(objDoador);

        System.out.println("=== ENDERECO ===");
        System.out.println("Id: " + objEndereco.getIdEndereco());
        System.out.println("Logradouro: " + objEndereco.getLogradouro());
        System.out.println("Número: " + objEndereco.getNumero());
        System.out.println("Complemento: " + objEndereco.getComplemento());
        System.out.println("CEP: " + objEndereco.getCep());
        System.out.println("Cidade: " + objEndereco.getCidade());
        System.out.println("Estado: " + objEndereco.getEstado());
        System.out.println("País: " + objEndereco.getPais());

        System.out.println("\n=== DOADOR ===");
        System.out.println("Id: " + objDoador.getIdDoador());
        System.out.println("Nome: " + objDoador.getNome());
        System.out.println("CPF: " + objDoador.getCpf());
        System.out.println("CNPJ: " + objDoador.getCnpj());
        System.out.println("E-mail: " + objDoador.getEmail());
        System.out.println("Telefone: " + objDoador.getTelefone());
        System.out.println("Data de cadastro: " + objDoador.getDataCadastro());
        System.out.println("Cidade: " + objDoador.getEndereco().getCidade());

        System.out.println("\n=== PROGRAMA ===");
        System.out.println("Id: " + objPrograma.getIdPrograma());
        System.out.println("Nome: " + objPrograma.getNome());
        System.out.println("Público-alvo: " + objPrograma.getPublicoAlvo());
        System.out.println("Descrição: " + objPrograma.getDescricao());

        System.out.println("\n=== CAMPANHA ===");
        System.out.println("Id: " + objCampanha.getIdCampanha());
        System.out.println("Nome: " + objCampanha.getNome());
        System.out.println("Início: " + objCampanha.getDataInicio());
        System.out.println("Fim: " + objCampanha.getDataFim());
        System.out.println("Meta: R$ " + objCampanha.getMeta());
        System.out.println("Percentual distribuído: " + objCampanha.getPercentualDistribuido() + "%");
        System.out.println("Progresso (arrecadado R$ 250): " + objCampanha.calcularProgresso(250.0) + "%");

        System.out.println("\n=== CAMPANHA PROGRAMA ===");
        System.out.println("Percentual distribuído: " + objCampanhaPrograma.getPercentualDistribuido() + "%");
        System.out.println("Data de vinculação: " + objCampanhaPrograma.getDataVinculacao());
        System.out.println("Campanha: " + objCampanhaPrograma.getCampanha().getNome());
        System.out.println("Programa: " + objCampanhaPrograma.getPrograma().getNome());

        System.out.println("\n=== DOACAO ===");
        System.out.println("Id: " + objDoacao.getIdDoacao());
        System.out.println("Valor: R$ " + objDoacao.getValor());
        System.out.println("Data: " + objDoacao.getData());
        System.out.println("Forma de pagamento: " + objDoacao.getFormaPagamento());
        System.out.println("Doador: " + objDoacao.getDoador().getNome());
        System.out.println("Programa: " + objDoacao.getPrograma().getNome());
        System.out.println("Número do recibo: " + objDoacao.getRecibo().getNumero());

        System.out.println("\n=== RECIBO ===");
        System.out.println("Id: " + objRecibo.getIdRecibo());
        System.out.println("Número: " + objRecibo.getNumero());
        System.out.println("Data de emissão: " + objRecibo.getDataEmissao());
        System.out.println("Valor da doação: R$ " + objRecibo.getDoacao().getValor());

        System.out.println("\n=== SCORE ===");
        System.out.println("Id: " + objScore.getIdScore());
        System.out.println("Valor: " + objScore.getValor());
        System.out.println("Data do cálculo: " + objScore.getDataCalculo());
        System.out.println("Nível calculado: " + objScore.calcularNivel());

        System.out.println("\n=== COLABORADOR ===");
        System.out.println("Id: " + objColaborador.getIdColaborador());
        System.out.println("Nome: " + objColaborador.getNome());
        System.out.println("E-mail: " + objColaborador.getEmail());
        System.out.println("Cargo: " + objColaborador.getCargo());
        System.out.println("Nível do score: " + objColaborador.getScore().getNivel());

        System.out.println("\n=== INTERACAO ===");
        System.out.println("Id: " + objInteracao.getIdInteracao());
        System.out.println("Canal: " + objInteracao.getCanal());
        System.out.println("Data: " + objInteracao.getData());
        System.out.println("Assunto: " + objInteracao.getAssunto());
        System.out.println("Colaborador responsável: " + objInteracao.getColaboradorResponsavel());
        System.out.println("Doador: " + objInteracao.getDoador().getNome());

        System.out.println("\n=== TOSTRING ===");
        System.out.println(objEndereco);
        System.out.println(objDoador);
        System.out.println(objPrograma);
        System.out.println(objCampanha);
        System.out.println(objCampanhaPrograma);
        System.out.println(objDoacao);
        System.out.println(objRecibo);
        System.out.println(objScore);
        System.out.println(objColaborador);
        System.out.println(objInteracao);
    }
}
