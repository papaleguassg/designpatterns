package br.com.psg.designpatterns.iterator.shared;

public interface IteratorInterface<T> {

    public boolean hasNext();
    public T next();
}
