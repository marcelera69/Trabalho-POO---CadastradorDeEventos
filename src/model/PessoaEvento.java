package model;

public class PessoaEvento {
    private String cpf;
    private String evento;

    public PessoaEvento(String cpf, String evento) {
        this.cpf = cpf;
        this.evento = evento;
    }

    public String getCPF() { return cpf; }
    public String getEvento() { return evento; }
}