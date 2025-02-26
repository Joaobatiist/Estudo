package org.example.estudo.test;

import org.example.estudo.Estudante.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Rafael";
        funcionario.idade = 20;
        funcionario.salarios = new double[]{1000.00, 800.00, 500.00, 700.00};

        funcionario.imprime();

       funcionario.media();
    }

}
