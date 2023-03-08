package hackerrank;

import java.io.File;
import java.io.InputStream;
import java.util.ResourceBundle;
import java.util.Scanner;

public class AMALGALAM {
    public static void main(String[] args) {
        String str= "amma";
    }


}

class ReadFile {
    public static void main(String[] args) {
        InputStream r = ReadFile.class.getResourceAsStream("C:\\Users\\rajahmed\\IdeaProjects\\Practice Core Java\\Resource\\TestFile");

        Scanner scan= new Scanner(r);

        while(scan.hasNext()){
            System.out.println(scan.toString());

        }

    }
}
