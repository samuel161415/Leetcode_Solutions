class Solution {
    public String sortSentence(String s) {
     String str=s.replaceAll(" ","");
        HashMap<Integer,String> hash=new HashMap<>();
        StringBuilder concat=new StringBuilder();
        int max=0;
       for(int i=0;i<str.length();i++){         
           if(!Character.isDigit(str.charAt(i))){
           concat.append(str.charAt(i));  }
           else{
                max= max<Character.getNumericValue(str.charAt(i))?Character.getNumericValue(str.charAt(i)):max;
                hash.put(Character.getNumericValue(str.charAt(i)),concat.toString());
                concat.setLength(0); } }
       concat.setLength(0); 
      for(int i=1;i<=max;i++){
          concat.append(hash.get(i)+" "); }
      return concat.deleteCharAt(concat.length()-1).toString();
         }}