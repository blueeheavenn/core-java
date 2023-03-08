import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {

       List i= Collections.singletonList(Arrays.asList("8", "3").stream()
                .map(Integer::valueOf)
                .mapToInt(Integer::valueOf)
                .filter(x -> x % 2 == 0)
                //.peek(x-> System.out.println(x));
                //.peek(x-> System.out.println(x))
               .toArray());

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       List<int[]> p= Collections.singletonList(numbers.stream()
               .mapToInt(Integer::valueOf)
               .filter(value -> value % 2 == 0)
               .toArray());

    }


}