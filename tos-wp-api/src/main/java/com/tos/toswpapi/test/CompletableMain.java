package com.tos.toswpapi.test;

import java.util.concurrent.Future;

public class CompletableMain {

    public static void main(String[] args) {
        System.out.println("Start CompletableMain");

        Shop shop = new Shop("Seok Shop");
        long start = System.nanoTime();

        Future<Double> futurePrice = shop.getAsyncPrices("Seok's Windows");
        doSomeThingElse();

        try{
            System.out.println("Price is " + futurePrice.get());
        } catch (Exception e){
            throw new RuntimeException();
        }

    }

    private static void doSomeThingElse(){
        System.out.println("CompleteabeMain >> doSomeThingElse");
    }
}
