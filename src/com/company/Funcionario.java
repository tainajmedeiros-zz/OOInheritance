package com.company;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    protected int senha;

    public boolean autentica(int senha) {
        if (this.senha == senha){
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso negado!");
            return false;
        }
    }

    public void verInfor() {
        System.out.println("Segue informações da pessoa funcionária:");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: " + this.salario);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
