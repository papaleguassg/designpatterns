package br.com.psg.designpatterns.iterator.externo;


import br.com.psg.designpatterns.iterator.shared.*;

public class Main {

    public static void main(String[] args) {
        IteratorMarketPlace<IteratorMarketPlaceProductList> americanas = new MarketPlaceAmericanas();
        System.out.println("Produtos Americanas");

        for(IteratorInterface iter = americanas.createIterator(); iter.hasNext();){
            Product product = (Product) iter.next();
            System.out.println("Produto : " + product);
        }

        IteratorMarketPlace<IteratorMarketPlaceProductArray> mercadoLivre = new MarketPlaceMercadoLivre();
        System.out.println("Produtos Mercado Livre");

        for(IteratorInterface iter = mercadoLivre.createIterator(); iter.hasNext();){
            Product product = (Product)iter.next();
            System.out.println("Produto : " + product);
        }
    }


}
