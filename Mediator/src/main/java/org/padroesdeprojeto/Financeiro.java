package org.padroesdeprojeto;

public class Financeiro implements Setor {

    private static Financeiro instancia = new Financeiro();

    private Financeiro() {}

    public static Financeiro getInstancia() {
        return instancia;
    }

    @Override
    public String processarSolicitacao(String mensagem) {
        return "Setor Financeiro está processando sua solicitação: " + mensagem;
    }
}
