package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void devePagarComCartaoCredito() {
        Pedido pedido = new Pedido(300.0f);
        try {
            pedido.pagarComCartaoCredito();
            // Se não houver exceção, o pagamento foi bem-sucedido
            assertTrue(true);
        } catch (Exception e) {
            fail("Erro ao processar pagamento com cartão de crédito: " + e.getMessage());
        }
    }

    @Test
    void devePagarComBoleto() {
        Pedido pedido = new Pedido(500.0f);
        try {
            pedido.pagarComBoleto();
            assertTrue(true);
        } catch (Exception e) {
            fail("Erro ao processar pagamento com boleto: " + e.getMessage());
        }
    }

    @Test
    void devePagarComPix() {
        Pedido pedido = new Pedido(250.0f);
        try {
            pedido.pagarComPix();
            assertTrue(true);
        } catch (Exception e) {
            fail("Erro ao processar pagamento com Pix: " + e.getMessage());
        }
    }
}