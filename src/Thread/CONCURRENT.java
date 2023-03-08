package Thread;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CONCURRENT {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        System.out.println("main Threaad  "+Thread.currentThread().getName());


        CompletableFuture f= new CompletableFuture();
                f.thenAccept(x -> System.out.println("5"))
                .thenApply(x-> x+"10")
                .thenAccept(System.out::println);

    }

}
