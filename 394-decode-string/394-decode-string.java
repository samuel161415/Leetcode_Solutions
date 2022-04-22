class Solution {
    public String decodeString(String s) {
      Stack<String> stack1 = new Stack<>();   // string before '['
     Stack<Integer> stack2 = new Stack<>();  // count before '['
    
    int count = 0;
    String res = "";
    
    for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
  // digits
        if(ch >= '0' && ch <= '9'){
            count = count * 10 + ch - '0';
        }
        else if(ch == '['){
            stack2.push(count);
            count = 0;
            
            stack1.push(res);
            res = "";
        }
        else if(ch == ']'){
            String temp = stack1.pop();
            int times = stack2.pop();
            
            while(times-- > 0){
                temp += res;
            }
            
            res = temp;
        }
  // letters
  else{
            res += Character.toString(ch);
        }
    }
    return res;
        
    }
    
}