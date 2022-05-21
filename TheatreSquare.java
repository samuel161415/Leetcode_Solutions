import java.util.*;
public class codeforce {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int m=input.nextInt();
    int n=input.nextInt();
    int a=input.nextInt();
    int x=0,y=0;
    if(m%a!=0) x=m/a+1;
    else x=m/a;
    if(n%a!=0) y=n/a+1;
    else y=n/a;
    System.out.println((long)x*y);
   }
}
