class Solution {
    public int minimumBuckets(String street) {
        int count=0;
        if(street.equals("H")||street.contains("HHH")||street.startsWith("HH")||street.endsWith("HH")) return -1;
        
        String replace=street.replace("H.H","H"); // H.H uses one bucket as H alone so concider it as one
        for(int i=0;i<replace.length();i++){
            if(replace.charAt(i)=='H') count++;
        }
        return count;
    }
}