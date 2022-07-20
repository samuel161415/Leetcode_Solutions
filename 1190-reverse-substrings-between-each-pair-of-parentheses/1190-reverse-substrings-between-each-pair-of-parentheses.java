class Solution {
    public String reverseParentheses(String s) {
    Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)!=')') stack.push(s.charAt(i));
            else{
                String str="";
                while(stack.peek()!='(') {
                    str+=stack.pop();
                }
                stack.pop(); // to remove the parenthesis
                for(int j=0;j<str.length();j++){
                    stack.push(str.charAt(j));
                }
            }
        }
        String res="";
        while(!stack.isEmpty()){
           res=stack.pop()+res;
        }
        return res;
    }
}