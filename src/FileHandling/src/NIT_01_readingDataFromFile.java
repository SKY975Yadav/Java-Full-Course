package FileHandling.src;

import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class NIT_01_readingDataFromFile {
    public static void main(String[] args) throws IOException, FileNotFoundException, PrinterException, PrintException {
        Scanner sc = new Scanner(System.in);

        //create a file
//        File fl1 = new File("Sai.txt");
//        fl1.createNewFile();
        //write a file
//        FileWriter fw = new FileWriter("abc.txt");
//        fw.write("\n My name is sai krishna");
//        fw.close();
        //read file
//        File fs = new File("Sai.txt");
//        Scanner sc1 = new Scanner(fs);
//        while ((sc1.hasNextLine())){
//            String line= sc1.nextLine();
//            System.out.println(line);
//        }
//        sc.close();
        //delete a file
//        File fs = new File("abc.txt");
//        fs.delete();
//        int i =5;
//        String st="";
//        for(int j =1;j<11;j++){
//            st += i + "X" +j +"="+ i*j;
//            st += "\n";
//        }
//        FileWriter fw = new FileWriter("MultiTable.txt");
//        fw.write(st);
//        fw.write("\nHi i am printed 5 mul table");
//        fw.close();
//        */
//        InputStream is = new FileInputStream("download.jfif");
//        OutputStream os = new FileOutputStream("sai.jfif");
//        int data,d1;
//        while ((data=is.read())!=-1){
//            os.write(data);
//        }
//        InputStream is1 = new FileInputStream("Sai.txt");
//        while((d1=is1.read())!=-1){
//            System.out.print((char)d1);
//        }
//        PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
//        pras.add(new Copies(1));
//        PrintService pss[] = PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.GIF, pras);
//        if (pss.length == 0)
//            throw new RuntimeException("No printer services available.");
//        PrintService ps = pss[0];
//        System.out.println("Printing to " + ps);
//        DocPrintJob job = ps.createPrintJob();
//        FileInputStream fin = new FileInputStream("download.jfif");
//        Doc doc = new SimpleDoc(fin, DocFlavor.INPUT_STREAM.GIF, null);
//        job.print(doc, pras);
//        fin.close();
//        Queue<Integer> q = new LinkedList<>();
//        q.add(1);
//        q.add(3);
//        q.add(3);
//        q.add(3);
//        q.add(2);
       // System.out.println(q.element());
//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.peek());
        //
//        System.out.println(q);
//        System.out.println(st);
//        Deque<Integer> dq = new ArrayDeque<>();
//        dq.offerFirst(3);
//        dq.offerFirst(5);
//        dq.offer(15);
//        dq.pop();
//       // dq.poll();
//        //dq.pollLast();
//        System.out.println(dq);

    }
}