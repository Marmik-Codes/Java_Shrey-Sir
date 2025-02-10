package file_handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWritehandler {
    public void writFile(String filename) throws IOException {
        Scanner sc = new Scanner(System.in);

        FileWriter fout = new FileWriter(filename + " .txt");
        System.out.println("Enter the data you want to write into " + filename);
        String data = sc.nextLine();

        fout.write(data);
        System.out.println("\n\n File written successfully...");
        fout.close();
    }
    public  void readfile(String filename) throws  IOException{

        FileReader fin = new FileReader(filename + " .txt");
        int i =0;

        while ( (i = fin.read()) != -1) System.out.print((char) i);

        System.out.println("\n\nEnd of file...");
        fin.close();
    }
}
