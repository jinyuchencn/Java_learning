import java.util.*;
public class Solution {
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
}