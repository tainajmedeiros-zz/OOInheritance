package com.company;

public class Main {

    public static void main(String[] args) {
        //Criando funcionarios do banco
        Funcionario funcionarioA = new Funcionario();
        Gerente gerenteA = new Gerente();

        //Criando um funcionario
        funcionarioA.setNome("Tequila");
        funcionarioA.setCpf("123.123.123-12");
        funcionarioA.setSalario(1234.00);
        funcionarioA.setSenha(9876);

        //Imprimindo informações do funcionário
        // acessando pelo método que foi criado
        boolean funcionarioAutorizado = funcionarioA.autentica(9876);
        if (funcionarioAutorizado == true) {
            funcionarioA.verInfor();
        }

        //Criando um gerente
        gerenteA.setNome("Tainá");
        gerenteA.setCpf("123.123.123-12");
        gerenteA.setSalario(1234.00);
        gerenteA.setSenha(9876);
        gerenteA.setNumeroDeFuncionariosGerenciados(5);

        //Imprimindo informações da gerente
        // acessando pelo método que foi criado
        boolean gerenteAutorizado = gerenteA.autentica(9876);
        if (gerenteAutorizado == true) {
            gerenteA.verInfor();
        }
    }
}
