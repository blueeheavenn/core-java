package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class LISTCLASS {

    public static void main(String[] args) {
         List<String> p = new LinkedList<>(List.of( "tumkaey", "chai", "ami"));
         List<String> q = new LinkedList<>(List.of(""));
         q.add(null);
         List.of("null");

        String str = "Hello World";
        List<Character> charStr = new ArrayList<>();
        str.chars().forEach(y -> charStr.add(Character.valueOf((char) y)));
        String c="h";

        System.out.println(charStr);
        //System.out.println(Character.valueOf(c));





    }
}
