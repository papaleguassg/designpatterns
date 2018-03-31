package br.com.psg.designpatterns.composite.product.order;

import br.com.psg.designpatterns.composite.product.ProductConfiguration;

public class ProducionOrder {

    private ProductConfiguration product;

    private Integer amoount;

    public ProducionOrder(ProductConfiguration product, Integer amoount) {
        this.product = product;
        this.amoount = amoount;
    }

    @Override
    public String toString() {
        return product.getName() + "  " + amoount;
    }
}
