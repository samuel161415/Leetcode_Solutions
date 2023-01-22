class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        res=[0]*len(nums)
        sIdx=len(nums)-(k%len(nums))
       
        for i in range(k%len(nums)):
            n=nums.pop(len(nums)-1)
            nums.insert(0,n)
