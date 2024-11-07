package ThucHanhOS;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(thread1::start);
        CompletableFuture<Void> future2 = future1.thenRunAsync(thread2::start);
        CompletableFuture.allOf(future1, future2).join();


    }
}
