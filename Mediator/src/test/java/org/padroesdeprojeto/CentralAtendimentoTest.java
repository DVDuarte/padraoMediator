package org.padroesdeprojeto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CentralAtendimentoTest {

    @Test


    void deveEncaminharSolicitacaoFinanceiro() {
        Cliente cliente = new Cliente();
        String resultado = cliente.enviarSolicitacao("financeiro", "Quero renegociar minha dívida.");
        assertEquals(
                "Central de Atendimento direcionou ao setor Financeiro:\n" +
                        "Setor Financeiro está processando sua solicitação: Quero renegociar minha dívida.",
                resultado
        );
    }

    @Test
    void deveEncaminharSolicitacaoSuporteTecnico() {
        Cliente cliente = new Cliente();
        String resultado = cliente.enviarSolicitacao("suporte", "Meu sistema está travando.");
        assertEquals(
                "Central de Atendimento direcionou ao Suporte Técnico:\n" +
                        "Setor de Suporte Técnico está processando sua solicitação: Meu sistema está travando.",
                resultado
        );
    }

    @Test
    void deveEncaminharSolicitacaoVendas() {
        Cliente cliente = new Cliente();
        String resultado = cliente.enviarSolicitacao("vendas", "Gostaria de saber mais sobre os produtos.");
        assertEquals(
                "Central de Atendimento direcionou ao setor de Vendas:\n" +
                        "Setor de Vendas está processando sua solicitação: Gostaria de saber mais sobre os produtos.",
                resultado
        );
    }

    @Test
    void deveRetornarErroParaTipoInvalido() {
        Cliente cliente = new Cliente();
        String resultado = cliente.enviarSolicitacao("logistica", "Tenho dúvidas sobre entrega.");
        assertEquals(
                "Central de Atendimento: Tipo de solicitação desconhecido.",
                resultado
        );
    }
}