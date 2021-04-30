package com.company;

public class Gerente extends Funcionario{
    private int numeroDeFuncionariosGerenciados;

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    public void verInfor() {
        super.verInfor();
        System.out.println("O numero de funcionarios gerenciados é: " + this.numeroDeFuncionariosGerenciados);
    }
}
