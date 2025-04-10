package Heranca.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {
    private String rua;
    private String cep;

    public Endereco(String rua, String cep) {
        this.rua = rua;
        this.cep = cep;
    }
}
