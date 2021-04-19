package br.com.raphaelrossi.example;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

/**
 * Estudante
 */

@Entity
public class Estudante extends PanacheEntityBase {

    @Id
    @GeneratedValue
    public UUID id;

    public String nome;
    
    public Integer numeroChamada;
    
    public Estudante() {
    }

    @Override
    public String toString() {
        return String.format("Aluno Nome [%s] Numero chamada [%i]", nome, numeroChamada);
    }
}