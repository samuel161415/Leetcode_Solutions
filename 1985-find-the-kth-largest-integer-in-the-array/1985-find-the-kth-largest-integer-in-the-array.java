class Solution {
    public String kthLargestNumber(String[] nums, int k) {
    
        Arrays.sort(nums,(a,b) -> {return b.length()==a.length()?b.compareTo(a):b.length()-a.length();});
            return nums[k-1];
    
    }
}