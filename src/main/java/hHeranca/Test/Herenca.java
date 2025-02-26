package hHeranca.Test;

import hHeranca.dominio.Endereco;
import hHeranca.dominio.Funcionario;
import hHeranca.dominio.Pessoa;

public class Herenca {
    public static void main(String[] args) {
        Endereco endereco = new Endereco(" ", "");
        endereco.setRua("Rua Manoel Gomes");
        endereco.setCep("1010203000");

        System.out.println("----------------");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(" Manoel Gomes");
        pessoa.setCpf("111111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("----------------");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(" Rodrigo Gomes");
        funcionario.setCpf("1028-567");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(10000.00);
        funcionario.imprime();
    }
}
