package ModificadoresEstaticos.test;

import ModificadoresEstaticos.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("Bmw", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("audi", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
