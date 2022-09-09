package com.tos.toswpapi.test;


import javax.print.Doc;
import java.util.Timer;
import java.util.concurrent.*;

// Java Future 테스트 모듈
// 시간이 걸릴 수 있는 작업을 Futre 내부로 호출하고 결과를 기다리는 동안 다른 유용한 작업을 진행
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
            System.out.println("result : " + result);
        } catch (InterruptedException e) {
            // handle e
        } catch (ExecutionException e) {
            // handle e
        } catch (TimeoutException e) {
            // handle e
        }
    }

    private static Double someLongComputation(){
        System.out.println("someLongComputation Start");
        return 1d;
    }

    private static void doSomethingElse(){
        System.out.println("doSomethingElse Start");
    }
}
