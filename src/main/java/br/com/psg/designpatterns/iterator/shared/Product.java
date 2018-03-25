package br.com.psg.designpatterns.iterator.shared;

import java.math.BigDecimal;

public class Product {

    private Integer id;
    private String nome;
    private BigDecimal valor;

    public Product(Integer id, String nome, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
