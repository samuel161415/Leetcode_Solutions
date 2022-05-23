
 import java.util.*;
class Solution {
       Hashtable<Integer,String> list=new Hashtable<>();
    public List<String> letterCombinations(String digits) {
         LinkedList<String> l=new LinkedList<>();
        int length=digits.length();
        if(length==0) return l;

        list.put(1,"");
        list.put(2, "abc");
        list.put(3, "def");
        list.put(4, "ghi");
        list.put(5, "jkl");
        list.put(6,"mno");
        list.put(7, "pqrs");
        list.put(8, "tuv");
        list.put(9, "wxyz");
    dfs(0,length,l,new StringBuilder(),digits);
    return l;
    }
    public void dfs(int pos,int length,LinkedList<String> l,StringBuilder sb,String D){
        System.out.println("sb "+sb.toString()+" D "+D);
  if(pos==length) l.add(sb.toString());
  
else {
   int value=Character.getNumericValue(D.charAt(pos));
   String characters=list.get(value);
    for(int i=0;i<characters.length();i++){
     
        dfs(pos+1,length,l,new StringBuilder(sb).append(characters.charAt(i)),D);
    }
}
}
    
} 