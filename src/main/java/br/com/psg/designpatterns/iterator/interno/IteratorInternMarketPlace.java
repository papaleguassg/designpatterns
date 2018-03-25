package br.com.psg.designpatterns.iterator.interno;

import br.com.psg.designpatterns.iterator.shared.IteratorInterface;

public abstract class IteratorInternMarketPlace<T> {

    IteratorInterface<T> it;

    public void forEachIterator() {
        while (it.hasNext()) {
            T object = it.next();
            System.out.println("Produto : " + object);
        }
    }

    protected abstract void operation(T object);
}
