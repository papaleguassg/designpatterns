package br.com.psg.designpatterns.iterator.shared;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MarketPlaceAmericanas implements IteratorMarketPlace<IteratorMarketPlaceProductList> {

    private List<Product> product;

    public MarketPlaceAmericanas() {
        product = Arrays.asList(
                new Product(1, "Televisão Samsung", new BigDecimal(2000.00)),
                new Product(2, "Televisão LG", new BigDecimal(2500.00)),
                new Product(3, "Dell Inspirion", new BigDecimal(3000.00))
        );
    }

    @Override
    public IteratorMarketPlaceProductList createIterator() {
        return new IteratorMarketPlaceProductList(product) {
        };
    }
}
