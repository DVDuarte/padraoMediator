package org.padroesdeprojeto;

public class Vendas implements Setor {

    private static Vendas instancia = new Vendas();

    private Vendas() {}

    public static Vendas getInstancia() {
        return instancia;
    }

    @Override
    public String processarSolicitacao(String mensagem) {
        return "Setor de Vendas está processando sua solicitação: " + mensagem;
    }
}
