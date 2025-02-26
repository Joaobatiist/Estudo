package Asocciacao.Dominio;

import lombok.Getter;
import lombok.Setter;

public class Local {
    @Getter @Setter
   private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }
}
