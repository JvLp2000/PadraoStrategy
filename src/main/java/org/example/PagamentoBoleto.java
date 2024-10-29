package org.example;

public class PagamentoBoleto implements FormaDePagamento {

    @Override
    public void pagar(float valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com boleto.");
    }
}