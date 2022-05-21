class Solution {
    public List<String> generateParenthesis(int n) {
        String str="()";
        List<String> list=new ArrayList<>();
        combination("",0,0,list,n);
        return list;
    }
    public void combination(String s, int opening,int closing,List<String> list,int n){
        if(opening==n&&closing==n) {
            list.add(s);
            return;
        }
        if(opening<n) combination(s+"(",opening+1,closing,list,n);
         if(closing<opening)  combination(s+")",opening,closing+1,list,n);
    }
}