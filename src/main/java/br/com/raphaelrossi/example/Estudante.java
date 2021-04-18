package br.com.raphaelrossi.example;

/**
 * Estudante
 */
public class Estudante {
    private String nome;
    
    private Integer numeroChamada;
    
    public Estudante() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroChamada() {
        return numeroChamada;
    }

    public void setNumeroChamada(Integer numeroChamada) {
        this.numeroChamada = numeroChamada;
    }

    @Override
    public String toString() {
        return String.format("Aluno Nome [%s] Numero chamada [%i]", nome, numeroChamada);
    }
}