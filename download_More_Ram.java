import java.util.Arrays;
import java.util.Scanner;
 
public class moreRam {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for(int i=0;i<t;i++){
          int n=input.nextInt();
          int k=input.nextInt();
          int[] ramSoft=new int[n];
          int[] addRam=new int[n];
           for(int j=0;j<n;j++){
             ramSoft[j]=input.nextInt();
           }
           for(int j=0;j<n;j++){
            addRam[j]=input.nextInt();
          }
          int[][] arr=new int[n][2];
          for(int j=0;j<n;j++){
            arr[j][0]=ramSoft[j];
            arr[j][1]=addRam[j];
          }
          Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
          int totalSum=k;
          for(int j=0;j<n;j++){
            if(arr[j][0]<=totalSum) totalSum+=arr[j][1];
          }
          System.out.println(totalSum);
        }
 
    }
}
// It is gready and idea is sort by the array of the first and check if the capacity is less than or equal to k
// if so add else return
