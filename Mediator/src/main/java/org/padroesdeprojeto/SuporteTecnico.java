package org.padroesdeprojeto;

public class SuporteTecnico implements Setor {

    private static SuporteTecnico instancia = new SuporteTecnico();

    private SuporteTecnico() {}

    public static SuporteTecnico getInstancia() {
        return instancia;
    }

    @Override
    public String processarSolicitacao(String mensagem) {
        return "Setor de Suporte Técnico está processando sua solicitação: " + mensagem;
    }
}