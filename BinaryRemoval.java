import java.util.*;
 
public class MakeProductEqualOne {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++){
            
            int nz=0; // number of zero
            int no=0; // number of one
            
            HashSet<Integer> set=new HashSet<>();
            String str=sc.next();
            
            int f=0;
            int s=1;
            boolean res=true;
            while(s<str.length()){
                int first=Character.getNumericValue(str.charAt(f));
                int second=Character.getNumericValue(str.charAt(s));
                if(first>second){
                    if(no>0) {
                        if(set.contains(s-1)){
                            res=false;
                            break;
                        }
                        set.add(s);
                        s++;
                    }
                    else{
                        if(set.contains(f-1)){
                            res=false;
                            break;
                        }
                            set.add(f);
                            f=s;
                            s++;
                    }
            
                }
                else{
                    if(first==0) nz++;
                    else no++;
                    f=s;
                    s++;
                }
                
            }
            if(res) System.out.println("YES");
            else System.out.println("NO");
            
            
        } 
        
    } 
    
}

    
