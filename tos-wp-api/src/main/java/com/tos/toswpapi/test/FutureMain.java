package com.tos.toswpapi.test;


import javax.print.Doc;
import java.util.Timer;
import java.util.concurrent.*;

// Java Future 테스트 모듈
public class FutureMain {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Double> future = executorService.submit(new Callable<Double>(){
            public Double call(){
                return someLongComputation();
            }
        });
        doSomethingElse();
        try{
            Double result = future.get(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            // handle e
        } catch (ExecutionException e) {
            // handle e
        } catch (TimeoutException e) {
            // handle e
        }
    }

    private static Double someLongComputation(){

        return 1d;
    }

    private static void doSomethingElse(){

    }
}
