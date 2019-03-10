import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;
public class GetLadder {
    public  String GetLadder(String beginWord, String endWord, String filename){
        Solution yuanlairuci=new Solution();
        Set<String> wordDict=GetSet(filename);
        HashMap<String,String> Path=yuanlairuci.GetPathMap(beginWord,endWord,wordDict);

        StringBuilder builder=null;
        String tmpStr=endWord;
        builder = new StringBuilder(tmpStr);
        builder.append("<--");
        while (tmpStr!=beginWord && tmpStr!="None"){
            tmpStr=Path.get(tmpStr);
            builder.append(tmpStr);
            builder.append("<--");
        }
        builder.append(tmpStr);
        String result = builder.toString();
        return result;
//        Iterator<Map.Entry<String, String>> iterator = Path.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> entry = iterator.next();
//            entry.getKey();
//            entry.getValue();
//        }


    }
    public Set<String> GetSet(String filename){
        Set<String> set= new TreeSet<String>();
        try {
            File file = new File("dictionary.txt");
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String txtLine = null;
//            StringBuilder builder=null;
            while((txtLine=br.readLine())!=null) {

//                System.out.println(txtLine);
                set.add(txtLine);
            }
            br.close();

        }catch (IOException e)
        {
            System.out.print("Exception");
        }

        return set;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("beginWord:");
        String beginWord = sc.nextLine();
        System.out.println("endWord:");
        String endWord = sc.nextLine();

        GetLadder abc=new GetLadder();
//        Set<String> wordDict=abc.GetSet("dictionary.txt");
        String Ladder=abc.GetLadder(beginWord,endWord,"dictionary.txt");
        System.out.print(Ladder);
    }
}
