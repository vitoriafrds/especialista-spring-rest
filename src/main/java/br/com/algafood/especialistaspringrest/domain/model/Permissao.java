package br.com.algafood.especialistaspringrest.domain.model;

import jakarta.persistence.*;

import java.util.Objects;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Permissao {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column
    private String nome;

    @Column
    private String descricao;

    public Permissao() {
    }

    public Permissao(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permissao permissao = (Permissao) o;
        return id == permissao.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
