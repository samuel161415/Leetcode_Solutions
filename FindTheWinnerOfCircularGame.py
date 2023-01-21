class Solution:
    def findTheWinner(self, n: int, k: int) -> int:
        l=[i for i in range(1,n+1)]
        return self.winner(l,k,0)
      

    def winner(self,l:list,k:int,start:int)-> int:
        if len(l)==1:
            return l[0]
        r=(start+k-1)%len(l)
        l.pop(r)
        start=r
        return self.winner(l,k,start)
