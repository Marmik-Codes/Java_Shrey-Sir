package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TransferImage {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        int ctr = 0;

        try {
            fin = new FileInputStream("input.png");
            fout = new FileOutputStream("output.png");
            int c;

            while ((c = fin.read()) != -1 ){
                fout.write(c);
                ctr++;

            }

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if (fin != null) fin.close();
                if (fin != null) fin.close();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
