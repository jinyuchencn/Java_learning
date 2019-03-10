import java.util.Scanner;
import java.io.*;
public class Input {
    public static void main(String [] args) {
        try {
//            byte bWrite[] = { 11, 21, 3, 40, 5 };
//            OutputStream os = new FileOutputStream("dictionary.txt");
//            for (int x = 0; x < bWrite.length; x++) {
//                os.write(bWrite[x]); // writes the bytes
//            }
//            os.close();

            InputStream is = new FileInputStream("dictionary.txt");
            int size = 20;
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String txtLine = null;
            while((txtLine=br.readLine())!=null){
                System.out.println(txtLine);
//                set.add(txtLine);
            }
            is.close();
            br.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}

