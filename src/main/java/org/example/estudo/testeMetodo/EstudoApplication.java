package org.example.estudo.testeMetodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstudoApplication.class, args);
        int numero01 = 20;
        int numero02 = 12;
        System.out.println(numero01 % numero02);
    }

}
