package hackerrank;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LexiString {
    public static void main(String[] args) {
        String str1= "ami ";
        String str2= "123";
        System.out.println(str1.compareTo(str2)>0);
        System.out.printf("uppser case of s1 %S", str1);
        System.out.println("subrin of s1 "+str1.substring(1,2));
;    }
}

class reverse {
    public static void main(String[] args) {
        String str= "string reverse";
        //Collections col= new Co

        System.out.println(Comparator.comparing(str::charAt, Comparator.reverseOrder()).toString());

    }
}


class Arraycompare{

    public static void main(String[] args) {
        int arr[]={1,3,7};
        int i= 980;
        System.out.println(Math.abs(arr[0]-arr[1]+arr[1]-arr[2]));
        System.out.printf("|%0#8d|", i);
    }
}