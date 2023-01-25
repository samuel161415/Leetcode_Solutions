class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        first=0 
        second=1
        while second<len(nums):
            if nums[first]==nums[second]:
                nums[first]*=2
                nums[second]=0
            first+=1
            second+=1
        
        f=0
        s=1
        while s<len(nums):
            if nums[f]==0:
                if nums[s]!=0:
                    nums[f],nums[s]=nums[s],nums[f]
                    f+=1
                s+=1
            else:
                f+=1
                s+=1
        return nums 
