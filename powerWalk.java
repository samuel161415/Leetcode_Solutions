import java.util.HashMap;
import java.util.Scanner;
 
public class powerWalking {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for(int i=0;i<t;i++){
            
            HashMap<Integer,Integer> map=new HashMap<>();
 
            int n=input.nextInt();
             for(int j=0;j<n;j++){
                int temp=input.nextInt();
                map.put(temp,map.getOrDefault(temp, 0)+1);
             }
             int size=map.size();
             for(int k=1;k<=n;k++){
                if(k<=size) System.out.print(size+" ");
                else System.out.print(k+" ");
             }
             System.out.println();
        }
    }
}
// Idea is to count different unique values and return it if k is less than or equal to total no of unique
// else return the totalNo of unique values
