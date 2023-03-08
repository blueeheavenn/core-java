package hackerrank;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class DATATYPE {
    public static void main(String[] args) {
        int b=127;
        //int p= ((byte) 300000);
        System.out.println("size of byte value" +Byte.MAX_VALUE);
        boolean c= b<=Byte.MAX_VALUE?true:false;
        System.out.println(c);
        System.out.println("convert into string  "+String.valueOf(b)+" 1bc ");
        String z = String.valueOf(b);
        String fri = "3";
        int d= Integer.parseInt(fri);
        System.out.println("date "+ LocalDate.of(d, d, d).getDayOfWeek());
        Scanner sc = new Scanner(System.in);
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(b));
        System.out.println("subtring "+z.substring(1,2));
    }

}
