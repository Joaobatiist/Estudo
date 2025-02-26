package hHeranca.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Funcionario extends Pessoa {
    private double salario;

public void imprime(){
    super.imprime();
    System.out.println("Salario: " + this.getSalario());
}
public void relatorioDePagamnento(){
    System.out.println("Eu " + this.nome + "Recebi " + this.salario);
}
}
