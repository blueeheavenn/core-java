import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Array;
import java.util.*;
import java.util.stream.IntStream;

public class SORT {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(50);
        al.add(30);
        al.add(10);
        al.add(2);
        //Collections.sort(al);
        System.out.println(al);

        //Collections.sort(al, Collections.reverseOrder((x1,x2)->x1.i));
        System.out.println(al);

        System.out.println(Collections.binarySearch(al, 100));

        System.out.println(String.class.isAssignableFrom(al.getClass()));

        String str = "ami tumekay chai";
        char[] str2= new char[str.length()];
        int j=0;
        for (char ch :str2 ) {
            str2[j]=str.toCharArray()[str.length()-1-j];
            j++;


        }

        Currency.getInstance(Locale.US);
        String[] split = String.valueOf(str2).split("");



        System.out.println(String.valueOf(Object.class));
        try (PrintWriter writer = new PrintWriter(new File("test.txt"));
             PrintWriter writer2 = new PrintWriter(new File("test.txt"))
        ) {
            writer.println("Hello World");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(System.in);


    }

}
