import java.util.*;
 
public class MakeProductEqualOne {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        long[] arr=new long[n];
        
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        
        long res=0;
        long countNegativeOne=0;
        long countZero=0;
       
         for(int i=0;i<n;i++){
         
           if(arr[i]<0){
               res+=Math.abs(arr[i]+1);
               countNegativeOne++;
           }
           else if (arr[i]==0){
               countZero++;
           }
           else{
               res+=Math.abs(arr[i]-1);
           }
             
         }
         
        if(countNegativeOne%2!=0){
          if(countZero>0){
             res+=countZero;
               }
          else res+=2;
           }
           else{
               res+=countZero;
           }
    
         System.out.println(res);
            }
            
            }
    
