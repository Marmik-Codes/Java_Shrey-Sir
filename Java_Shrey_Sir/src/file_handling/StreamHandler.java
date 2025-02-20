package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamHandler {
    public  void writefile(String filename) throws IOException {
        Scanner sc = new Scanner(System.in);

        FileOutputStream fout = new FileOutputStream(filename);
        System.out.println("Enter the data you want to write into " + filename);
        byte[] data = sc.nextLine().getBytes();

        fout.write(data);
        System.out.println("\n\nFile written successfully...");
        fout.close();
    }
    public  void readfile(String filename) throws  IOException{

        FileInputStream fin = new FileInputStream(filename);
        int i = 0;
        while ((i = fin.read()) != -1) System.out.print((char)i);
        System.out.println("\n\n End of File...!");
        fin.close();
    }
}
