package org.padroesdeprojeto;

public class Cliente {

    public String enviarSolicitacao(String tipoSolicitacao, String mensagem) {
        return CentralAtendimento.getInstancia().encaminharSolicitacao(tipoSolicitacao, mensagem);
    }
}
