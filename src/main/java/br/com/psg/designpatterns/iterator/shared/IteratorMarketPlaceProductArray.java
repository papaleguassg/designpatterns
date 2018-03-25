package br.com.psg.designpatterns.iterator.shared;

public class IteratorMarketPlaceProductArray implements IteratorInterface<Product> {

    private  Product array[];
    private int count;

    protected IteratorMarketPlaceProductArray(Product[] array) {
        this.array = array;
        count = 0;
    }

    @Override
    public boolean hasNext() {
        if(count < array.length){
            return true;
        }
        return false;
    }

    @Override
    public Product next() {
        if(this.hasNext()){
            return array[count++];
        }
        return null;
    }


}
