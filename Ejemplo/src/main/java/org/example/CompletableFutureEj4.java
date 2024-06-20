package org.example;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class CompletableFutureEj4 {
    public static void main(String[] args) {

        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> RandomNumber());
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> RandomNumber());
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> RandomNumber());
        CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(() -> RandomNumber());

        CompletableFuture<Object> firstCompleted = CompletableFuture.anyOf(future1, future2, future3, future4);

        firstCompleted.thenAccept(result -> {
            System.out.println("El primer valor completado es: " + result);
        }).join();
    }

    private static int RandomNumber() {
        int randomNum = ThreadLocalRandom.current().nextInt(100, 501);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return randomNum;
    }
}