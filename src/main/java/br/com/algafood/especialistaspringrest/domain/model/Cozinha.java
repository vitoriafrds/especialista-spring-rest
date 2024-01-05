package br.com.algafood.especialistaspringrest.domain.model;

import jakarta.persistence.*;

import java.util.Objects;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Cozinha {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column
    private String tipo;

    public Cozinha() {
    }

    public Cozinha(String tipo) {
        this.tipo = tipo;
    }

    public Cozinha(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cozinha cozinha = (Cozinha) o;
        return id == cozinha.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
