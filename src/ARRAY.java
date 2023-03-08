import java.util.*;
import java.util.stream.Collectors;

public class ARRAY {

    public static void main(String[] args) {
        String arr[] = {"ami", "tumakey", "chai"};

        String [] copy =Arrays.copyOf(arr, arr.length);

        System.out.println(Arrays.toString(copy));

        HashMap m= new LinkedHashMap();

       LinkedList<Integer> i= new LinkedList<>(List.of(1,2,3,5,5));
//                i.stream()
//                .filter(x->{
//
//                    boolean b = i.get == i+ 1;
//                    i.remove(x);
//                    i.remove(x+1);
//                   return b;
//                })
//               .collect(Collectors.toList());
//
//        for (Integer integer : i) {
//            System.out.println(integer);
//        }

        for (int j = 0; j == i.size(); j++) {
            if(i.get(j)==i.get(j+1)){
                i.remove(j);
                i.remove(j+1);
            }

        }
       // i.remove(0);
        i.forEach(System.out::println);



    }




}
