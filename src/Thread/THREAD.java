package Thread;

public class THREAD {
    //static ThreadLocal<Integer> t = new ThreadLocal<>();
    static int i=0;
    public static void main(String[] args) {
        //ThreadLocal t = new ThreadLocal();


        Runnable run = () -> {
            //t.set(i++);
            i++;
            System.out.println(" threadlocal value " + i);
        };


        for (int j = 0; j <500; j++) {
            Thread tt= new Thread(run);
            tt.start();
        }

        System.out.println("after  run " +i);


    }
}
