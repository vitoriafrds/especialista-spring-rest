package br.com.algafood.especialistaspringrest.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Objects;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Restaurante {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column(name = "taxa_frete")
    private BigDecimal taxaFrete;

    public Restaurante(Long id, String nome, BigDecimal taxaFrete) {
        this.id = id;
        this.nome = nome;
        this.taxaFrete = taxaFrete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(BigDecimal taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurante that = (Restaurante) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
