​
The basic idea is we can buy , sell or cooldown . So initially we can only buy or cooldown, after buying we can only have selling or cooldown , after selling we only have cooldown . I used double array and the index of double arrays are used for idx and buying state. Every col have size two(0,1) : 0 indicates buying state and 1 selling state.

 if buying ==0 on buying state else if 1 in selling state

if we are on the postion of buying, choose max from buy and cooldown and if buy is choosen make buying to 1 to change state to selling and for both case increment idx by 1

 if are on the position of selling we can choose max of  selling and increment idx by 2 because after selling there 
 is cooldown and from  cooldown and just increment idx by 1 
