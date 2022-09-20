import java.util.*;
 
public class MakeProductEqualOne {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int k=0;k<t;k++){
            
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int[] dp=new int[n];
    
        for(int i=n-1;i>=0;i--){
            int sum=arr[i]+i+1;
            if(sum>n){
                dp[i]=arr[i];
            }
            else{
              while(sum<=n){
                  sum+=dp[sum-1];
              } 
              dp[i]=sum-(i+1);
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,dp[i]);
        }
        System.out.println(max);
        }
    } 
    
}
