package entity;

public class Empregado {

    private String nome;
    private double salarioBr;

    public Empregado() {
    }

    public Empregado(String nome, double salarioBr) {
        this.nome = nome;
        this.salarioBr = salarioBr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBr() {
        return salarioBr;
    }

    public void setSalarioBr(double salarioBr) {
        this.salarioBr = salarioBr;
    }
}
