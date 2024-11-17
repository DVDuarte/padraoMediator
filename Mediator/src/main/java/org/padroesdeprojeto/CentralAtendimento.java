package org.padroesdeprojeto;

public class CentralAtendimento {

    private static CentralAtendimento instancia = new CentralAtendimento();

    private CentralAtendimento() {}

    public static CentralAtendimento getInstancia() {
        return instancia;
    }

    public String encaminharSolicitacao(String tipoSolicitacao, String mensagem) {
        switch (tipoSolicitacao.toLowerCase()) {
            case "financeiro":
                return "Central de Atendimento direcionou ao setor Financeiro:\n" +
                        Financeiro.getInstancia().processarSolicitacao(mensagem);

            case "suporte":
                return "Central de Atendimento direcionou ao Suporte Técnico:\n" +
                        SuporteTecnico.getInstancia().processarSolicitacao(mensagem);

            case "vendas":
                return "Central de Atendimento direcionou ao setor de Vendas:\n" +
                        Vendas.getInstancia().processarSolicitacao(mensagem);

            default:
                return "Central de Atendimento: Tipo de solicitação desconhecido.";
        }
    }
}
