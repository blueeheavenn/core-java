import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.*;

public class STRING {
    public static String str = "ami ami tumi ";
    public static  String revStr = "amitumikey";

    public static String sen = "ami ami tumakey chai na na";

    public static void main(String[] args) {
        var o1 = str.chars().mapToObj(x -> (char) x)
                .distinct()
                .collect(Collectors.toList());

       // System.out.println(o1);

        var o = Arrays.stream(str.split(" ")).distinct()
                .collect(Collectors.toList());
        //System.out.println(0);


        //System.out.println(o);

        var o2 = revStr.chars().mapToObj(x -> (char) x)
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining(""));
       System.out.println(o2);

        var n = Arrays.stream(sen.split(" "))
                //.peek(System.out::println)
                .sorted(Collections.reverseOrder())
                //.peek(System.out::println)
                .collect(Collectors.joining(" "));
       // System.out.println(n);

       var revOrder = Arrays.stream(sen.split(" "))
               //.sorted(Comparator.comparing(String::length).reversed())
               //.sorted(Comparator.reverseOrder())
               .sorted()
               .collect(Collectors.toList());
        System.out.println(revOrder);

        Map<String, Long> p=Arrays.stream(sen.split(" "))
                //.map(Function.identity())
                .collect(Collectors.groupingBy(identity(),Collectors.counting()));
        System.out.println(p);
    }
}
