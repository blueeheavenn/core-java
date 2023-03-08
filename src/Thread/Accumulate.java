package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Accumulate {
    public static void main(String[] args) {
        AtomicInteger atm=new AtomicInteger(0);

        ExecutorService service= Executors.newFixedThreadPool(10);
        service.submit(()->{
            IntStream.range(0,10)
                    .peek(System.out::println)
                    .forEach(i->
                            atm.accumulateAndGet(i,
                            (x,y)-> x+y));
                    });

        stop(service);

        System.out.println(atm.get());
    }
    public static void stop(ExecutorService executor) {
        try {
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("termination interrupted");
        }
        finally {
            if (!executor.isTerminated()) {
                System.err.println("killing non-finished tasks");
            }
            executor.shutdownNow();
        }
    }
}
