import java.util.Arrays;
import java.util.Scanner;
 
public class qualityQuantity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int n=sc.nextInt();
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            Arrays.sort(arr);
          
            int start=0, end=n-1;
            int CR=1,CB=1;
            long SR=arr[end],SB=arr[start];
            boolean res=false;
            while(start<end){
             if(CB==CR&&SR>=SB){
                CB++;
                start++;
                SB+=arr[start];
             }
             else if(CB>CR&&SR<=SB){
                CR++;
                end--;
                SR+=arr[end];
             }
             else if(CB>CR&&SR>SB){
                res=true;
                break;
             }
            }
            if(res) System.out.println("YES");
            else System.out.println("NO");
 
        }
    }
    
}
