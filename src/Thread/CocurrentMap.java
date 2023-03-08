package Thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CocurrentMap {
    public static void main(String[] args) {
        //ConcurrentMap< String, String> m= new ConcurrentHashMap<>();
        Map< String, String> m= new HashMap<>();

        Thread t1 = new Thread( ()->{
            m.put("t1", "value1");
            System.out.println(m.get("t1"));
        });
        Thread t2 = new Thread( ()->{
            m.put("t2", "value2");
            System.out.println(m.get("t2"));
        });



        t1.start();
        t2.start();




    }
}
