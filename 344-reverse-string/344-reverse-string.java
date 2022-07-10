class Solution {
    public void reverseString(char[] s) {
      // char temp=' ';
        
        helper(s,' ',0,s.length-1);
    }
    public void helper(char[] s,char temp,int f,int e){
        if(f>=e) return;
        temp=s[f];
        s[f]=s[e];
        s[e]=temp;
        helper(s,' ',f+1,e-1);
    }
}