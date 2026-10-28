package br.com.sorrisorecorrente.test;

import javax.swing.JOptionPane;
import br.com.sorrisorecorrente.entities.*;

public class TesteSistema {

    // Métodos auxiliares solicitados
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "Bem-vindo ao Sistema de Testes - Sorriso Recorrente!");

            // 1. Cadastrando Endereço e Doador
            JOptionPane.showMessageDialog(null, "--- Cadastro de Endereço ---");
            Endereco endereco = new Endereco(
                    inteiro("ID do Endereço:"),
                    texto("Logradouro:"),
                    inteiro("Número:"),
                    texto("Complemento:"),
                    texto("CEP:"),
                    texto("Cidade:"),
                    texto("Estado:"),
                    texto("País:")
            );

            JOptionPane.showMessageDialog(null, "--- Cadastro de Doador ---");
            Doador doador = new Doador(
                    inteiro("ID do Doador:"),
                    texto("Nome do Doador:"),
                    texto("CPF:"),
                    texto("CNPJ (ou deixe vazio):"),
                    texto("E-mail:"),
                    texto("Telefone:"),
                    texto("Data de Cadastro:")
            );
            doador.setEndereco(endereco);

            // 2. Cadastrando Programa
            JOptionPane.showMessageDialog(null, "--- Cadastro de Programa ---");
            Programa programa = new Programa(
                    inteiro("ID do Programa:"),
                    texto("Nome do Programa:"),
                    texto("Público-Alvo:"),
                    texto("Descrição:")
            );

            // 3. Cadastrando Doação e Recibo
            JOptionPane.showMessageDialog(null, "--- Cadastro de Doação ---");
            Doacao doacao = new Doacao(
                    inteiro("ID da Doação:"),
                    real("Valor da Doação (R$):"),
                    texto("Data da Doação:"),
                    texto("Forma de Pagamento (ex: Pix, Cartão):")
            );
            doacao.setDoador(doador);
            doacao.setPrograma(programa);

            JOptionPane.showMessageDialog(null, "--- Cadastro de Recibo ---");
            Recibo recibo = new Recibo(
                    inteiro("ID do Recibo:"),
                    inteiro("Número do Recibo:"),
                    texto("Data de Emissão:")
            );
            recibo.setDoacao(doacao);
            doacao.setRecibo(recibo);

            // 4. Cadastrando Campanha e Testando Progresso
            JOptionPane.showMessageDialog(null, "--- Cadastro de Campanha ---");
            Campanha campanha = new Campanha(
                    inteiro("ID da Campanha:"),
                    texto("Nome da Campanha:"),
                    texto("Data de Início:"),
                    texto("Data de Fim:"),
                    real("Meta da Campanha (R$):"),
                    real("Percentual Distribuído (%):")
            );

            double totalArrecadado = real("Informe o valor total arrecadado para testar o cálculo de progresso:");
            double progressoCalculado = campanha.calcularProgresso(totalArrecadado);

            // 5. Relacionamento Campanha e Programa
            CampanhaPrograma campanhaPrograma = new CampanhaPrograma(
                    real("Percentual Distribuído (Campanha-Programa):"),
                    texto("Data de Vinculação:")
            );
            campanhaPrograma.setCampanha(campanha);
            campanhaPrograma.setPrograma(programa);

            // 6. Cadastrando Score e Colaborador
            JOptionPane.showMessageDialog(null, "--- Cadastro de Score ---");
            Score score = new Score(
                    inteiro("ID do Score:"),
                    real("Valor do Score (ex: 75.5):"),
                    "",
                    texto("Data de Cálculo do Score:")
            );
            String nivelScore = score.calcularNivel();

            JOptionPane.showMessageDialog(null, "--- Cadastro de Colaborador ---");
            Colaborador colaborador = new Colaborador(
                    inteiro("ID do Colaborador:"),
                    texto("Nome do Colaborador:"),
                    texto("E-mail do Colaborador:"),
                    texto("Cargo:")
            );
            colaborador.setScore(score);

            // 7. Cadastrando Interação
            JOptionPane.showMessageDialog(null, "--- Cadastro de Interação ---");
            Interacao interacao = new Interacao(
                    inteiro("ID da Interação:"),
                    texto("Canal (ex: Telefone, Chat):"),
                    texto("Data da Interação:"),
                    texto("Assunto:"),
                    texto("Nome do Colaborador Responsável:")
            );
            interacao.setDoador(doador);

            // Exibindo Resumo Geral dos Testes
            String resumo = "=== RESULTADOS DOS TESTES DO SISTEMA ===\n\n" +
                    "Progresso da Campanha '" + campanha.getNome() + "': " + progressoCalculado + "%\n" +
                    "Nível do Score Calculado: " + nivelScore + "\n" +
                    doador + "\n" +
                    programa + "\n" +
                    doacao + "\n" +
                    recibo + "\n" +
                    campanha + "\n" +
                    campanhaPrograma + "\n" +
                    colaborador + "\n" +
                    interacao;

            JOptionPane.showMessageDialog(null, resumo);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Formato de número inválido inserido. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}