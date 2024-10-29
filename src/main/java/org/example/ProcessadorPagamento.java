package org.example;

public class ProcessadorPagamento {

    private float valor;

    public ProcessadorPagamento(float valor) {
        this.valor = valor;
    }

    public void processar(FormaDePagamento formaDePagamento) {
        formaDePagamento.pagar(valor);
    }
}