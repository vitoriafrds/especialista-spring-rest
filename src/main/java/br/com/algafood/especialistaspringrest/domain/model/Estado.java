package br.com.algafood.especialistaspringrest.domain.model;

import jakarta.persistence.*;

import java.util.Objects;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Estado {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column
    private String nome;

    public Estado() {
    }

    public Estado(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado Estado = (Estado) o;
        return id == Estado.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
