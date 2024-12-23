import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class NIT_01_readingDataFromFile {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        FileInputStream fis = new FileInputStream("abc.txt");
        int data =fis.read();
        System.out.println(data);
        fis.close();
    }
}
