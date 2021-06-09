import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String []args){
        try{
            BufferedReader br = new BufferedReader(new FileReader
                    ("file name")); // add your file location in your system
            String s;
            while ((s = br.readLine())!= null){
                System.out.println(s);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
