package Thread;

public class Pattern {
   private static final String REGEXP= """
           /*this
           is a 
           multiline
           */
           """;
    public static void main(String[] args) {

        java.util.regex.Pattern p = java.util.regex.Pattern.compile("\\/\\*((\\s+)?([a-z]+\\s+)?)+\\*\\/");
        System.out.println(p.matcher(REGEXP).find());


    }
}
