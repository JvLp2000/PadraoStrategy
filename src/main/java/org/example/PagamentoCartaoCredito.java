package org.example;


public class PagamentoCartaoCredito implements FormaDePagamento {

    @Override
    public void pagar(float valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
    }
}
