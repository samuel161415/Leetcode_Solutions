class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        nums.sort()
        dict={}
        res=[0]*2
        
        for i in nums:
            if dict.get(i) is not None:
                dict[i]+=1
            else :
                dict[i]=1

        for i in range(1,len(nums)+1):
            if dict.get(i) is None:
                res[1]=i # updating second value of array that contians the missing number
            
            elif dict[i]==2:
                res[0]=i # updating the first element of the array that contains duplicated number
            

        return res
