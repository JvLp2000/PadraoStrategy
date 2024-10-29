package org.example;

public class Pedido {

    private float valor;

    public Pedido(float valor) {
        this.valor = valor;
    }

    public void pagarComCartaoCredito() {
        ProcessadorPagamento processador = new ProcessadorPagamento(valor);
        processador.processar(new PagamentoCartaoCredito());
    }

    public void pagarComBoleto() {
        ProcessadorPagamento processador = new ProcessadorPagamento(valor);
        processador.processar(new PagamentoBoleto());
    }

    public void pagarComPix() {
        ProcessadorPagamento processador = new ProcessadorPagamento(valor);
        processador.processar(new PagamentoPix());
    }
}