package ADT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

public class LINKEDLIST {
    public static void main(String[] args) {

        ConcurrentLinkedQueue<String> p = new ConcurrentLinkedQueue<>(List.of("ami", "tumkaey", "chai"));
        System.out.println("before "+p.toString());

      List<String> P= p.stream()
                       .filter(x->{
                           x.equals("ami");
                              return p.remove("ami") ;

                       })
                               .collect(toList());


        System.out.println("remove "+P.toString());
        RemovefromList.main();
    }


    public static List<String> p = new LinkedList<>(List.of("ami", "tumkaey", "chai"));
    class RemovefromList {
        public static void main() {

            System.out.println("thread in "+Thread.currentThread().getName());
            List<String> q= new ArrayList<>(p);

            List<String> P= p.stream()
                    .filter(x->{
                        x.equals("ami");
                        System.out.println("thread in 2"+Thread.currentThread().getName());
                       return q.remove("ami") ;

                    })
                   .collect(Collectors.toList());
                     //.collect(collectingAndThen(toList(), List::copyOf));
            System.out.println("remove here "+P.toString());

        }


    }

}

