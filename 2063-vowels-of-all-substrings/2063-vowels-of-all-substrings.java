class Solution {
    public long countVowels(String word) {
         long l=word.length();
        long temp=0;
        for(int i=0;i<l;i++){
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='o'||word.charAt(i)=='u'||word.charAt(i)=='i'){
               temp+=(l-i)*(i+1); 
            }     
        }
        return temp;
    }
}