import java.util.*;
 
public class MakeProductEqualOne {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int first=0;
        int second=1;
        int added=0;
        while(second<n){
            int sum=arr[first]+arr[second];
            if(sum<k){
                arr[second]+=k-sum;
                added+=k-sum;
            }
            first++;
            second++;
        }
        System.out.println(added);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    } 
    
}
