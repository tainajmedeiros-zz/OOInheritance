package com.company;

public class Conta {
    private int numero;
    private Pessoa dono = null;
    private String dataAbertura;
    private double saldo;
    private static int totalDeContas;

    public Conta(int numero, String dataAbertura, double saldo) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.totalDeContas = Conta.totalDeContas + 1;
    }

    public int getTotalDeContas(){
        return Conta.totalDeContas;
    }

}
