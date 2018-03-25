package br.com.psg.designpatterns.iterator.shared;

import java.math.BigDecimal;

public class MarketPlaceMercadoLivre implements IteratorMarketPlace<IteratorMarketPlaceProductArray> {

    private Product[] product;

    public MarketPlaceMercadoLivre() {
        product = new Product[]{new Product(1, "Televisão Samsung", new BigDecimal(2000.00)),
                new Product(2, "Televisão LG", new BigDecimal(2500.00)),
                new Product(3, "Dell Inspirion", new BigDecimal(3000.00))};
    }

    @Override
    public IteratorMarketPlaceProductArray createIterator() {
        return new IteratorMarketPlaceProductArray(product) {
        };
    }
}
