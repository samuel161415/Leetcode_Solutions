class Solution {
    public String breakPalindrome(String palindrome) {
        
        int[] chara=new int[26];
        for(int i=0;i<=25;i++){
            chara[i]=97+i;
        }
        if(palindrome.length()==1) return "";
        StringBuilder sb=new StringBuilder(palindrome);
        
        for(int i=0;i<palindrome.length();i++){
            if(!check(sb.toString())) break;
            int c=palindrome.charAt(i);
            if(c>97) {
                for(int j=0;j<c-97;j++){
                    char temp=(char)chara[j];
                    sb.setCharAt(i, temp);
                    boolean res=check(sb.toString());
                    if(!res) break;
                    else sb.setCharAt(i, palindrome.charAt(i));
                    
                }
                 }
            if(i==palindrome.length()-1&&check(sb.toString())){
                 sb.setCharAt(i, (char)(palindrome.charAt(i)+1));
            }
            
            
            
        }
        return sb.toString();
      
    }
      public boolean check(String str){
            int s=0;
            int e=str.length()-1;
            while(s<e){
                if(str.charAt(e)!=str.charAt(s)) return false;
                s++;
                e--;
            }
            return true;
        }
}

// idea is iterating over strings  and  replace the front char  with chacter starting from a to it. 
//If it generates non palindrome return else  go on until last element
// if last element can't generate non palindrome with char less than it, replace it with the next char i.e last+1 char
