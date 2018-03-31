package br.com.psg.designpatterns.composite.product;

import br.com.psg.designpatterns.composite.product.order.ProducionOrder;

import java.util.ArrayList;
import java.util.List;

public abstract class ProductConfiguration {

    private String name;

    private Integer amount;

    private Integer level;

    private List<ProductConfiguration> configurations = new ArrayList<>();

    public ProductConfiguration(String name) {
        this.name = name;
        this.amount = 1;
        this.level = 0;
    }

    public ProductConfiguration add(ProductConfiguration configuration, Integer amount) {
        configuration.amount = amount;
        this.configurations.add(configuration);
        this.recalculateLevel(configuration);
        return this;
    }

    public void print() {
        System.out.println(this);
        this.configurations.forEach(ProductConfiguration::print);
    }

    @Override
    public String toString() {
        String toString = "";
        for (int i = 0; i < level; i++) {
            toString += "   ";
        }
        return toString + " -> Level: " + level + " - Amount: " + amount + " =>  " + name;
    }

    public void calculateProductionOrder(List<ProducionOrder> orders, Integer amount) {
        int totalAmount = amount * this.amount;
        configurations.forEach(pr -> pr.calculateProductionOrder(orders, totalAmount));
        orders.add(new ProducionOrder(this, totalAmount));
    }

    public String getName() {
        return name;
    }

    private void recalculateLevel(ProductConfiguration configuration) {
        configuration.level = this.level + 1;
        configuration.configurations.forEach(pr -> pr.recalculateLevel(pr));
    }
}
