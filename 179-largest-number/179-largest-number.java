class Solution {
    public String largestNumber(int[] nums) {
        String[] strArr=new String[nums.length];
        
        for(int i=0;i<nums.length;i++){
        strArr[i]=Integer.toString(nums[i]);
        }
       
     Arrays.sort(strArr,(a,b)->{return (b+a).compareTo(a+b);});
         String res="";
        for(int i=0;i<strArr.length;i++){
        res+=strArr[i];
        }
        if(res.charAt(0)=='0') return "0";
        return res;
    }
}