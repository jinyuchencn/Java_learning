package GetLadder;

import java.io.*;
public class Input {
    public static void main(String [] args) {
        try {

            InputStream is = new FileInputStream("GetLadder/dictionary.txt");
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

