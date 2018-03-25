package br.com.psg.designpatterns.iterator.interno;

import br.com.psg.designpatterns.iterator.externo.IteratorExternMarketPlace;
import br.com.psg.designpatterns.iterator.shared.IteratorMarketPlaceProductArray;
import br.com.psg.designpatterns.iterator.shared.IteratorMarketPlaceProductList;
import br.com.psg.designpatterns.iterator.shared.MarketPlaceAmericanas;
import br.com.psg.designpatterns.iterator.shared.MarketPlaceMercadoLivre;

public class Main {

    public static void main(String[] args) {
        IteratorExternMarketPlace<IteratorMarketPlaceProductList> americanas = new MarketPlaceAmericanas();
        System.out.println("MarketPlace Americanas");
        IteratorInternMarketPlace it1 = new IteratorPrint(americanas.createIterator());
        it1.forEachIterator();

        IteratorExternMarketPlace<IteratorMarketPlaceProductArray> mercadoLivre = new MarketPlaceMercadoLivre();
        System.out.println("MarketPlace Mercado Livre");
        IteratorInternMarketPlace it2 = new IteratorPrint(mercadoLivre.createIterator());
        it2.forEachIterator();
    }
}
