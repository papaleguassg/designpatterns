package br.com.psg.designpatterns.iterator.interno;

import br.com.psg.designpatterns.iterator.shared.IteratorInterface;

public class IteratorPrint extends IteratorInternMarketPlace {

    public IteratorPrint(IteratorInterface it) {
        this.it = it;
    }

    @Override
    protected void operation(Object object) {
        System.out.println(object);
    }
}
