package hackerrank;

public class FIZZBUZZ {

    public static void main(String[] args) {
        fizzBuzz(5);
    }

    public static void fizzBuzz(int n) {
        int i ;
        for ( i =1; i <= n; i++) {
            if( i%3==0 && i%5==0){
                System.out.println("FizzBuzz");

            }
            if( i%3==0 && i%5!=0){
                System.out.println("Fizz");
            }
            if( i%5==0 && i%3!=0){
                System.out.println("Buzz");
            }
            if( i%5!=0 || i%3!=0){
                System.out.println(i);

            }

        }

    }
}
