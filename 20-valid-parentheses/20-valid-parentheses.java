class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
         if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
             stack.push(s.charAt(i));
             System.out.println(stack);
         }
         else{
             
            if(!stack.isEmpty()){
                char c=stack.peek();
                if(c=='('&&s.charAt(i)!=')'||c=='['&&s.charAt(i)!=']'||c=='{'&&s.charAt(i)!='}') return false;
                else stack.pop();
            }
             else return false;
         }
        }
        if(stack.size()!=0) return false;
        return true;
    }
}