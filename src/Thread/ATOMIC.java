package Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ATOMIC {
    static Integer in=0;
    public static void main(String[] args) {
        //AtomicInteger in=new AtomicInteger();


        Executor e= Executors.newFixedThreadPool(10);
        Runnable run=()->{
            for (int i = 0; i < 10000; i++) {
               // in.incrementAndGet();
                in++;
            }
        };
        ((ExecutorService) e).submit(run);
        stop((ExecutorService) e);
        //System.out.println(in.get());
        System.out.println(in);
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
