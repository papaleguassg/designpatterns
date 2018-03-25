package br.com.psg.designpatterns.iterator.shared;

import java.util.List;

public class IteratorMarketPlaceProductList implements IteratorInterface<Product> {

    private List<Product> list;
    private int count;

    protected IteratorMarketPlaceProductList(List<Product> list) {
        this.list = list;
        count = 0;
    }

    @Override
    public boolean hasNext() {
        if(count < list.size()){
            return true;
        }
        return false;
    }

    @Override
    public Product next() {
        if(this.hasNext()){
            return list.get(count++);
        }
        return null;
    }


}
