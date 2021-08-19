import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner file  = new Scanner(new File("C:\\Users\\Harjit singh\\Desktop\\githubcomd.txt"));
        String s;
        while (( s = file.nextLine())!= null){
            System.out.println(s);

        }
      


            file.close();

    }

}
