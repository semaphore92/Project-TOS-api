package com.tos.toswpapi.test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class PriceFinder {
    private final List<Shop> shops = Arrays.asList(
            new Shop("CooPang"),
            new Shop("HMarket"),
            new Shop("11th Street"),
            new Shop("Oction")
    );

    private final Executor executor = Executors.newFixedThreadPool(Math.min(shops.size(), 100),
            new ThreadFactory() {
                @Override
                public Thread newThread(Runnable r) {
                    Thread t = new Thread(r);
                    t.setDaemon(true);
                    return t;
                }
            });

    public List<String> findPrices(String product){
        List<CompletableFuture<String>> priceFutures = shops.stream()
                .map(shop -> CompletableFuture.supplyAsync(()->
                        String.format(" %s 가격은 %.2f",shop.getName(),shop.getPrice(product))))
                .collect(Collectors.toList());

        return priceFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        PriceFinder priceFinder = new PriceFinder();
        long start = System.nanoTime();
        System.out.println(priceFinder.findPrices("Mac"));

        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("완료 시간: " + duration + "msecs");
    }
}
