package org.example.estudo.Estudante;

public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private int telefone;
    private int id;

    public Pessoa(String nome, String cpf, String rg, int telefone) {
        this();
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;

    }
    public Pessoa (String nome, String cpf, String rg, int telefone, int id){
        this(nome, cpf, rg, telefone);
         this.id = id;
    }

    public Pessoa() {

    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.rg);
        System.out.println(this.telefone);
        System.out.println(this.id);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getTelefone() {
        return telefone;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
