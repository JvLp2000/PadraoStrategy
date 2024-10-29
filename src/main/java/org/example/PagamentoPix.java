package org.example;

public class PagamentoPix implements FormaDePagamento {

    @Override
    public void pagar(float valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Pix.");
    }
}