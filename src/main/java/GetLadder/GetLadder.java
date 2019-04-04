package GetLadder;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


import java.util.LinkedList;
import java.util.Queue;



public class GetLadder {
    public HashMap<String,String> GetPathMap(String beginWord, String endWord, Set<String> wordDict) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer(beginWord);
        HashMap<String,Integer> maps = new HashMap<String,Integer>();
        HashMap<String,String> path =new HashMap<String, String>();
        maps.put(beginWord,1);
        path.put(beginWord,"None");
        if(wordDict.contains(beginWord))
            wordDict.remove(beginWord);
        while(!queue.isEmpty()){
            String top = queue.poll();
            int length = top.length();
            StringBuilder builder;

            int level = maps.get(top);
            for(int i = 0;i<length;i++){
                builder = new StringBuilder(top);
                for(char c = 'a';c<='z';c++){
                    builder.setCharAt(i,c);
                    String tmpStr = builder.toString();
                    if(tmpStr.equals(top))
                        continue;
                    if(tmpStr.equals(endWord)){
                        maps.put(tmpStr,level+1);
                        path.put(endWord,top);
                        return path;
                    }
                    if(wordDict.contains(tmpStr)){
                        queue.offer(tmpStr);
                        wordDict.remove(tmpStr);
                        maps.put(tmpStr,level+1);
                        path.put(tmpStr,top);
                    }
                }
            }
        }
        return path;
    }
    public String Ladder(String beginWord, String endWord){
        return GetLadderStr(beginWord,endWord, "D:\\github_code\\Java_learning\\src\\main\\java\\GetLadder\\dictionary.txt");
    }
    public  String GetLadderStr(String beginWord, String endWord, String filename){
//        Solution yuanlairuci = new Solution();
        Set<String> wordDict=GetSet(filename);
        HashMap<String,String> Path=GetPathMap(beginWord,endWord,wordDict);

        StringBuilder builder=null;
        String tmpStr=endWord;
        builder = new StringBuilder(tmpStr);
//        builder.append("<--");
        if (Path.get(tmpStr)==null){
            return  "No way!";
        }
        while (tmpStr!=beginWord ){
            builder.append("<--");
            tmpStr=Path.get(tmpStr);
            builder.append(tmpStr);
//            builder.append("<--");
        }
//        builder.append(tmpStr);
        String result = builder.toString();
        return result;

    }
    public Set<String> GetSet(String filename){
        Set<String> set= new TreeSet<String>();
        try {
            File file = new File(filename);
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
            System.out.print("Exception!!!");
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
        String Ladder=abc.Ladder(beginWord,endWord);
        System.out.print(Ladder);
    }
}
