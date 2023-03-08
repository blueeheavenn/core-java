package ADT;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class COLLECTIONS {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        // System.out.println(new TreeMap<>(capitalCities));

        //  Comparator.comparing(capitalCities::);
        System.out.println(capitalCities);

        // numbersort();
        //finddups();
        countByVowels();
        reverseSortString();
    }

    private static void reverseSortString() {


        String str = "ami tumakey chai";
        AtomicInteger i= new AtomicInteger(str.length()-1);
        //int i= str.length()-1;
       List<Character> newp= str.chars()
                .mapToObj(x->(char) x)
                .map(x-> {
                    Character m = str.charAt(i.get());
                     i.getAndDecrement();
                     return m;

        })
                .collect(Collectors.toList());
        System.out.println(newp);

        IntStream.rangeClosed('a', 'z').forEach(c -> System.out.println((char)c));


    }

    private static void countByVowels() {
        String str = "ami tumakey chai";

        System.out.println("here" + Stream.of(str.toCharArray()).toArray().toString());
        List v = List.of('a', 'e', 'i',
                'o', 'u');
        //System.out.println("v "+v);
        //Character c='b';
        LocalTime startTime= LocalTime.now();
        Map<Character, Long> m = str.chars()
                .mapToObj(x -> (char) x)
                //.peek(x-> System.out.println(x instanceof Character) )
                .filter(v::contains)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        LocalTime endTime= LocalTime.now();
        System.out.println(Duration.between(startTime,
                endTime).toMillis());






    }

    private static void finddups() {
        String arr[] = {"java", "springboot", "spring", "hibernate", "java"};
//        Arrays.stream(arr)
//                .collect(Collectors.toMap(Collectors.groupingBy()));
    }

    public static void numbersort() {

        int[] i = IntStream.range(1, 11)
                .toArray();
        Arrays.sort(i);
        Arrays.stream(i).min();
        //Collections.sort();
        System.out.println(Arrays.toString(i));
        System.out.println("min" + Arrays.stream(i).average());
        List<Integer> p = List.of(IntStream.range(1, 11))
                .stream()
                .peek(System.out::println)
                .map(x -> Integer.parseInt(String.valueOf(x)))

                .collect(Collectors.toList());
        System.out.println(p);

    }
}

