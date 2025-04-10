package Heranca.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }


}
